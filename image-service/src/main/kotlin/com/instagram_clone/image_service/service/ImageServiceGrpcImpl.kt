package com.instagram_clone.image_service.service

import com.instagram_clone.image_service.CreateImageErrorStatus
import com.instagram_clone.image_service.CreateImageRequest
import com.instagram_clone.image_service.CreateImageResponse
import com.instagram_clone.image_service.ImagesGrpc.ImagesImplBase
import com.instagram_clone.image_service.config.AppConfig
import com.instagram_clone.image_service.data.fromImageMeta
import com.instagram_clone.image_service.data.mapImageMeta
import com.instagram_clone.image_service.exception.CaptionTooLongException
import io.grpc.stub.StreamObserver
import io.vertx.core.buffer.Buffer
import io.vertx.core.file.AsyncFile
import io.vertx.core.file.FileSystem
import io.vertx.core.file.impl.AsyncFileImpl
import io.vertx.core.file.impl.FileSystemImpl
import io.vertx.kotlin.core.Vertx
import java.awt.image.BufferedImage
import java.awt.image.DataBufferByte
import java.io.ByteArrayInputStream
import java.nio.ByteBuffer
import javax.imageio.ImageIO

/**
 * Class implementing the image_service.proto Image service interface.
 */
class ImageServiceGrpcImpl(
  private val service: ImageMetaService,
  private val vertx: io.vertx.core.Vertx
) : ImagesImplBase() {

  /**
   * Application configuration values
   */
  private val appConfig = AppConfig.getInstance()

  /**
   * Create a new image based on given meta-data and image byte data.
   */
  override fun createImage(request: CreateImageRequest, responseObserver: StreamObserver<CreateImageResponse>) {
    val caption = request.caption
    val creatorId = request.creatorId
    val bytes = request.data.toByteArray()
    val buf = ImageIO.read(ByteArrayInputStream(bytes))

    // TODO: Check bytes size, return error if too large image (or scale down the image)
    if (buf == null) {
      responseObserver.onNext(
        CreateImageResponse.newBuilder()
          .setError(CreateImageErrorStatus.INVALID_DATA)
          .build()
      )
      responseObserver.onCompleted()
      return
    }

    val meta = try {
      service.saveImageMeta(mapImageMeta(caption, creatorId, buf))
    } catch (e: CaptionTooLongException) {
      responseObserver.onNext(
        CreateImageResponse.newBuilder()
          .setError(CreateImageErrorStatus.CAPTION_TOO_LONG)
          .build()
      )
      responseObserver.onCompleted()
      return
    }

    vertx
      .fileSystem()
      .writeFile("${appConfig.imageDataDir}/${meta.id}", Buffer.buffer(bytes)) {
        val builder = CreateImageResponse.newBuilder()
        if (it.succeeded()) {
          builder.image = fromImageMeta(meta)
        } else {
          builder.error = CreateImageErrorStatus.CREATE_IMAGE_SERVER_ERROR
        }
        responseObserver.onNext(
          builder.build()
        )
        responseObserver.onCompleted()
      }
  }

}
