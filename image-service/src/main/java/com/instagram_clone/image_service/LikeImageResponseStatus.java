// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image_service.proto

package com.instagram_clone.image_service;

/**
 * Protobuf enum {@code Image.LikeImageResponseStatus}
 */
public enum LikeImageResponseStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LIKE_IMAGE_SERVER_ERROR = 0;</code>
   */
  LIKE_IMAGE_SERVER_ERROR(0),
  /**
   * <code>IMAGE_NOT_FOUND_ERROR = 1;</code>
   */
  IMAGE_NOT_FOUND_ERROR(1),
  /**
   * <code>USER_NOT_FOUND_ERROR = 2;</code>
   */
  USER_NOT_FOUND_ERROR(2),
  /**
   * <code>LIKE_OK = 3;</code>
   */
  LIKE_OK(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LIKE_IMAGE_SERVER_ERROR = 0;</code>
   */
  public static final int LIKE_IMAGE_SERVER_ERROR_VALUE = 0;
  /**
   * <code>IMAGE_NOT_FOUND_ERROR = 1;</code>
   */
  public static final int IMAGE_NOT_FOUND_ERROR_VALUE = 1;
  /**
   * <code>USER_NOT_FOUND_ERROR = 2;</code>
   */
  public static final int USER_NOT_FOUND_ERROR_VALUE = 2;
  /**
   * <code>LIKE_OK = 3;</code>
   */
  public static final int LIKE_OK_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static LikeImageResponseStatus valueOf(int value) {
    return forNumber(value);
  }

  public static LikeImageResponseStatus forNumber(int value) {
    switch (value) {
      case 0: return LIKE_IMAGE_SERVER_ERROR;
      case 1: return IMAGE_NOT_FOUND_ERROR;
      case 2: return USER_NOT_FOUND_ERROR;
      case 3: return LIKE_OK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LikeImageResponseStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LikeImageResponseStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LikeImageResponseStatus>() {
          public LikeImageResponseStatus findValueByNumber(int number) {
            return LikeImageResponseStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.instagram_clone.image_service.ImageService.getDescriptor().getEnumTypes().get(5);
  }

  private static final LikeImageResponseStatus[] VALUES = values();

  public static LikeImageResponseStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private LikeImageResponseStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Image.LikeImageResponseStatus)
}

