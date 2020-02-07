// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image_service.proto

package com.instagram_clone.image_service;

/**
 * Protobuf type {@code Image.CreateImageRequest}
 */
public  final class CreateImageRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Image.CreateImageRequest)
    CreateImageRequestOrBuilder {
  // Use CreateImageRequest.newBuilder() to construct.
  private CreateImageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateImageRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CreateImageRequest(
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
            com.instagram_clone.image_service.Metadata.Builder subBuilder = null;
            if (partCase_ == 1) {
              subBuilder = ((com.instagram_clone.image_service.Metadata) part_).toBuilder();
            }
            part_ =
                input.readMessage(com.instagram_clone.image_service.Metadata.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.instagram_clone.image_service.Metadata) part_);
              part_ = subBuilder.buildPartial();
            }
            partCase_ = 1;
            break;
          }
          case 18: {
            partCase_ = 2;
            part_ = input.readBytes();
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
    return com.instagram_clone.image_service.ImageService.internal_static_Image_CreateImageRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.instagram_clone.image_service.ImageService.internal_static_Image_CreateImageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.instagram_clone.image_service.CreateImageRequest.class, com.instagram_clone.image_service.CreateImageRequest.Builder.class);
  }

  private int partCase_ = 0;
  private java.lang.Object part_;
  public enum PartCase
      implements com.google.protobuf.Internal.EnumLite {
    META_DATA(1),
    DATA(2),
    PART_NOT_SET(0);
    private final int value;
    private PartCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PartCase valueOf(int value) {
      return forNumber(value);
    }

    public static PartCase forNumber(int value) {
      switch (value) {
        case 1: return META_DATA;
        case 2: return DATA;
        case 0: return PART_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public PartCase
  getPartCase() {
    return PartCase.forNumber(
        partCase_);
  }

  public static final int META_DATA_FIELD_NUMBER = 1;
  /**
   * <code>.Image.Metadata meta_data = 1;</code>
   */
  public com.instagram_clone.image_service.Metadata getMetaData() {
    if (partCase_ == 1) {
       return (com.instagram_clone.image_service.Metadata) part_;
    }
    return com.instagram_clone.image_service.Metadata.getDefaultInstance();
  }
  /**
   * <code>.Image.Metadata meta_data = 1;</code>
   */
  public com.instagram_clone.image_service.MetadataOrBuilder getMetaDataOrBuilder() {
    if (partCase_ == 1) {
       return (com.instagram_clone.image_service.Metadata) part_;
    }
    return com.instagram_clone.image_service.Metadata.getDefaultInstance();
  }

  public static final int DATA_FIELD_NUMBER = 2;
  /**
   * <code>bytes data = 2;</code>
   */
  public com.google.protobuf.ByteString getData() {
    if (partCase_ == 2) {
      return (com.google.protobuf.ByteString) part_;
    }
    return com.google.protobuf.ByteString.EMPTY;
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
    if (partCase_ == 1) {
      output.writeMessage(1, (com.instagram_clone.image_service.Metadata) part_);
    }
    if (partCase_ == 2) {
      output.writeBytes(
          2, (com.google.protobuf.ByteString) part_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (partCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.instagram_clone.image_service.Metadata) part_);
    }
    if (partCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            2, (com.google.protobuf.ByteString) part_);
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
    if (!(obj instanceof com.instagram_clone.image_service.CreateImageRequest)) {
      return super.equals(obj);
    }
    com.instagram_clone.image_service.CreateImageRequest other = (com.instagram_clone.image_service.CreateImageRequest) obj;

    boolean result = true;
    result = result && getPartCase().equals(
        other.getPartCase());
    if (!result) return false;
    switch (partCase_) {
      case 1:
        result = result && getMetaData()
            .equals(other.getMetaData());
        break;
      case 2:
        result = result && getData()
            .equals(other.getData());
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
    switch (partCase_) {
      case 1:
        hash = (37 * hash) + META_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetaData().hashCode();
        break;
      case 2:
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getData().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.instagram_clone.image_service.CreateImageRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.instagram_clone.image_service.CreateImageRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.instagram_clone.image_service.CreateImageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.instagram_clone.image_service.CreateImageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.instagram_clone.image_service.CreateImageRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.instagram_clone.image_service.CreateImageRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.instagram_clone.image_service.CreateImageRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.instagram_clone.image_service.CreateImageRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.instagram_clone.image_service.CreateImageRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.instagram_clone.image_service.CreateImageRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.instagram_clone.image_service.CreateImageRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.instagram_clone.image_service.CreateImageRequest parseFrom(
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
  public static Builder newBuilder(com.instagram_clone.image_service.CreateImageRequest prototype) {
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
   * Protobuf type {@code Image.CreateImageRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Image.CreateImageRequest)
      com.instagram_clone.image_service.CreateImageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.instagram_clone.image_service.ImageService.internal_static_Image_CreateImageRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.instagram_clone.image_service.ImageService.internal_static_Image_CreateImageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.instagram_clone.image_service.CreateImageRequest.class, com.instagram_clone.image_service.CreateImageRequest.Builder.class);
    }

    // Construct using com.instagram_clone.image_service.CreateImageRequest.newBuilder()
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
      partCase_ = 0;
      part_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.instagram_clone.image_service.ImageService.internal_static_Image_CreateImageRequest_descriptor;
    }

    public com.instagram_clone.image_service.CreateImageRequest getDefaultInstanceForType() {
      return com.instagram_clone.image_service.CreateImageRequest.getDefaultInstance();
    }

    public com.instagram_clone.image_service.CreateImageRequest build() {
      com.instagram_clone.image_service.CreateImageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.instagram_clone.image_service.CreateImageRequest buildPartial() {
      com.instagram_clone.image_service.CreateImageRequest result = new com.instagram_clone.image_service.CreateImageRequest(this);
      if (partCase_ == 1) {
        if (metaDataBuilder_ == null) {
          result.part_ = part_;
        } else {
          result.part_ = metaDataBuilder_.build();
        }
      }
      if (partCase_ == 2) {
        result.part_ = part_;
      }
      result.partCase_ = partCase_;
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
      if (other instanceof com.instagram_clone.image_service.CreateImageRequest) {
        return mergeFrom((com.instagram_clone.image_service.CreateImageRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.instagram_clone.image_service.CreateImageRequest other) {
      if (other == com.instagram_clone.image_service.CreateImageRequest.getDefaultInstance()) return this;
      switch (other.getPartCase()) {
        case META_DATA: {
          mergeMetaData(other.getMetaData());
          break;
        }
        case DATA: {
          setData(other.getData());
          break;
        }
        case PART_NOT_SET: {
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
      com.instagram_clone.image_service.CreateImageRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.instagram_clone.image_service.CreateImageRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int partCase_ = 0;
    private java.lang.Object part_;
    public PartCase
        getPartCase() {
      return PartCase.forNumber(
          partCase_);
    }

    public Builder clearPart() {
      partCase_ = 0;
      part_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.instagram_clone.image_service.Metadata, com.instagram_clone.image_service.Metadata.Builder, com.instagram_clone.image_service.MetadataOrBuilder> metaDataBuilder_;
    /**
     * <code>.Image.Metadata meta_data = 1;</code>
     */
    public com.instagram_clone.image_service.Metadata getMetaData() {
      if (metaDataBuilder_ == null) {
        if (partCase_ == 1) {
          return (com.instagram_clone.image_service.Metadata) part_;
        }
        return com.instagram_clone.image_service.Metadata.getDefaultInstance();
      } else {
        if (partCase_ == 1) {
          return metaDataBuilder_.getMessage();
        }
        return com.instagram_clone.image_service.Metadata.getDefaultInstance();
      }
    }
    /**
     * <code>.Image.Metadata meta_data = 1;</code>
     */
    public Builder setMetaData(com.instagram_clone.image_service.Metadata value) {
      if (metaDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        part_ = value;
        onChanged();
      } else {
        metaDataBuilder_.setMessage(value);
      }
      partCase_ = 1;
      return this;
    }
    /**
     * <code>.Image.Metadata meta_data = 1;</code>
     */
    public Builder setMetaData(
        com.instagram_clone.image_service.Metadata.Builder builderForValue) {
      if (metaDataBuilder_ == null) {
        part_ = builderForValue.build();
        onChanged();
      } else {
        metaDataBuilder_.setMessage(builderForValue.build());
      }
      partCase_ = 1;
      return this;
    }
    /**
     * <code>.Image.Metadata meta_data = 1;</code>
     */
    public Builder mergeMetaData(com.instagram_clone.image_service.Metadata value) {
      if (metaDataBuilder_ == null) {
        if (partCase_ == 1 &&
            part_ != com.instagram_clone.image_service.Metadata.getDefaultInstance()) {
          part_ = com.instagram_clone.image_service.Metadata.newBuilder((com.instagram_clone.image_service.Metadata) part_)
              .mergeFrom(value).buildPartial();
        } else {
          part_ = value;
        }
        onChanged();
      } else {
        if (partCase_ == 1) {
          metaDataBuilder_.mergeFrom(value);
        }
        metaDataBuilder_.setMessage(value);
      }
      partCase_ = 1;
      return this;
    }
    /**
     * <code>.Image.Metadata meta_data = 1;</code>
     */
    public Builder clearMetaData() {
      if (metaDataBuilder_ == null) {
        if (partCase_ == 1) {
          partCase_ = 0;
          part_ = null;
          onChanged();
        }
      } else {
        if (partCase_ == 1) {
          partCase_ = 0;
          part_ = null;
        }
        metaDataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.Image.Metadata meta_data = 1;</code>
     */
    public com.instagram_clone.image_service.Metadata.Builder getMetaDataBuilder() {
      return getMetaDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.Image.Metadata meta_data = 1;</code>
     */
    public com.instagram_clone.image_service.MetadataOrBuilder getMetaDataOrBuilder() {
      if ((partCase_ == 1) && (metaDataBuilder_ != null)) {
        return metaDataBuilder_.getMessageOrBuilder();
      } else {
        if (partCase_ == 1) {
          return (com.instagram_clone.image_service.Metadata) part_;
        }
        return com.instagram_clone.image_service.Metadata.getDefaultInstance();
      }
    }
    /**
     * <code>.Image.Metadata meta_data = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.instagram_clone.image_service.Metadata, com.instagram_clone.image_service.Metadata.Builder, com.instagram_clone.image_service.MetadataOrBuilder> 
        getMetaDataFieldBuilder() {
      if (metaDataBuilder_ == null) {
        if (!(partCase_ == 1)) {
          part_ = com.instagram_clone.image_service.Metadata.getDefaultInstance();
        }
        metaDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.instagram_clone.image_service.Metadata, com.instagram_clone.image_service.Metadata.Builder, com.instagram_clone.image_service.MetadataOrBuilder>(
                (com.instagram_clone.image_service.Metadata) part_,
                getParentForChildren(),
                isClean());
        part_ = null;
      }
      partCase_ = 1;
      onChanged();;
      return metaDataBuilder_;
    }

    /**
     * <code>bytes data = 2;</code>
     */
    public com.google.protobuf.ByteString getData() {
      if (partCase_ == 2) {
        return (com.google.protobuf.ByteString) part_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>bytes data = 2;</code>
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  partCase_ = 2;
      part_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes data = 2;</code>
     */
    public Builder clearData() {
      if (partCase_ == 2) {
        partCase_ = 0;
        part_ = null;
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


    // @@protoc_insertion_point(builder_scope:Image.CreateImageRequest)
  }

  // @@protoc_insertion_point(class_scope:Image.CreateImageRequest)
  private static final com.instagram_clone.image_service.CreateImageRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.instagram_clone.image_service.CreateImageRequest();
  }

  public static com.instagram_clone.image_service.CreateImageRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateImageRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateImageRequest>() {
    public CreateImageRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateImageRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateImageRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateImageRequest> getParserForType() {
    return PARSER;
  }

  public com.instagram_clone.image_service.CreateImageRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

