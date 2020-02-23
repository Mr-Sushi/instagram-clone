package com.instagram_clone.comment_service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Comment service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: comment_service.proto")
public final class CommentsGrpc {

  private CommentsGrpc() {}

  private static <T> io.grpc.stub.StreamObserver<T> toObserver(final io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler) {
    return new io.grpc.stub.StreamObserver<T>() {
      private volatile boolean resolved = false;
      @Override
      public void onNext(T value) {
        if (!resolved) {
          resolved = true;
          handler.handle(io.vertx.core.Future.succeededFuture(value));
        }
      }

      @Override
      public void onError(Throwable t) {
        if (!resolved) {
          resolved = true;
          handler.handle(io.vertx.core.Future.failedFuture(t));
        }
      }

      @Override
      public void onCompleted() {
        if (!resolved) {
          resolved = true;
          handler.handle(io.vertx.core.Future.succeededFuture());
        }
      }
    };
  }

  public static final String SERVICE_NAME = "Comment.Comments";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.instagram_clone.comment_service.CreateCommentRequest,
      com.instagram_clone.comment_service.CreateCommentResponse> getCreateCommentMethod;

  public static io.grpc.MethodDescriptor<com.instagram_clone.comment_service.CreateCommentRequest,
      com.instagram_clone.comment_service.CreateCommentResponse> getCreateCommentMethod() {
    io.grpc.MethodDescriptor<com.instagram_clone.comment_service.CreateCommentRequest, com.instagram_clone.comment_service.CreateCommentResponse> getCreateCommentMethod;
    if ((getCreateCommentMethod = CommentsGrpc.getCreateCommentMethod) == null) {
      synchronized (CommentsGrpc.class) {
        if ((getCreateCommentMethod = CommentsGrpc.getCreateCommentMethod) == null) {
          CommentsGrpc.getCreateCommentMethod = getCreateCommentMethod = 
              io.grpc.MethodDescriptor.<com.instagram_clone.comment_service.CreateCommentRequest, com.instagram_clone.comment_service.CreateCommentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Comment.Comments", "CreateComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.instagram_clone.comment_service.CreateCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.instagram_clone.comment_service.CreateCommentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CommentsMethodDescriptorSupplier("CreateComment"))
                  .build();
          }
        }
     }
     return getCreateCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.instagram_clone.comment_service.GetCommentRequest,
      com.instagram_clone.comment_service.GetCommentResponse> getGetCommentMethod;

  public static io.grpc.MethodDescriptor<com.instagram_clone.comment_service.GetCommentRequest,
      com.instagram_clone.comment_service.GetCommentResponse> getGetCommentMethod() {
    io.grpc.MethodDescriptor<com.instagram_clone.comment_service.GetCommentRequest, com.instagram_clone.comment_service.GetCommentResponse> getGetCommentMethod;
    if ((getGetCommentMethod = CommentsGrpc.getGetCommentMethod) == null) {
      synchronized (CommentsGrpc.class) {
        if ((getGetCommentMethod = CommentsGrpc.getGetCommentMethod) == null) {
          CommentsGrpc.getGetCommentMethod = getGetCommentMethod = 
              io.grpc.MethodDescriptor.<com.instagram_clone.comment_service.GetCommentRequest, com.instagram_clone.comment_service.GetCommentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Comment.Comments", "GetComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.instagram_clone.comment_service.GetCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.instagram_clone.comment_service.GetCommentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CommentsMethodDescriptorSupplier("GetComment"))
                  .build();
          }
        }
     }
     return getGetCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.instagram_clone.comment_service.DeleteCommentRequest,
      com.instagram_clone.comment_service.DeleteCommentResponse> getDeleteCommentMethod;

  public static io.grpc.MethodDescriptor<com.instagram_clone.comment_service.DeleteCommentRequest,
      com.instagram_clone.comment_service.DeleteCommentResponse> getDeleteCommentMethod() {
    io.grpc.MethodDescriptor<com.instagram_clone.comment_service.DeleteCommentRequest, com.instagram_clone.comment_service.DeleteCommentResponse> getDeleteCommentMethod;
    if ((getDeleteCommentMethod = CommentsGrpc.getDeleteCommentMethod) == null) {
      synchronized (CommentsGrpc.class) {
        if ((getDeleteCommentMethod = CommentsGrpc.getDeleteCommentMethod) == null) {
          CommentsGrpc.getDeleteCommentMethod = getDeleteCommentMethod = 
              io.grpc.MethodDescriptor.<com.instagram_clone.comment_service.DeleteCommentRequest, com.instagram_clone.comment_service.DeleteCommentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Comment.Comments", "DeleteComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.instagram_clone.comment_service.DeleteCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.instagram_clone.comment_service.DeleteCommentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CommentsMethodDescriptorSupplier("DeleteComment"))
                  .build();
          }
        }
     }
     return getDeleteCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.instagram_clone.comment_service.GetCommentsByTagRequest,
      com.instagram_clone.comment_service.GetCommentsByTagResponse> getGetCommentsByTagMethod;

