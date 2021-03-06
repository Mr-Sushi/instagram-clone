// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comment_service.proto

package com.instagram_clone.comment_service;

/**
 * Protobuf type {@code Comment.PagedCommentList}
 */
public  final class PagedCommentList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Comment.PagedCommentList)
    PagedCommentListOrBuilder {
  // Use PagedCommentList.newBuilder() to construct.
  private PagedCommentList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PagedCommentList() {
    comments_ = java.util.Collections.emptyList();
    page_ = 0;
    totalCount_ = 0;
    count_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PagedCommentList(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              comments_ = new java.util.ArrayList<com.instagram_clone.comment_service.Comment>();
              mutable_bitField0_ |= 0x00000001;
            }
            comments_.add(
                input.readMessage(com.instagram_clone.comment_service.Comment.parser(), extensionRegistry));
            break;
          }
          case 16: {

            page_ = input.readInt32();
            break;
          }
          case 24: {

            totalCount_ = input.readInt32();
            break;
          }
          case 32: {

            count_ = input.readInt32();
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        comments_ = java.util.Collections.unmodifiableList(comments_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.instagram_clone.comment_service.CommentService.internal_static_Comment_PagedCommentList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.instagram_clone.comment_service.CommentService.internal_static_Comment_PagedCommentList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.instagram_clone.comment_service.PagedCommentList.class, com.instagram_clone.comment_service.PagedCommentList.Builder.class);
  }

  private int bitField0_;
  public static final int COMMENTS_FIELD_NUMBER = 1;
  private java.util.List<com.instagram_clone.comment_service.Comment> comments_;
  /**
   * <code>repeated .Comment.Comment comments = 1;</code>
   */
  public java.util.List<com.instagram_clone.comment_service.Comment> getCommentsList() {
    return comments_;
  }
  /**
   * <code>repeated .Comment.Comment comments = 1;</code>
   */
  public java.util.List<? extends com.instagram_clone.comment_service.CommentOrBuilder> 
      getCommentsOrBuilderList() {
    return comments_;
  }
  /**
   * <code>repeated .Comment.Comment comments = 1;</code>
   */
  public int getCommentsCount() {
    return comments_.size();
  }
  /**
   * <code>repeated .Comment.Comment comments = 1;</code>
   */
  public com.instagram_clone.comment_service.Comment getComments(int index) {
    return comments_.get(index);
  }
  /**
   * <code>repeated .Comment.Comment comments = 1;</code>
   */
  public com.instagram_clone.comment_service.CommentOrBuilder getCommentsOrBuilder(
      int index) {
    return comments_.get(index);
  }

  public static final int PAGE_FIELD_NUMBER = 2;
  private int page_;
  /**
   * <code>int32 page = 2;</code>
   */
  public int getPage() {
    return page_;
  }

  public static final int TOTALCOUNT_FIELD_NUMBER = 3;
  private int totalCount_;
  /**
   * <code>int32 totalCount = 3;</code>
   */
  public int getTotalCount() {
    return totalCount_;
  }

  public static final int COUNT_FIELD_NUMBER = 4;
  private int count_;
  /**
   * <code>int32 count = 4;</code>
   */
  public int getCount() {
    return count_;
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
    for (int i = 0; i < comments_.size(); i++) {
      output.writeMessage(1, comments_.get(i));
    }
    if (page_ != 0) {
      output.writeInt32(2, page_);
    }
    if (totalCount_ != 0) {
      output.writeInt32(3, totalCount_);
    }
    if (count_ != 0) {
      output.writeInt32(4, count_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < comments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, comments_.get(i));
    }
    if (page_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, page_);
    }
    if (totalCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, totalCount_);
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, count_);
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
    if (!(obj instanceof com.instagram_clone.comment_service.PagedCommentList)) {
      return super.equals(obj);
    }
    com.instagram_clone.comment_service.PagedCommentList other = (com.instagram_clone.comment_service.PagedCommentList) obj;

    boolean result = true;
    result = result && getCommentsList()
        .equals(other.getCommentsList());
    result = result && (getPage()
        == other.getPage());
    result = result && (getTotalCount()
        == other.getTotalCount());
    result = result && (getCount()
        == other.getCount());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCommentsCount() > 0) {
      hash = (37 * hash) + COMMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getCommentsList().hashCode();
    }
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPage();
    hash = (37 * hash) + TOTALCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getTotalCount();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.instagram_clone.comment_service.PagedCommentList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.instagram_clone.comment_service.PagedCommentList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.instagram_clone.comment_service.PagedCommentList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.instagram_clone.comment_service.PagedCommentList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.instagram_clone.comment_service.PagedCommentList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.instagram_clone.comment_service.PagedCommentList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.instagram_clone.comment_service.PagedCommentList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.instagram_clone.comment_service.PagedCommentList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.instagram_clone.comment_service.PagedCommentList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.instagram_clone.comment_service.PagedCommentList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.instagram_clone.comment_service.PagedCommentList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.instagram_clone.comment_service.PagedCommentList parseFrom(
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
  public static Builder newBuilder(com.instagram_clone.comment_service.PagedCommentList prototype) {
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
   * Protobuf type {@code Comment.PagedCommentList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Comment.PagedCommentList)
      com.instagram_clone.comment_service.PagedCommentListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.instagram_clone.comment_service.CommentService.internal_static_Comment_PagedCommentList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.instagram_clone.comment_service.CommentService.internal_static_Comment_PagedCommentList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.instagram_clone.comment_service.PagedCommentList.class, com.instagram_clone.comment_service.PagedCommentList.Builder.class);
    }

    // Construct using com.instagram_clone.comment_service.PagedCommentList.newBuilder()
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
        getCommentsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (commentsBuilder_ == null) {
        comments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        commentsBuilder_.clear();
      }
      page_ = 0;

      totalCount_ = 0;

      count_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.instagram_clone.comment_service.CommentService.internal_static_Comment_PagedCommentList_descriptor;
    }

    public com.instagram_clone.comment_service.PagedCommentList getDefaultInstanceForType() {
      return com.instagram_clone.comment_service.PagedCommentList.getDefaultInstance();
    }

    public com.instagram_clone.comment_service.PagedCommentList build() {
      com.instagram_clone.comment_service.PagedCommentList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.instagram_clone.comment_service.PagedCommentList buildPartial() {
      com.instagram_clone.comment_service.PagedCommentList result = new com.instagram_clone.comment_service.PagedCommentList(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (commentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          comments_ = java.util.Collections.unmodifiableList(comments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.comments_ = comments_;
      } else {
        result.comments_ = commentsBuilder_.build();
      }
      result.page_ = page_;
      result.totalCount_ = totalCount_;
      result.count_ = count_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.instagram_clone.comment_service.PagedCommentList) {
        return mergeFrom((com.instagram_clone.comment_service.PagedCommentList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.instagram_clone.comment_service.PagedCommentList other) {
      if (other == com.instagram_clone.comment_service.PagedCommentList.getDefaultInstance()) return this;
      if (commentsBuilder_ == null) {
        if (!other.comments_.isEmpty()) {
          if (comments_.isEmpty()) {
            comments_ = other.comments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCommentsIsMutable();
            comments_.addAll(other.comments_);
          }
          onChanged();
        }
      } else {
        if (!other.comments_.isEmpty()) {
          if (commentsBuilder_.isEmpty()) {
            commentsBuilder_.dispose();
            commentsBuilder_ = null;
            comments_ = other.comments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            commentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCommentsFieldBuilder() : null;
          } else {
            commentsBuilder_.addAllMessages(other.comments_);
          }
        }
      }
      if (other.getPage() != 0) {
        setPage(other.getPage());
      }
      if (other.getTotalCount() != 0) {
        setTotalCount(other.getTotalCount());
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
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
      com.instagram_clone.comment_service.PagedCommentList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.instagram_clone.comment_service.PagedCommentList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.instagram_clone.comment_service.Comment> comments_ =
      java.util.Collections.emptyList();
    private void ensureCommentsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        comments_ = new java.util.ArrayList<com.instagram_clone.comment_service.Comment>(comments_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.instagram_clone.comment_service.Comment, com.instagram_clone.comment_service.Comment.Builder, com.instagram_clone.comment_service.CommentOrBuilder> commentsBuilder_;

    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public java.util.List<com.instagram_clone.comment_service.Comment> getCommentsList() {
      if (commentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(comments_);
      } else {
        return commentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public int getCommentsCount() {
      if (commentsBuilder_ == null) {
        return comments_.size();
      } else {
        return commentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public com.instagram_clone.comment_service.Comment getComments(int index) {
      if (commentsBuilder_ == null) {
        return comments_.get(index);
      } else {
        return commentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public Builder setComments(
        int index, com.instagram_clone.comment_service.Comment value) {
      if (commentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommentsIsMutable();
        comments_.set(index, value);
        onChanged();
      } else {
        commentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public Builder setComments(
        int index, com.instagram_clone.comment_service.Comment.Builder builderForValue) {
      if (commentsBuilder_ == null) {
        ensureCommentsIsMutable();
        comments_.set(index, builderForValue.build());
        onChanged();
      } else {
        commentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public Builder addComments(com.instagram_clone.comment_service.Comment value) {
      if (commentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommentsIsMutable();
        comments_.add(value);
        onChanged();
      } else {
        commentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public Builder addComments(
        int index, com.instagram_clone.comment_service.Comment value) {
      if (commentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommentsIsMutable();
        comments_.add(index, value);
        onChanged();
      } else {
        commentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public Builder addComments(
        com.instagram_clone.comment_service.Comment.Builder builderForValue) {
      if (commentsBuilder_ == null) {
        ensureCommentsIsMutable();
        comments_.add(builderForValue.build());
        onChanged();
      } else {
        commentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public Builder addComments(
        int index, com.instagram_clone.comment_service.Comment.Builder builderForValue) {
      if (commentsBuilder_ == null) {
        ensureCommentsIsMutable();
        comments_.add(index, builderForValue.build());
        onChanged();
      } else {
        commentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public Builder addAllComments(
        java.lang.Iterable<? extends com.instagram_clone.comment_service.Comment> values) {
      if (commentsBuilder_ == null) {
        ensureCommentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, comments_);
        onChanged();
      } else {
        commentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public Builder clearComments() {
      if (commentsBuilder_ == null) {
        comments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        commentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public Builder removeComments(int index) {
      if (commentsBuilder_ == null) {
        ensureCommentsIsMutable();
        comments_.remove(index);
        onChanged();
      } else {
        commentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public com.instagram_clone.comment_service.Comment.Builder getCommentsBuilder(
        int index) {
      return getCommentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public com.instagram_clone.comment_service.CommentOrBuilder getCommentsOrBuilder(
        int index) {
      if (commentsBuilder_ == null) {
        return comments_.get(index);  } else {
        return commentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public java.util.List<? extends com.instagram_clone.comment_service.CommentOrBuilder> 
         getCommentsOrBuilderList() {
      if (commentsBuilder_ != null) {
        return commentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(comments_);
      }
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public com.instagram_clone.comment_service.Comment.Builder addCommentsBuilder() {
      return getCommentsFieldBuilder().addBuilder(
          com.instagram_clone.comment_service.Comment.getDefaultInstance());
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public com.instagram_clone.comment_service.Comment.Builder addCommentsBuilder(
        int index) {
      return getCommentsFieldBuilder().addBuilder(
          index, com.instagram_clone.comment_service.Comment.getDefaultInstance());
    }
    /**
     * <code>repeated .Comment.Comment comments = 1;</code>
     */
    public java.util.List<com.instagram_clone.comment_service.Comment.Builder> 
         getCommentsBuilderList() {
      return getCommentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.instagram_clone.comment_service.Comment, com.instagram_clone.comment_service.Comment.Builder, com.instagram_clone.comment_service.CommentOrBuilder> 
        getCommentsFieldBuilder() {
      if (commentsBuilder_ == null) {
        commentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.instagram_clone.comment_service.Comment, com.instagram_clone.comment_service.Comment.Builder, com.instagram_clone.comment_service.CommentOrBuilder>(
                comments_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        comments_ = null;
      }
      return commentsBuilder_;
    }

    private int page_ ;
    /**
     * <code>int32 page = 2;</code>
     */
    public int getPage() {
      return page_;
    }
    /**
     * <code>int32 page = 2;</code>
     */
    public Builder setPage(int value) {
      
      page_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page = 2;</code>
     */
    public Builder clearPage() {
      
      page_ = 0;
      onChanged();
      return this;
    }

    private int totalCount_ ;
    /**
     * <code>int32 totalCount = 3;</code>
     */
    public int getTotalCount() {
      return totalCount_;
    }
    /**
     * <code>int32 totalCount = 3;</code>
     */
    public Builder setTotalCount(int value) {
      
      totalCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 totalCount = 3;</code>
     */
    public Builder clearTotalCount() {
      
      totalCount_ = 0;
      onChanged();
      return this;
    }

    private int count_ ;
    /**
     * <code>int32 count = 4;</code>
     */
    public int getCount() {
      return count_;
    }
    /**
     * <code>int32 count = 4;</code>
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 count = 4;</code>
     */
    public Builder clearCount() {
      
      count_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Comment.PagedCommentList)
  }

  // @@protoc_insertion_point(class_scope:Comment.PagedCommentList)
  private static final com.instagram_clone.comment_service.PagedCommentList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.instagram_clone.comment_service.PagedCommentList();
  }

  public static com.instagram_clone.comment_service.PagedCommentList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PagedCommentList>
      PARSER = new com.google.protobuf.AbstractParser<PagedCommentList>() {
    public PagedCommentList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PagedCommentList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PagedCommentList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PagedCommentList> getParserForType() {
    return PARSER;
  }

  public com.instagram_clone.comment_service.PagedCommentList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

