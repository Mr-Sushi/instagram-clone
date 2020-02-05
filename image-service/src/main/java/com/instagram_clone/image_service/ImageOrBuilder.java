// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image_service.proto

package com.instagram_clone.image_service;

public interface ImageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Image.Image)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the image
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * ID of the image
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Type of the image, e.g. img/png or img/jpeg
   * </pre>
   *
   * <code>string type = 2;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   * Type of the image, e.g. img/png or img/jpeg
   * </pre>
   *
   * <code>string type = 2;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * Width in pixels
   * </pre>
   *
   * <code>int32 width = 3;</code>
   */
  int getWidth();

  /**
   * <pre>
   * Height in pixels
   * </pre>
   *
   * <code>int32 height = 4;</code>
   */
  int getHeight();

  /**
   * <pre>
   * Image poster ID
   * </pre>
   *
   * <code>string user_id = 5;</code>
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * Image poster ID
   * </pre>
   *
   * <code>string user_id = 5;</code>
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * Image caption
   * </pre>
   *
   * <code>string caption = 6;</code>
   */
  java.lang.String getCaption();
  /**
   * <pre>
   * Image caption
   * </pre>
   *
   * <code>string caption = 6;</code>
   */
  com.google.protobuf.ByteString
      getCaptionBytes();

  /**
   * <pre>
   * Created at timestamp
   * </pre>
   *
   * <code>string created_at = 7;</code>
   */
  java.lang.String getCreatedAt();
  /**
   * <pre>
   * Created at timestamp
   * </pre>
   *
   * <code>string created_at = 7;</code>
   */
  com.google.protobuf.ByteString
      getCreatedAtBytes();

  /**
   * <pre>
   * Users marked into the image caption
   * </pre>
   *
   * <code>repeated string user_tags = 8;</code>
   */
  java.util.List<java.lang.String>
      getUserTagsList();
  /**
   * <pre>
   * Users marked into the image caption
   * </pre>
   *
   * <code>repeated string user_tags = 8;</code>
   */
  int getUserTagsCount();
  /**
   * <pre>
   * Users marked into the image caption
   * </pre>
   *
   * <code>repeated string user_tags = 8;</code>
   */
  java.lang.String getUserTags(int index);
  /**
   * <pre>
   * Users marked into the image caption
   * </pre>
   *
   * <code>repeated string user_tags = 8;</code>
   */
  com.google.protobuf.ByteString
      getUserTagsBytes(int index);

  /**
   * <pre>
   * Hash tags marked into the image caption
   * </pre>
   *
   * <code>repeated string hash_tags = 9;</code>
   */
  java.util.List<java.lang.String>
      getHashTagsList();
  /**
   * <pre>
   * Hash tags marked into the image caption
   * </pre>
   *
   * <code>repeated string hash_tags = 9;</code>
   */
  int getHashTagsCount();
  /**
   * <pre>
   * Hash tags marked into the image caption
   * </pre>
   *
   * <code>repeated string hash_tags = 9;</code>
   */
  java.lang.String getHashTags(int index);
  /**
   * <pre>
   * Hash tags marked into the image caption
   * </pre>
   *
   * <code>repeated string hash_tags = 9;</code>
   */
  com.google.protobuf.ByteString
      getHashTagsBytes(int index);
}
