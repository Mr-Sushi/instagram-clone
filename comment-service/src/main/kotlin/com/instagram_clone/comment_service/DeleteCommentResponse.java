// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comment_service.proto

package com.instagram_clone.comment_service;

/**
 * Protobuf type {@code Comment.DeleteCommentResponse}
 */
public  final class DeleteCommentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Comment.DeleteCommentResponse)
    DeleteCommentResponseOrBuilder {
  // Use DeleteCommentResponse.newBuilder() to construct.
  private DeleteCommentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteCommentResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DeleteCommentResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            statusCase_ = 1;
            status_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            statusCase_ = 2;
            status_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.instagram_clone.comment_service.CommentService.internal_static_Comment_DeleteCommentResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.instagram_clone.comment_service.CommentService.internal_static_Comment_DeleteCommentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.instagram_clone.comment_service.DeleteCommentResponse.class, com.instagram_clone.comment_service.DeleteCommentResponse.Builder.class);
  }

  private int statusCase_ = 0;
  private java.lang.Object status_;
  public enum StatusCase
      implements com.google.protobuf.Internal.EnumLite {
    COMMENTID(1),
    ERROR(2),
    STATUS_NOT_SET(0);
    private final int value;
    private StatusCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StatusCase valueOf(int value) {
      return forNumber(value);
    }

    public static StatusCase forNumber(int value) {
      switch (value) {
        case 1: return COMMENTID;
        case 2: return ERROR;
        case 0: return STATUS_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public StatusCase
  getStatusCase() {
    return StatusCase.forNumber(
        statusCase_);
  }

  public static final int COMMENTID_FIELD_NUMBER = 1;
  /**
   * <code>string commentId = 1;</code>
   */
  public java.lang.String getCommentId() {
    java.lang.Object ref = "";
    if (statusCase_ == 1) {
      ref = status_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (statusCase_ == 1) {
        status_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string commentId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCommentIdBytes() {
    java.lang.Object ref = "";
    if (statusCase_ == 1) {
      ref = status_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (statusCase_ == 1) {
        status_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  /**
   * <code>.Comment.DeleteCommentErrorStatus error = 2;</code>
   */
  public int getErrorValue() {
    if (statusCase_ == 2) {
      return (java.lang.Integer) status_;
    }
    return 0;
  }
  /**
   * <code>.Comment.DeleteCommentErrorStatus error = 2;</code>
   */
  public com.instagram_clone.comment_service.DeleteCommentErrorStatus getError() {
    if (statusCase_ == 2) {
      com.instagram_clone.comment_service.DeleteCommentErrorStatus result = com.instagram_clone.comment_service.DeleteCommentErrorStatus.valueOf(
          (java.lang.Integer) status_);
      return result == null ? com.instagram_clone.comment_service.DeleteCommentErrorStatus.UNRECOGNIZED : result;
    }
    return com.instagram_clone.comment_service.DeleteCommentErrorStatus.DELETE_NOT_FOUND;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (statusCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, status_);
    }
    if (statusCase_ == 2) {
      output.writeEnum(2, ((java.lang.Integer) status_));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (statusCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, status_);
    }
    if (statusCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, ((java.lang.Integer) status_));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.instagram_clone.comment_service.DeleteCommentResponse)) {
      return super.equals(obj);
    }
    com.instagram_clone.comment_service.DeleteCommentResponse other = (com.instagram_clone.comment_service.DeleteCommentResponse) obj;

    boolean result = true;
    result = result && getStatusCase().equals(
        other.getStatusCase());
    if (!result) return false;
    switch (statusCase_) {
      case 1:
        result = result && getCommentId()
            .equals(other.getCommentId());
        break;
      case 2:
        result = result && getErrorValue()
            == other.getErrorValue();
        break;
      case 0:
      default:
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (statusCase_) {
      case 1:
        hash = (37 * hash) + COMMENTID_FIELD_NUMBER;
        hash = (53 * hash) + getCommentId().hashCode();
        break;
      case 2:
        hash = (37 * hash) + ERROR_FIELD_NUMBER;
        hash = (53 * hash) + getErrorValue();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.instagram_clone.comment_service.DeleteCommentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.instagram_clone.comment_service.DeleteCommentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.instagram_clone.comment_service.DeleteCommentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.instagram_clone.comment_service.DeleteCommentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.instagram_clone.comment_service.DeleteCommentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.instagram_clone.comment_service.DeleteCommentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.instagram_clone.comment_service.DeleteCommentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.instagram_clone.comment_service.DeleteCommentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.instagram_clone.comment_service.DeleteCommentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.instagram_clone.comment_service.DeleteCommentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.instagram_clone.comment_service.DeleteCommentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.instagram_clone.comment_service.DeleteCommentResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.instagram_clone.comment_service.DeleteCommentResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Comment.DeleteCommentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Comment.DeleteCommentResponse)
      com.instagram_clone.comment_service.DeleteCommentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.instagram_clone.comment_service.CommentService.internal_static_Comment_DeleteCommentResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.instagram_clone.comment_service.CommentService.internal_static_Comment_DeleteCommentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.instagram_clone.comment_service.DeleteCommentResponse.class, com.instagram_clone.comment_service.DeleteCommentResponse.Builder.class);
    }

    // Construct using com.instagram_clone.comment_service.DeleteCommentResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      statusCase_ = 0;
      status_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.instagram_clone.comment_service.CommentService.internal_static_Comment_DeleteCommentResponse_descriptor;
    }

    public com.instagram_clone.comment_service.DeleteCommentResponse getDefaultInstanceForType() {
      return com.instagram_clone.comment_service.DeleteCommentResponse.getDefaultInstance();
    }

    public com.instagram_clone.comment_service.DeleteCommentResponse build() {
      com.instagram_clone.comment_service.DeleteCommentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.instagram_clone.comment_service.DeleteCommentResponse buildPartial() {
      com.instagram_clone.comment_service.DeleteCommentResponse result = new com.instagram_clone.comment_service.DeleteCommentResponse(this);
      if (statusCase_ == 1) {
        result.status_ = status_;
      }
      if (statusCase_ == 2) {
        result.status_ = status_;
      }
      result.statusCase_ = statusCase_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.instagram_clone.comment_service.DeleteCommentResponse) {
        return mergeFrom((com.instagram_clone.comment_service.DeleteCommentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.instagram_clone.comment_service.DeleteCommentResponse other) {
      if (other == com.instagram_clone.comment_service.DeleteCommentResponse.getDefaultInstance()) return this;
      switch (other.getStatusCase()) {
        case COMMENTID: {
          statusCase_ = 1;
          status_ = other.status_;
          onChanged();
          break;
        }
        case ERROR: {
          setErrorValue(other.getErrorValue());
          break;
        }
        case STATUS_NOT_SET: {
          break;
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.instagram_clone.comment_service.DeleteCommentResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.instagram_clone.comment_service.DeleteCommentResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int statusCase_ = 0;
    private java.lang.Object status_;
    public StatusCase
        getStatusCase() {
      return StatusCase.forNumber(
          statusCase_);
    }

    public Builder clearStatus() {
      statusCase_ = 0;
      status_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>string commentId = 1;</code>
     */
    public java.lang.String getCommentId() {
      java.lang.Object ref = "";
      if (statusCase_ == 1) {
        ref = status_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (statusCase_ == 1) {
          status_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string commentId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCommentIdBytes() {
      java.lang.Object ref = "";
      if (statusCase_ == 1) {
        ref = status_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (statusCase_ == 1) {
          status_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string commentId = 1;</code>
     */
    public Builder setCommentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  statusCase_ = 1;
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string commentId = 1;</code>
     */
    public Builder clearCommentId() {
      if (statusCase_ == 1) {
        statusCase_ = 0;
        status_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string commentId = 1;</code>
     */
    public Builder setCommentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      statusCase_ = 1;
      status_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>.Comment.DeleteCommentErrorStatus error = 2;</code>
     */
    public int getErrorValue() {
      if (statusCase_ == 2) {
        return ((java.lang.Integer) status_).intValue();
      }
      return 0;
    }
    /**
     * <code>.Comment.DeleteCommentErrorStatus error = 2;</code>
     */
    public Builder setErrorValue(int value) {
      statusCase_ = 2;
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Comment.DeleteCommentErrorStatus error = 2;</code>
     */
    public com.instagram_clone.comment_service.DeleteCommentErrorStatus getError() {
      if (statusCase_ == 2) {
        com.instagram_clone.comment_service.DeleteCommentErrorStatus result = com.instagram_clone.comment_service.DeleteCommentErrorStatus.valueOf(
            (java.lang.Integer) status_);
        return result == null ? com.instagram_clone.comment_service.DeleteCommentErrorStatus.UNRECOGNIZED : result;
      }
      return com.instagram_clone.comment_service.DeleteCommentErrorStatus.DELETE_NOT_FOUND;
    }
    /**
     * <code>.Comment.DeleteCommentErrorStatus error = 2;</code>
     */
    public Builder setError(com.instagram_clone.comment_service.DeleteCommentErrorStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      statusCase_ = 2;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Comment.DeleteCommentErrorStatus error = 2;</code>
     */
    public Builder clearError() {
      if (statusCase_ == 2) {
        statusCase_ = 0;
        status_ = null;
        onChanged();
      }
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Comment.DeleteCommentResponse)
  }

  // @@protoc_insertion_point(class_scope:Comment.DeleteCommentResponse)
  private static final com.instagram_clone.comment_service.DeleteCommentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.instagram_clone.comment_service.DeleteCommentResponse();
  }

  public static com.instagram_clone.comment_service.DeleteCommentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteCommentResponse>
      PARSER = new com.google.protobuf.AbstractParser<DeleteCommentResponse>() {
    public DeleteCommentResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeleteCommentResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteCommentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteCommentResponse> getParserForType() {
    return PARSER;
  }

  public com.instagram_clone.comment_service.DeleteCommentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

