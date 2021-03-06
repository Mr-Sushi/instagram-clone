// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image_service.proto

package com.instagram_clone.image_service;

/**
 * Protobuf type {@code Image.Metadata}
 */
public  final class Metadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Image.Metadata)
    MetadataOrBuilder {
  // Use Metadata.newBuilder() to construct.
  private Metadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Metadata() {
    caption_ = "";
    creatorId_ = "";
    imageType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Metadata(
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

            caption_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            creatorId_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            imageType_ = rawValue;
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
    return com.instagram_clone.image_service.ImageService.internal_static_Image_Metadata_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.instagram_clone.image_service.ImageService.internal_static_Image_Metadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.instagram_clone.image_service.Metadata.class, com.instagram_clone.image_service.Metadata.Builder.class);
  }

  public static final int CAPTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object caption_;
  /**
   * <pre>
   * Image caption
   * </pre>
   *
   * <code>string caption = 1;</code>
   */
  public java.lang.String getCaption() {
    java.lang.Object ref = caption_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      caption_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Image caption
   * </pre>
   *
   * <code>string caption = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCaptionBytes() {
    java.lang.Object ref = caption_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      caption_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATOR_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object creatorId_;
  /**
   * <pre>
   * Image poster
   * </pre>
   *
   * <code>string creator_id = 2;</code>
   */
  public java.lang.String getCreatorId() {
    java.lang.Object ref = creatorId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      creatorId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Image poster
   * </pre>
   *
   * <code>string creator_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCreatorIdBytes() {
    java.lang.Object ref = creatorId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      creatorId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGE_TYPE_FIELD_NUMBER = 3;
  private int imageType_;
  /**
   * <pre>
   * Image type (png/jpg)
   * </pre>
   *
   * <code>.Image.ImageType image_type = 3;</code>
   */
  public int getImageTypeValue() {
    return imageType_;
  }
  /**
   * <pre>
   * Image type (png/jpg)
   * </pre>
   *
   * <code>.Image.ImageType image_type = 3;</code>
   */
  public com.instagram_clone.image_service.ImageType getImageType() {
    com.instagram_clone.image_service.ImageType result = com.instagram_clone.image_service.ImageType.valueOf(imageType_);
    return result == null ? com.instagram_clone.image_service.ImageType.UNRECOGNIZED : result;
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
    if (!getCaptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, caption_);
    }
    if (!getCreatorIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, creatorId_);
    }
    if (imageType_ != com.instagram_clone.image_service.ImageType.PNG.getNumber()) {
      output.writeEnum(3, imageType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCaptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, caption_);
    }
    if (!getCreatorIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, creatorId_);
    }
    if (imageType_ != com.instagram_clone.image_service.ImageType.PNG.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, imageType_);
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
    if (!(obj instanceof com.instagram_clone.image_service.Metadata)) {
      return super.equals(obj);
    }
    com.instagram_clone.image_service.Metadata other = (com.instagram_clone.image_service.Metadata) obj;

    boolean result = true;
    result = result && getCaption()
        .equals(other.getCaption());
    result = result && getCreatorId()
        .equals(other.getCreatorId());
    result = result && imageType_ == other.imageType_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CAPTION_FIELD_NUMBER;
    hash = (53 * hash) + getCaption().hashCode();
    hash = (37 * hash) + CREATOR_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCreatorId().hashCode();
    hash = (37 * hash) + IMAGE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + imageType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.instagram_clone.image_service.Metadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.instagram_clone.image_service.Metadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.instagram_clone.image_service.Metadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.instagram_clone.image_service.Metadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.instagram_clone.image_service.Metadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.instagram_clone.image_service.Metadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.instagram_clone.image_service.Metadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.instagram_clone.image_service.Metadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.instagram_clone.image_service.Metadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.instagram_clone.image_service.Metadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.instagram_clone.image_service.Metadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.instagram_clone.image_service.Metadata parseFrom(
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
  public static Builder newBuilder(com.instagram_clone.image_service.Metadata prototype) {
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
   * Protobuf type {@code Image.Metadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Image.Metadata)
      com.instagram_clone.image_service.MetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.instagram_clone.image_service.ImageService.internal_static_Image_Metadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.instagram_clone.image_service.ImageService.internal_static_Image_Metadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.instagram_clone.image_service.Metadata.class, com.instagram_clone.image_service.Metadata.Builder.class);
    }

    // Construct using com.instagram_clone.image_service.Metadata.newBuilder()
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
      caption_ = "";

      creatorId_ = "";

      imageType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.instagram_clone.image_service.ImageService.internal_static_Image_Metadata_descriptor;
    }

    public com.instagram_clone.image_service.Metadata getDefaultInstanceForType() {
      return com.instagram_clone.image_service.Metadata.getDefaultInstance();
    }

    public com.instagram_clone.image_service.Metadata build() {
      com.instagram_clone.image_service.Metadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.instagram_clone.image_service.Metadata buildPartial() {
      com.instagram_clone.image_service.Metadata result = new com.instagram_clone.image_service.Metadata(this);
      result.caption_ = caption_;
      result.creatorId_ = creatorId_;
      result.imageType_ = imageType_;
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
      if (other instanceof com.instagram_clone.image_service.Metadata) {
        return mergeFrom((com.instagram_clone.image_service.Metadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.instagram_clone.image_service.Metadata other) {
      if (other == com.instagram_clone.image_service.Metadata.getDefaultInstance()) return this;
      if (!other.getCaption().isEmpty()) {
        caption_ = other.caption_;
        onChanged();
      }
      if (!other.getCreatorId().isEmpty()) {
        creatorId_ = other.creatorId_;
        onChanged();
      }
      if (other.imageType_ != 0) {
        setImageTypeValue(other.getImageTypeValue());
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
      com.instagram_clone.image_service.Metadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.instagram_clone.image_service.Metadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object caption_ = "";
    /**
     * <pre>
     * Image caption
     * </pre>
     *
     * <code>string caption = 1;</code>
     */
    public java.lang.String getCaption() {
      java.lang.Object ref = caption_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        caption_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Image caption
     * </pre>
     *
     * <code>string caption = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCaptionBytes() {
      java.lang.Object ref = caption_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        caption_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Image caption
     * </pre>
     *
     * <code>string caption = 1;</code>
     */
    public Builder setCaption(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      caption_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Image caption
     * </pre>
     *
     * <code>string caption = 1;</code>
     */
    public Builder clearCaption() {
      
      caption_ = getDefaultInstance().getCaption();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Image caption
     * </pre>
     *
     * <code>string caption = 1;</code>
     */
    public Builder setCaptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      caption_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object creatorId_ = "";
    /**
     * <pre>
     * Image poster
     * </pre>
     *
     * <code>string creator_id = 2;</code>
     */
    public java.lang.String getCreatorId() {
      java.lang.Object ref = creatorId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        creatorId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Image poster
     * </pre>
     *
     * <code>string creator_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCreatorIdBytes() {
      java.lang.Object ref = creatorId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        creatorId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Image poster
     * </pre>
     *
     * <code>string creator_id = 2;</code>
     */
    public Builder setCreatorId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      creatorId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Image poster
     * </pre>
     *
     * <code>string creator_id = 2;</code>
     */
    public Builder clearCreatorId() {
      
      creatorId_ = getDefaultInstance().getCreatorId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Image poster
     * </pre>
     *
     * <code>string creator_id = 2;</code>
     */
    public Builder setCreatorIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      creatorId_ = value;
      onChanged();
      return this;
    }

    private int imageType_ = 0;
    /**
     * <pre>
     * Image type (png/jpg)
     * </pre>
     *
     * <code>.Image.ImageType image_type = 3;</code>
     */
    public int getImageTypeValue() {
      return imageType_;
    }
    /**
     * <pre>
     * Image type (png/jpg)
     * </pre>
     *
     * <code>.Image.ImageType image_type = 3;</code>
     */
    public Builder setImageTypeValue(int value) {
      imageType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Image type (png/jpg)
     * </pre>
     *
     * <code>.Image.ImageType image_type = 3;</code>
     */
    public com.instagram_clone.image_service.ImageType getImageType() {
      com.instagram_clone.image_service.ImageType result = com.instagram_clone.image_service.ImageType.valueOf(imageType_);
      return result == null ? com.instagram_clone.image_service.ImageType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Image type (png/jpg)
     * </pre>
     *
     * <code>.Image.ImageType image_type = 3;</code>
     */
    public Builder setImageType(com.instagram_clone.image_service.ImageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      imageType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Image type (png/jpg)
     * </pre>
     *
     * <code>.Image.ImageType image_type = 3;</code>
     */
    public Builder clearImageType() {
      
      imageType_ = 0;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:Image.Metadata)
  }

  // @@protoc_insertion_point(class_scope:Image.Metadata)
  private static final com.instagram_clone.image_service.Metadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.instagram_clone.image_service.Metadata();
  }

  public static com.instagram_clone.image_service.Metadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metadata>
      PARSER = new com.google.protobuf.AbstractParser<Metadata>() {
    public Metadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Metadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Metadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metadata> getParserForType() {
    return PARSER;
  }

  public com.instagram_clone.image_service.Metadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

