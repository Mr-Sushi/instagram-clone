// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image_service.proto

package com.instagram_clone.image_service;

public interface GetImageDataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Image.GetImageDataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes data = 1;</code>
   */
  com.google.protobuf.ByteString getData();

  /**
   * <code>.Image.ImageType image_type = 2;</code>
   */
  int getImageTypeValue();
  /**
   * <code>.Image.ImageType image_type = 2;</code>
   */
  com.instagram_clone.image_service.ImageType getImageType();

  /**
   * <code>.Image.GetImageErrorStatus error = 3;</code>
   */
  int getErrorValue();
  /**
   * <code>.Image.GetImageErrorStatus error = 3;</code>
   */
  com.instagram_clone.image_service.GetImageErrorStatus getError();

  public com.instagram_clone.image_service.GetImageDataResponse.StatusCase getStatusCase();
}