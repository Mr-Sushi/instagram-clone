package com.instagram_clone.image_service.service

import com.google.protobuf.ByteString
import com.instagram_clone.image_service.*
import com.instagram_clone.image_service.ImagesGrpc.ImagesImplBase
import com.instagram_clone.image_service.data.ImageMeta
import com.instagram_clone.image_service.data.fromImageMeta
import com.instagram_clone.image_service.exception.CaptionTooLongException
import com.instagram_clone.image_service.exception.InvalidDataException
import com.instagram_clone.image_service.exception.NotFoundException
import com.instagram_clone.image_service.util.ImageRecorder
import io.grpc.stub.StreamObserver
import io.vertx.core.logging.LoggerFactory
import kotlin.math.min

// Chunk size in bytes
private const val CHUNK_SIZE = 1024 * 16

/**
 * Class implementing the image_service.proto Image service interface.
 */
class ImageServiceGrpcImpl(
  private val metaService: ImageMetaService,
  private val fileService: ImageFileService,
  private val vertx: io.vertx.core.Vertx
) : ImagesImplBase() {

  private val logger = LoggerFactory.getLogger("ImageServiceGrpcImpl")

  /**
   * Create an image based on client-streaming chunks.
   */
  override fun createImage(responseObserver: StreamObserver<CreateImageResponse>): StreamObserver<CreateImageRequest> {
    val recorder = ImageRecorder()
    val builder = CreateImageResponse.newBuilder()
    return object: StreamObserver<CreateImageRequest> {

      override fun onNext(req: CreateImageRequest) {
        recorder.takeChunk(req)
      }

      override fun onError(e: Throwable) {
        logger.error("Error during create image stream", e)
        // TODO: Cleanup or something?
      }

      override fun onCompleted() {
        val meta = try {
          recorder.toImageMeta()
        } catch (e: Exception) {
          logger.warn(e.message)

          responseObserver.onNext(
            builder
              .setError(
                when (e) {
                  is InvalidDataException -> CreateImageErrorStatus.INVALID_DATA
                  is CaptionTooLongException -> CreateImageErrorStatus.CAPTION_TOO_LONG
                  else -> CreateImageErrorStatus.CREATE_IMAGE_SERVER_ERROR
                }
              )
              .build()
          )
          responseObserver.onCompleted()
          return
        }
        val bytes = recorder.chunks!!.toByteArray()

        metaService.saveImageMeta(meta)
          .onSuccess { meta ->
            fileService.saveImageFile(meta.id, bytes)
              .onSuccess {
                builder.image = fromImageMeta(meta)
                responseObserver.onNext(builder.build())
                responseObserver.onCompleted()
              }
              .onFailure { e ->
                logger.error("Failed to persist the image on disk: ", e)
                builder.error = CreateImageErrorStatus.CREATE_IMAGE_SERVER_ERROR

                // We don't have to wait for this before returning response
                metaService.deleteImage(meta.id)
                  .onSuccess {
                    logger.info("Removed metadata of image ${meta.id} as a result of failed file disk save")
                  }
                  .onFailure {  e ->
                    logger.error("Failed to remove metadata of image ${meta.id}:", e)
                  }

                responseObserver.onNext(builder.build())
                responseObserver.onCompleted()
              }
          }
          .onFailure { e ->
            val error = when (e) {
              is CaptionTooLongException -> CreateImageErrorStatus.CAPTION_TOO_LONG
              else -> {
                logger.error("Failed persist image meta data into database:", e)
                CreateImageErrorStatus.CREATE_IMAGE_SERVER_ERROR
              }
            }
            responseObserver.onNext(
              builder
                .setError(error)
                .build()
            )
            responseObserver.onCompleted()
          }
      }

    }
  }


  /**
   * Get image metadata based on image ID.
   */
  override fun getImage(request: GetImageRequest, responseObserver: StreamObserver<GetImageResponse>) {
    val imageId = request.imageId
    val builder = GetImageResponse.newBuilder()
    metaService.getImageMeta(imageId)
      .onSuccess { meta ->
        if (meta != null) {
          builder.image  = fromImageMeta(meta)
        } else {
          builder.error = GetImageErrorStatus.IMAGE_NOT_FOUND
        }
        responseObserver.onNext(builder.build())
        responseObserver.onCompleted()
      }
      .onFailure { e ->
        logger.error("Failure on fetch image meta for id $imageId:", e)
        builder.error = GetImageErrorStatus.GET_IMAGE_SERVER_ERROR
        responseObserver.onNext(builder.build())
        responseObserver.onCompleted()
      }
  }

  /**
   * Delete an image based on given image ID.
   */
  override fun deleteImage(request: DeleteImageRequest, responseObserver: StreamObserver<DeleteImageResponse>) {
    val imageId = request.id
    val builder = DeleteImageResponse.newBuilder()
    metaService.deleteImage(imageId)
      .compose { fileService.deleteImageFile(imageId) }
      .onSuccess {
        builder.status = DeleteImageStatus.OK
        responseObserver.onNext(builder.build())
        responseObserver.onCompleted()
      }
      .onFailure { e ->
        builder.status = when (e) {
          is NotFoundException -> DeleteImageStatus.DELETABLE_NOT_FOUND
          else -> {
            logger.error("Delete image $imageId failed: ", e)
            DeleteImageStatus.DELETE_IMAGE_SERVER_ERROR
          }
        }
        responseObserver.onNext(builder.build())
        responseObserver.onCompleted()
      }
  }

  /**
   * Return raw image data and it's type to the caller.
   */
  override fun getImageData(request: GetImageDataRequest, responseObserver: StreamObserver<GetImageDataResponse>) {
    val imageId = request.imageId
    var tmpMeta: ImageMeta? = null
    metaService.getImageMeta(imageId)
      .compose { m ->
        if (m == null) {
          throw NotFoundException("No image meta found with id $imageId")
        }
        tmpMeta = m
        fileService.getImageFile(imageId)
      }
      .onSuccess { data ->
        val meta = tmpMeta!!

        responseObserver.onNext(
          GetImageDataResponse
            .newBuilder()
            .setImageType(
              when (meta.mimeType) {
                "image/png" -> ImageType.PNG
                else -> ImageType.JPG
              }
            )
            .build()
        )

        val chunks = chunkBytes(ByteString.copyFrom(data))
        for (chunk in chunks) {
          responseObserver.onNext(
            GetImageDataResponse
              .newBuilder()
              .setData(chunk)
              .build()
          )
        }

        responseObserver.onCompleted()
      }
      .onFailure { e ->
        logger.error("Unable to fetch image: ", e)

        responseObserver.onNext(
          GetImageDataResponse
            .newBuilder()
            .setError(
              when (e) {
                is NotFoundException -> GetImageErrorStatus.IMAGE_NOT_FOUND
                else -> {
                  logger.error("Unable to fetch image: ", e)
                  GetImageErrorStatus.GET_IMAGE_SERVER_ERROR
                }
              }
            )
            .build()
        )
        responseObserver.onCompleted()
      }
  }

  /**
   * Add/remove a like to/of an image
   */
  override fun likeImage(request: LikeImageRequest, responseObserver: StreamObserver<LikeImageResponse>) {
    val imageId = request.imageId
    val userId = request.userId
    val unlike = request.unlike

    val future = when (unlike) {
      false -> metaService.likeImage(imageId, userId)
      else -> metaService.unlikeImage(imageId, userId)
    }
    future
      .onSuccess {
        responseObserver.onNext(
          LikeImageResponse.newBuilder()
            .setStatus(LikeImageResponseStatus.LIKE_OK)
            .build()
        )
        responseObserver.onCompleted()
      }
      .onFailure { e ->
        responseObserver.onNext(
          LikeImageResponse.newBuilder()
            .setStatus(when (e) {
              is NotFoundException -> LikeImageResponseStatus.IMAGE_NOT_FOUND_ERROR
              else -> {
                logger.error("Failed to ${if (unlike) "unlike" else "like"} image $imageId", e)
                LikeImageResponseStatus.LIKE_IMAGE_SERVER_ERROR
              }
            })
            .build()
        )
        responseObserver.onCompleted()
      }
  }

  /**
   * Slice the given [bytes] into chunks of size [CHUNK_SIZE].
   */
  private fun chunkBytes(bytes: ByteString): List<ByteString> {
    val list = mutableListOf<ByteString>()
    val size = bytes.size()
    for (i in 0 until size step CHUNK_SIZE) {
      val end = min(size, i + CHUNK_SIZE)
      list.add(bytes.substring(i, end))
    }
    return list.toList()
  }
}