  public static io.grpc.MethodDescriptor<com.instagram_clone.comment_service.GetCommentsByTagRequest,
      com.instagram_clone.comment_service.GetCommentsByTagResponse> getGetCommentsByTagMethod() {
    io.grpc.MethodDescriptor<com.instagram_clone.comment_service.GetCommentsByTagRequest, com.instagram_clone.comment_service.GetCommentsByTagResponse> getGetCommentsByTagMethod;
    if ((getGetCommentsByTagMethod = CommentsGrpc.getGetCommentsByTagMethod) == null) {
      synchronized (CommentsGrpc.class) {
        if ((getGetCommentsByTagMethod = CommentsGrpc.getGetCommentsByTagMethod) == null) {
          CommentsGrpc.getGetCommentsByTagMethod = getGetCommentsByTagMethod = 
              io.grpc.MethodDescriptor.<com.instagram_clone.comment_service.GetCommentsByTagRequest, com.instagram_clone.comment_service.GetCommentsByTagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Comment.Comments", "GetCommentsByTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.instagram_clone.comment_service.GetCommentsByTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.instagram_clone.comment_service.GetCommentsByTagResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CommentsMethodDescriptorSupplier("GetCommentsByTag"))
                  .build();
          }
        }
     }
     return getGetCommentsByTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.instagram_clone.comment_service.GetCommentsByUserTagRequest,
      com.instagram_clone.comment_service.GetCommentsByUserTagResponse> getGetCommentsByUserTagMethod;

  public static io.grpc.MethodDescriptor<com.instagram_clone.comment_service.GetCommentsByUserTagRequest,
      com.instagram_clone.comment_service.GetCommentsByUserTagResponse> getGetCommentsByUserTagMethod() {
    io.grpc.MethodDescriptor<com.instagram_clone.comment_service.GetCommentsByUserTagRequest, com.instagram_clone.comment_service.GetCommentsByUserTagResponse> getGetCommentsByUserTagMethod;
    if ((getGetCommentsByUserTagMethod = CommentsGrpc.getGetCommentsByUserTagMethod) == null) {
      synchronized (CommentsGrpc.class) {
        if ((getGetCommentsByUserTagMethod = CommentsGrpc.getGetCommentsByUserTagMethod) == null) {
          CommentsGrpc.getGetCommentsByUserTagMethod = getGetCommentsByUserTagMethod = 
              io.grpc.MethodDescriptor.<com.instagram_clone.comment_service.GetCommentsByUserTagRequest, com.instagram_clone.comment_service.GetCommentsByUserTagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Comment.Comments", "GetCommentsByUserTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.instagram_clone.comment_service.GetCommentsByUserTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.instagram_clone.comment_service.GetCommentsByUserTagResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CommentsMethodDescriptorSupplier("GetCommentsByUserTag"))
                  .build();
          }
        }
     }
     return getGetCommentsByUserTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.instagram_clone.comment_service.GetCommentsForImageRequest,
      com.instagram_clone.comment_service.GetCommentsForImageResponse> getGetCommentsForImageMethod;

