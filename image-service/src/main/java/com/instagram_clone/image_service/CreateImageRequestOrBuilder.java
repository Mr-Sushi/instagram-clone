// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image_service.proto

package com.instagram_clone.image_service;

public interface CreateImageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Image.CreateImageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Image.Metadata meta_data = 1;</code>
   */
  com.instagram_clone.image_service.Metadata getMetaData();
  /**
   * <code>.Image.Metadata meta_data = 1;</code>
   */
  com.instagram_clone.image_service.MetadataOrBuilder getMetaDataOrBuilder();

  /**
   * <code>bytes data = 2;</code>
   */
  com.google.protobuf.ByteString getData();

  public com.instagram_clone.image_service.CreateImageRequest.PartCase getPartCase();
}