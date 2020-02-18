// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image_service.proto

package com.instagram_clone.image_service;

public interface MetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Image.Metadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Image caption
   * </pre>
   *
   * <code>string caption = 1;</code>
   */
  java.lang.String getCaption();
  /**
   * <pre>
   * Image caption
   * </pre>
   *
   * <code>string caption = 1;</code>
   */
  com.google.protobuf.ByteString
      getCaptionBytes();

  /**
   * <pre>
   * Image poster
   * </pre>
   *
   * <code>string creator_id = 2;</code>
   */
  java.lang.String getCreatorId();
  /**
   * <pre>
   * Image poster
   * </pre>
   *
   * <code>string creator_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getCreatorIdBytes();

  /**
   * <pre>
   * Image type (png/jpg)
   * </pre>
   *
   * <code>.Image.ImageType image_type = 3;</code>
   */
  int getImageTypeValue();
  /**
   * <pre>
   * Image type (png/jpg)
   * </pre>
   *
   * <code>.Image.ImageType image_type = 3;</code>
   */
  com.instagram_clone.image_service.ImageType getImageType();
}