  public static io.grpc.MethodDescriptor<com.instagram_clone.comment_service.GetCommentsForImageRequest,
      com.instagram_clone.comment_service.GetCommentsForImageResponse> getGetCommentsForImageMethod() {
    io.grpc.MethodDescriptor<com.instagram_clone.comment_service.GetCommentsForImageRequest, com.instagram_clone.comment_service.GetCommentsForImageResponse> getGetCommentsForImageMethod;
    if ((getGetCommentsForImageMethod = CommentsGrpc.getGetCommentsForImageMethod) == null) {
      synchronized (CommentsGrpc.class) {
        if ((getGetCommentsForImageMethod = CommentsGrpc.getGetCommentsForImageMethod) == null) {
          CommentsGrpc.getGetCommentsForImageMethod = getGetCommentsForImageMethod = 
              io.grpc.MethodDescriptor.<com.instagram_clone.comment_service.GetCommentsForImageRequest, com.instagram_clone.comment_service.GetCommentsForImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Comment.Comments", "GetCommentsForImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.instagram_clone.comment_service.GetCommentsForImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.instagram_clone.comment_service.GetCommentsForImageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CommentsMethodDescriptorSupplier("GetCommentsForImage"))
                  .build();
          }
        }
     }
     return getGetCommentsForImageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommentsStub newStub(io.grpc.Channel channel) {
    return new CommentsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommentsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CommentsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommentsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CommentsFutureStub(channel);
  }

  /**
   * Creates a new vertx stub that supports all call types for the service
   */
  public static CommentsVertxStub newVertxStub(io.grpc.Channel channel) {
    return new CommentsVertxStub(channel);
  }

  /**
   * <pre>
   * Comment service definition
   * </pre>
   */
  public static abstract class CommentsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create new comment
     * </pre>
     */
    public void createComment(com.instagram_clone.comment_service.CreateCommentRequest request,
        io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.CreateCommentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCommentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get comment
     * </pre>
     */
    public void getComment(com.instagram_clone.comment_service.GetCommentRequest request,
        io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.GetCommentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCommentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete comment
     * </pre>
     */
    public void deleteComment(com.instagram_clone.comment_service.DeleteCommentRequest request,
        io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.DeleteCommentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCommentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Find Comments by hashtag
     * </pre>
     */
    public void getCommentsByTag(com.instagram_clone.comment_service.GetCommentsByTagRequest request,
        io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.GetCommentsByTagResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCommentsByTagMethod(), responseObserver);
    }

    /**
     * <pre>
     * Find Comments by userTag
     * </pre>
     */
    public void getCommentsByUserTag(com.instagram_clone.comment_service.GetCommentsByUserTagRequest request,
        io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.GetCommentsByUserTagResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCommentsByUserTagMethod(), responseObserver);
    }

    /**
     */
    public void getCommentsForImage(com.instagram_clone.comment_service.GetCommentsForImageRequest request,
        io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.GetCommentsForImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCommentsForImageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCommentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.instagram_clone.comment_service.CreateCommentRequest,
                com.instagram_clone.comment_service.CreateCommentResponse>(
                  this, METHODID_CREATE_COMMENT)))
          .addMethod(
            getGetCommentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.instagram_clone.comment_service.GetCommentRequest,
                com.instagram_clone.comment_service.GetCommentResponse>(
                  this, METHODID_GET_COMMENT)))
          .addMethod(
            getDeleteCommentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.instagram_clone.comment_service.DeleteCommentRequest,
                com.instagram_clone.comment_service.DeleteCommentResponse>(
                  this, METHODID_DELETE_COMMENT)))
          .addMethod(
            getGetCommentsByTagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.instagram_clone.comment_service.GetCommentsByTagRequest,
                com.instagram_clone.comment_service.GetCommentsByTagResponse>(
                  this, METHODID_GET_COMMENTS_BY_TAG)))
          .addMethod(
            getGetCommentsByUserTagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.instagram_clone.comment_service.GetCommentsByUserTagRequest,
                com.instagram_clone.comment_service.GetCommentsByUserTagResponse>(
                  this, METHODID_GET_COMMENTS_BY_USER_TAG)))
          .addMethod(
            getGetCommentsForImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.instagram_clone.comment_service.GetCommentsForImageRequest,
                com.instagram_clone.comment_service.GetCommentsForImageResponse>(
                  this, METHODID_GET_COMMENTS_FOR_IMAGE)))
          .build();
    }
  }

  /**
   * <pre>
   * Comment service definition
   * </pre>
   */
  public static final class CommentsStub extends io.grpc.stub.AbstractStub<CommentsStub> {
    public CommentsStub(io.grpc.Channel channel) {
      super(channel);
    }

    public CommentsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommentsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create new comment
     * </pre>
     */
    public void createComment(com.instagram_clone.comment_service.CreateCommentRequest request,
        io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.CreateCommentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get comment
     * </pre>
     */
    public void getComment(com.instagram_clone.comment_service.GetCommentRequest request,
        io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.GetCommentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete comment
     * </pre>
     */
    public void deleteComment(com.instagram_clone.comment_service.DeleteCommentRequest request,
        io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.DeleteCommentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Find Comments by hashtag
     * </pre>
     */
    public void getCommentsByTag(com.instagram_clone.comment_service.GetCommentsByTagRequest request,
        io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.GetCommentsByTagResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCommentsByTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Find Comments by userTag
     * </pre>
     */
    public void getCommentsByUserTag(com.instagram_clone.comment_service.GetCommentsByUserTagRequest request,
        io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.GetCommentsByUserTagResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCommentsByUserTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCommentsForImage(com.instagram_clone.comment_service.GetCommentsForImageRequest request,
        io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.GetCommentsForImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCommentsForImageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Comment service definition
   * </pre>
   */
  public static final class CommentsBlockingStub extends io.grpc.stub.AbstractStub<CommentsBlockingStub> {
    public CommentsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    public CommentsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommentsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create new comment
     * </pre>
     */
    public com.instagram_clone.comment_service.CreateCommentResponse createComment(com.instagram_clone.comment_service.CreateCommentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCommentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get comment
     * </pre>
     */
    public com.instagram_clone.comment_service.GetCommentResponse getComment(com.instagram_clone.comment_service.GetCommentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCommentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete comment
     * </pre>
     */
    public com.instagram_clone.comment_service.DeleteCommentResponse deleteComment(com.instagram_clone.comment_service.DeleteCommentRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCommentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Find Comments by hashtag
     * </pre>
     */
    public com.instagram_clone.comment_service.GetCommentsByTagResponse getCommentsByTag(com.instagram_clone.comment_service.GetCommentsByTagRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCommentsByTagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Find Comments by userTag
     * </pre>
     */
    public com.instagram_clone.comment_service.GetCommentsByUserTagResponse getCommentsByUserTag(com.instagram_clone.comment_service.GetCommentsByUserTagRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCommentsByUserTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.instagram_clone.comment_service.GetCommentsForImageResponse getCommentsForImage(com.instagram_clone.comment_service.GetCommentsForImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCommentsForImageMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Comment service definition
   * </pre>
   */
  public static final class CommentsFutureStub extends io.grpc.stub.AbstractStub<CommentsFutureStub> {
    public CommentsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    public CommentsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommentsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create new comment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.instagram_clone.comment_service.CreateCommentResponse> createComment(
        com.instagram_clone.comment_service.CreateCommentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get comment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.instagram_clone.comment_service.GetCommentResponse> getComment(
        com.instagram_clone.comment_service.GetCommentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCommentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete comment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.instagram_clone.comment_service.DeleteCommentResponse> deleteComment(
        com.instagram_clone.comment_service.DeleteCommentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCommentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Find Comments by hashtag
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.instagram_clone.comment_service.GetCommentsByTagResponse> getCommentsByTag(
        com.instagram_clone.comment_service.GetCommentsByTagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCommentsByTagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Find Comments by userTag
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.instagram_clone.comment_service.GetCommentsByUserTagResponse> getCommentsByUserTag(
        com.instagram_clone.comment_service.GetCommentsByUserTagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCommentsByUserTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.instagram_clone.comment_service.GetCommentsForImageResponse> getCommentsForImage(
        com.instagram_clone.comment_service.GetCommentsForImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCommentsForImageMethod(), getCallOptions()), request);
    }
  }

  /**
   * <pre>
   * Comment service definition
   * </pre>
   */
  public static abstract class CommentsVertxImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create new comment
     * </pre>
     */
    public void createComment(com.instagram_clone.comment_service.CreateCommentRequest request,
        io.vertx.core.Future<com.instagram_clone.comment_service.CreateCommentResponse> response) {
      asyncUnimplementedUnaryCall(getCreateCommentMethod(), CommentsGrpc.toObserver(response.completer()));
    }

    /**
     * <pre>
     * Get comment
     * </pre>
     */
    public void getComment(com.instagram_clone.comment_service.GetCommentRequest request,
        io.vertx.core.Future<com.instagram_clone.comment_service.GetCommentResponse> response) {
      asyncUnimplementedUnaryCall(getGetCommentMethod(), CommentsGrpc.toObserver(response.completer()));
    }

    /**
     * <pre>
     * Delete comment
     * </pre>
     */
    public void deleteComment(com.instagram_clone.comment_service.DeleteCommentRequest request,
        io.vertx.core.Future<com.instagram_clone.comment_service.DeleteCommentResponse> response) {
      asyncUnimplementedUnaryCall(getDeleteCommentMethod(), CommentsGrpc.toObserver(response.completer()));
    }

    /**
     * <pre>
     * Find Comments by hashtag
     * </pre>
     */
    public void getCommentsByTag(com.instagram_clone.comment_service.GetCommentsByTagRequest request,
        io.vertx.core.Future<com.instagram_clone.comment_service.GetCommentsByTagResponse> response) {
      asyncUnimplementedUnaryCall(getGetCommentsByTagMethod(), CommentsGrpc.toObserver(response.completer()));
    }

    /**
     * <pre>
     * Find Comments by userTag
     * </pre>
     */
    public void getCommentsByUserTag(com.instagram_clone.comment_service.GetCommentsByUserTagRequest request,
        io.vertx.core.Future<com.instagram_clone.comment_service.GetCommentsByUserTagResponse> response) {
      asyncUnimplementedUnaryCall(getGetCommentsByUserTagMethod(), CommentsGrpc.toObserver(response.completer()));
    }

    /**
     */
    public void getCommentsForImage(com.instagram_clone.comment_service.GetCommentsForImageRequest request,
        io.vertx.core.Future<com.instagram_clone.comment_service.GetCommentsForImageResponse> response) {
      asyncUnimplementedUnaryCall(getGetCommentsForImageMethod(), CommentsGrpc.toObserver(response.completer()));
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCommentMethod(),
            asyncUnaryCall(
              new VertxMethodHandlers<
                com.instagram_clone.comment_service.CreateCommentRequest,
                com.instagram_clone.comment_service.CreateCommentResponse>(
                  this, METHODID_CREATE_COMMENT)))
          .addMethod(
            getGetCommentMethod(),
            asyncUnaryCall(
              new VertxMethodHandlers<
                com.instagram_clone.comment_service.GetCommentRequest,
                com.instagram_clone.comment_service.GetCommentResponse>(
                  this, METHODID_GET_COMMENT)))
          .addMethod(
            getDeleteCommentMethod(),
            asyncUnaryCall(
              new VertxMethodHandlers<
                com.instagram_clone.comment_service.DeleteCommentRequest,
                com.instagram_clone.comment_service.DeleteCommentResponse>(
                  this, METHODID_DELETE_COMMENT)))
          .addMethod(
            getGetCommentsByTagMethod(),
            asyncUnaryCall(
              new VertxMethodHandlers<
                com.instagram_clone.comment_service.GetCommentsByTagRequest,
                com.instagram_clone.comment_service.GetCommentsByTagResponse>(
                  this, METHODID_GET_COMMENTS_BY_TAG)))
          .addMethod(
            getGetCommentsByUserTagMethod(),
            asyncUnaryCall(
              new VertxMethodHandlers<
                com.instagram_clone.comment_service.GetCommentsByUserTagRequest,
                com.instagram_clone.comment_service.GetCommentsByUserTagResponse>(
                  this, METHODID_GET_COMMENTS_BY_USER_TAG)))
          .addMethod(
            getGetCommentsForImageMethod(),
            asyncUnaryCall(
              new VertxMethodHandlers<
                com.instagram_clone.comment_service.GetCommentsForImageRequest,
                com.instagram_clone.comment_service.GetCommentsForImageResponse>(
                  this, METHODID_GET_COMMENTS_FOR_IMAGE)))
          .build();
    }
  }

  /**
   * <pre>
   * Comment service definition
   * </pre>
   */
  public static final class CommentsVertxStub extends io.grpc.stub.AbstractStub<CommentsVertxStub> {
    public CommentsVertxStub(io.grpc.Channel channel) {
      super(channel);
    }

    public CommentsVertxStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentsVertxStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommentsVertxStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create new comment
     * </pre>
     */
    public void createComment(com.instagram_clone.comment_service.CreateCommentRequest request,
        io.vertx.core.Handler<io.vertx.core.AsyncResult<com.instagram_clone.comment_service.CreateCommentResponse>> response) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request, CommentsGrpc.toObserver(response));
    }

    /**
     * <pre>
     * Get comment
     * </pre>
     */
    public void getComment(com.instagram_clone.comment_service.GetCommentRequest request,
        io.vertx.core.Handler<io.vertx.core.AsyncResult<com.instagram_clone.comment_service.GetCommentResponse>> response) {
      asyncUnaryCall(
          getChannel().newCall(getGetCommentMethod(), getCallOptions()), request, CommentsGrpc.toObserver(response));
    }

    /**
     * <pre>
     * Delete comment
     * </pre>
     */
    public void deleteComment(com.instagram_clone.comment_service.DeleteCommentRequest request,
        io.vertx.core.Handler<io.vertx.core.AsyncResult<com.instagram_clone.comment_service.DeleteCommentResponse>> response) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCommentMethod(), getCallOptions()), request, CommentsGrpc.toObserver(response));
    }

    /**
     * <pre>
     * Find Comments by hashtag
     * </pre>
     */
    public void getCommentsByTag(com.instagram_clone.comment_service.GetCommentsByTagRequest request,
        io.vertx.core.Handler<io.vertx.core.AsyncResult<com.instagram_clone.comment_service.GetCommentsByTagResponse>> response) {
      asyncUnaryCall(
          getChannel().newCall(getGetCommentsByTagMethod(), getCallOptions()), request, CommentsGrpc.toObserver(response));
    }

    /**
     * <pre>
     * Find Comments by userTag
     * </pre>
     */
    public void getCommentsByUserTag(com.instagram_clone.comment_service.GetCommentsByUserTagRequest request,
        io.vertx.core.Handler<io.vertx.core.AsyncResult<com.instagram_clone.comment_service.GetCommentsByUserTagResponse>> response) {
      asyncUnaryCall(
          getChannel().newCall(getGetCommentsByUserTagMethod(), getCallOptions()), request, CommentsGrpc.toObserver(response));
    }

    /**
     */
    public void getCommentsForImage(com.instagram_clone.comment_service.GetCommentsForImageRequest request,
        io.vertx.core.Handler<io.vertx.core.AsyncResult<com.instagram_clone.comment_service.GetCommentsForImageResponse>> response) {
      asyncUnaryCall(
          getChannel().newCall(getGetCommentsForImageMethod(), getCallOptions()), request, CommentsGrpc.toObserver(response));
    }
  }

  private static final int METHODID_CREATE_COMMENT = 0;
  private static final int METHODID_GET_COMMENT = 1;
  private static final int METHODID_DELETE_COMMENT = 2;
  private static final int METHODID_GET_COMMENTS_BY_TAG = 3;
  private static final int METHODID_GET_COMMENTS_BY_USER_TAG = 4;
  private static final int METHODID_GET_COMMENTS_FOR_IMAGE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommentsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommentsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_COMMENT:
          serviceImpl.createComment((com.instagram_clone.comment_service.CreateCommentRequest) request,
              (io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.CreateCommentResponse>) responseObserver);
          break;
        case METHODID_GET_COMMENT:
          serviceImpl.getComment((com.instagram_clone.comment_service.GetCommentRequest) request,
              (io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.GetCommentResponse>) responseObserver);
          break;
        case METHODID_DELETE_COMMENT:
          serviceImpl.deleteComment((com.instagram_clone.comment_service.DeleteCommentRequest) request,
              (io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.DeleteCommentResponse>) responseObserver);
          break;
        case METHODID_GET_COMMENTS_BY_TAG:
          serviceImpl.getCommentsByTag((com.instagram_clone.comment_service.GetCommentsByTagRequest) request,
              (io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.GetCommentsByTagResponse>) responseObserver);
          break;
        case METHODID_GET_COMMENTS_BY_USER_TAG:
          serviceImpl.getCommentsByUserTag((com.instagram_clone.comment_service.GetCommentsByUserTagRequest) request,
              (io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.GetCommentsByUserTagResponse>) responseObserver);
          break;
        case METHODID_GET_COMMENTS_FOR_IMAGE:
          serviceImpl.getCommentsForImage((com.instagram_clone.comment_service.GetCommentsForImageRequest) request,
              (io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.GetCommentsForImageResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class VertxMethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommentsVertxImplBase serviceImpl;
    private final int methodId;

    VertxMethodHandlers(CommentsVertxImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_COMMENT:
          serviceImpl.createComment((com.instagram_clone.comment_service.CreateCommentRequest) request,
              (io.vertx.core.Future<com.instagram_clone.comment_service.CreateCommentResponse>) io.vertx.core.Future.<com.instagram_clone.comment_service.CreateCommentResponse>future().setHandler(ar -> {
                if (ar.succeeded()) {
                  ((io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.CreateCommentResponse>) responseObserver).onNext(ar.result());
                  responseObserver.onCompleted();
                } else {
                  responseObserver.onError(ar.cause());
                }
              }));
          break;
        case METHODID_GET_COMMENT:
          serviceImpl.getComment((com.instagram_clone.comment_service.GetCommentRequest) request,
              (io.vertx.core.Future<com.instagram_clone.comment_service.GetCommentResponse>) io.vertx.core.Future.<com.instagram_clone.comment_service.GetCommentResponse>future().setHandler(ar -> {
                if (ar.succeeded()) {
                  ((io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.GetCommentResponse>) responseObserver).onNext(ar.result());
                  responseObserver.onCompleted();
                } else {
                  responseObserver.onError(ar.cause());
                }
              }));
          break;
        case METHODID_DELETE_COMMENT:
          serviceImpl.deleteComment((com.instagram_clone.comment_service.DeleteCommentRequest) request,
              (io.vertx.core.Future<com.instagram_clone.comment_service.DeleteCommentResponse>) io.vertx.core.Future.<com.instagram_clone.comment_service.DeleteCommentResponse>future().setHandler(ar -> {
                if (ar.succeeded()) {
                  ((io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.DeleteCommentResponse>) responseObserver).onNext(ar.result());
                  responseObserver.onCompleted();
                } else {
                  responseObserver.onError(ar.cause());
                }
              }));
          break;
        case METHODID_GET_COMMENTS_BY_TAG:
          serviceImpl.getCommentsByTag((com.instagram_clone.comment_service.GetCommentsByTagRequest) request,
              (io.vertx.core.Future<com.instagram_clone.comment_service.GetCommentsByTagResponse>) io.vertx.core.Future.<com.instagram_clone.comment_service.GetCommentsByTagResponse>future().setHandler(ar -> {
                if (ar.succeeded()) {
                  ((io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.GetCommentsByTagResponse>) responseObserver).onNext(ar.result());
                  responseObserver.onCompleted();
                } else {
                  responseObserver.onError(ar.cause());
                }
              }));
          break;
        case METHODID_GET_COMMENTS_BY_USER_TAG:
          serviceImpl.getCommentsByUserTag((com.instagram_clone.comment_service.GetCommentsByUserTagRequest) request,
              (io.vertx.core.Future<com.instagram_clone.comment_service.GetCommentsByUserTagResponse>) io.vertx.core.Future.<com.instagram_clone.comment_service.GetCommentsByUserTagResponse>future().setHandler(ar -> {
                if (ar.succeeded()) {
                  ((io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.GetCommentsByUserTagResponse>) responseObserver).onNext(ar.result());
                  responseObserver.onCompleted();
                } else {
                  responseObserver.onError(ar.cause());
                }
              }));
          break;
        case METHODID_GET_COMMENTS_FOR_IMAGE:
          serviceImpl.getCommentsForImage((com.instagram_clone.comment_service.GetCommentsForImageRequest) request,
              (io.vertx.core.Future<com.instagram_clone.comment_service.GetCommentsForImageResponse>) io.vertx.core.Future.<com.instagram_clone.comment_service.GetCommentsForImageResponse>future().setHandler(ar -> {
                if (ar.succeeded()) {
                  ((io.grpc.stub.StreamObserver<com.instagram_clone.comment_service.GetCommentsForImageResponse>) responseObserver).onNext(ar.result());
                  responseObserver.onCompleted();
                } else {
                  responseObserver.onError(ar.cause());
                }
              }));
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CommentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommentsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.instagram_clone.comment_service.CommentService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Comments");
    }
  }

  private static final class CommentsFileDescriptorSupplier
      extends CommentsBaseDescriptorSupplier {
    CommentsFileDescriptorSupplier() {}
  }

  private static final class CommentsMethodDescriptorSupplier
      extends CommentsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommentsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CommentsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommentsFileDescriptorSupplier())
              .addMethod(getCreateCommentMethod())
              .addMethod(getGetCommentMethod())
              .addMethod(getDeleteCommentMethod())
              .addMethod(getGetCommentsByTagMethod())
              .addMethod(getGetCommentsByUserTagMethod())
              .addMethod(getGetCommentsForImageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
