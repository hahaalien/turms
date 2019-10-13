// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: response/user/users_infos_with_version.proto

package im.turms.turms.pojo.response;

/**
 * Protobuf type {@code im.turms.proto.UsersInfosWithVersion}
 */
public  final class UsersInfosWithVersion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.UsersInfosWithVersion)
    UsersInfosWithVersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UsersInfosWithVersion.newBuilder() to construct.
  private UsersInfosWithVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UsersInfosWithVersion() {
    userInfos_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UsersInfosWithVersion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UsersInfosWithVersion(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              userInfos_ = new java.util.ArrayList<im.turms.turms.pojo.dto.UserInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            userInfos_.add(
                input.readMessage(im.turms.turms.pojo.dto.UserInfo.parser(), extensionRegistry));
            break;
          }
          case 18: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (lastUpdatedDate_ != null) {
              subBuilder = lastUpdatedDate_.toBuilder();
            }
            lastUpdatedDate_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lastUpdatedDate_);
              lastUpdatedDate_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        userInfos_ = java.util.Collections.unmodifiableList(userInfos_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.turms.turms.pojo.response.UsersInfosWithVersionOuterClass.internal_static_im_turms_proto_UsersInfosWithVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.turms.pojo.response.UsersInfosWithVersionOuterClass.internal_static_im_turms_proto_UsersInfosWithVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.turms.pojo.response.UsersInfosWithVersion.class, im.turms.turms.pojo.response.UsersInfosWithVersion.Builder.class);
  }

  public static final int USER_INFOS_FIELD_NUMBER = 1;
  private java.util.List<im.turms.turms.pojo.dto.UserInfo> userInfos_;
  /**
   * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
   */
  public java.util.List<im.turms.turms.pojo.dto.UserInfo> getUserInfosList() {
    return userInfos_;
  }
  /**
   * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
   */
  public java.util.List<? extends im.turms.turms.pojo.dto.UserInfoOrBuilder>
      getUserInfosOrBuilderList() {
    return userInfos_;
  }
  /**
   * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
   */
  public int getUserInfosCount() {
    return userInfos_.size();
  }
  /**
   * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
   */
  public im.turms.turms.pojo.dto.UserInfo getUserInfos(int index) {
    return userInfos_.get(index);
  }
  /**
   * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
   */
  public im.turms.turms.pojo.dto.UserInfoOrBuilder getUserInfosOrBuilder(
      int index) {
    return userInfos_.get(index);
  }

  public static final int LAST_UPDATED_DATE_FIELD_NUMBER = 2;
  private com.google.protobuf.Int64Value lastUpdatedDate_;
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   * @return Whether the lastUpdatedDate field is set.
   */
  public boolean hasLastUpdatedDate() {
    return lastUpdatedDate_ != null;
  }
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   * @return The lastUpdatedDate.
   */
  public com.google.protobuf.Int64Value getLastUpdatedDate() {
    return lastUpdatedDate_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : lastUpdatedDate_;
  }
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getLastUpdatedDateOrBuilder() {
    return getLastUpdatedDate();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < userInfos_.size(); i++) {
      output.writeMessage(1, userInfos_.get(i));
    }
    if (lastUpdatedDate_ != null) {
      output.writeMessage(2, getLastUpdatedDate());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < userInfos_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, userInfos_.get(i));
    }
    if (lastUpdatedDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLastUpdatedDate());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof im.turms.turms.pojo.response.UsersInfosWithVersion)) {
      return super.equals(obj);
    }
    im.turms.turms.pojo.response.UsersInfosWithVersion other = (im.turms.turms.pojo.response.UsersInfosWithVersion) obj;

    if (!getUserInfosList()
        .equals(other.getUserInfosList())) return false;
    if (hasLastUpdatedDate() != other.hasLastUpdatedDate()) return false;
    if (hasLastUpdatedDate()) {
      if (!getLastUpdatedDate()
          .equals(other.getLastUpdatedDate())) return false;
    }
    return unknownFields.equals(other.unknownFields);
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getUserInfosCount() > 0) {
      hash = (37 * hash) + USER_INFOS_FIELD_NUMBER;
      hash = (53 * hash) + getUserInfosList().hashCode();
    }
    if (hasLastUpdatedDate()) {
      hash = (37 * hash) + LAST_UPDATED_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getLastUpdatedDate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.turms.pojo.response.UsersInfosWithVersion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.turms.pojo.response.UsersInfosWithVersion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.turms.pojo.response.UsersInfosWithVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.turms.pojo.response.UsersInfosWithVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.turms.pojo.response.UsersInfosWithVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.turms.pojo.response.UsersInfosWithVersion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.turms.pojo.response.UsersInfosWithVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.turms.pojo.response.UsersInfosWithVersion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.turms.pojo.response.UsersInfosWithVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.turms.pojo.response.UsersInfosWithVersion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.turms.pojo.response.UsersInfosWithVersion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.turms.pojo.response.UsersInfosWithVersion parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(im.turms.turms.pojo.response.UsersInfosWithVersion prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code im.turms.proto.UsersInfosWithVersion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.UsersInfosWithVersion)
      im.turms.turms.pojo.response.UsersInfosWithVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.turms.pojo.response.UsersInfosWithVersionOuterClass.internal_static_im_turms_proto_UsersInfosWithVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.turms.pojo.response.UsersInfosWithVersionOuterClass.internal_static_im_turms_proto_UsersInfosWithVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.turms.pojo.response.UsersInfosWithVersion.class, im.turms.turms.pojo.response.UsersInfosWithVersion.Builder.class);
    }

    // Construct using im.turms.turms.pojo.response.UsersInfosWithVersion.newBuilder()
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
        getUserInfosFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userInfosBuilder_ == null) {
        userInfos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        userInfosBuilder_.clear();
      }
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDate_ = null;
      } else {
        lastUpdatedDate_ = null;
        lastUpdatedDateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.turms.pojo.response.UsersInfosWithVersionOuterClass.internal_static_im_turms_proto_UsersInfosWithVersion_descriptor;
    }

    @java.lang.Override
    public im.turms.turms.pojo.response.UsersInfosWithVersion getDefaultInstanceForType() {
      return im.turms.turms.pojo.response.UsersInfosWithVersion.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.turms.pojo.response.UsersInfosWithVersion build() {
      im.turms.turms.pojo.response.UsersInfosWithVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.turms.pojo.response.UsersInfosWithVersion buildPartial() {
      im.turms.turms.pojo.response.UsersInfosWithVersion result = new im.turms.turms.pojo.response.UsersInfosWithVersion(this);
      int from_bitField0_ = bitField0_;
      if (userInfosBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          userInfos_ = java.util.Collections.unmodifiableList(userInfos_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.userInfos_ = userInfos_;
      } else {
        result.userInfos_ = userInfosBuilder_.build();
      }
      if (lastUpdatedDateBuilder_ == null) {
        result.lastUpdatedDate_ = lastUpdatedDate_;
      } else {
        result.lastUpdatedDate_ = lastUpdatedDateBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof im.turms.turms.pojo.response.UsersInfosWithVersion) {
        return mergeFrom((im.turms.turms.pojo.response.UsersInfosWithVersion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.turms.pojo.response.UsersInfosWithVersion other) {
      if (other == im.turms.turms.pojo.response.UsersInfosWithVersion.getDefaultInstance()) return this;
      if (userInfosBuilder_ == null) {
        if (!other.userInfos_.isEmpty()) {
          if (userInfos_.isEmpty()) {
            userInfos_ = other.userInfos_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserInfosIsMutable();
            userInfos_.addAll(other.userInfos_);
          }
          onChanged();
        }
      } else {
        if (!other.userInfos_.isEmpty()) {
          if (userInfosBuilder_.isEmpty()) {
            userInfosBuilder_.dispose();
            userInfosBuilder_ = null;
            userInfos_ = other.userInfos_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userInfosBuilder_ =
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserInfosFieldBuilder() : null;
          } else {
            userInfosBuilder_.addAllMessages(other.userInfos_);
          }
        }
      }
      if (other.hasLastUpdatedDate()) {
        mergeLastUpdatedDate(other.getLastUpdatedDate());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      im.turms.turms.pojo.response.UsersInfosWithVersion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.turms.pojo.response.UsersInfosWithVersion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<im.turms.turms.pojo.dto.UserInfo> userInfos_ =
      java.util.Collections.emptyList();
    private void ensureUserInfosIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        userInfos_ = new java.util.ArrayList<im.turms.turms.pojo.dto.UserInfo>(userInfos_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        im.turms.turms.pojo.dto.UserInfo, im.turms.turms.pojo.dto.UserInfo.Builder, im.turms.turms.pojo.dto.UserInfoOrBuilder> userInfosBuilder_;

    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public java.util.List<im.turms.turms.pojo.dto.UserInfo> getUserInfosList() {
      if (userInfosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userInfos_);
      } else {
        return userInfosBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public int getUserInfosCount() {
      if (userInfosBuilder_ == null) {
        return userInfos_.size();
      } else {
        return userInfosBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public im.turms.turms.pojo.dto.UserInfo getUserInfos(int index) {
      if (userInfosBuilder_ == null) {
        return userInfos_.get(index);
      } else {
        return userInfosBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder setUserInfos(
        int index, im.turms.turms.pojo.dto.UserInfo value) {
      if (userInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserInfosIsMutable();
        userInfos_.set(index, value);
        onChanged();
      } else {
        userInfosBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder setUserInfos(
        int index, im.turms.turms.pojo.dto.UserInfo.Builder builderForValue) {
      if (userInfosBuilder_ == null) {
        ensureUserInfosIsMutable();
        userInfos_.set(index, builderForValue.build());
        onChanged();
      } else {
        userInfosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder addUserInfos(im.turms.turms.pojo.dto.UserInfo value) {
      if (userInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserInfosIsMutable();
        userInfos_.add(value);
        onChanged();
      } else {
        userInfosBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder addUserInfos(
        int index, im.turms.turms.pojo.dto.UserInfo value) {
      if (userInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserInfosIsMutable();
        userInfos_.add(index, value);
        onChanged();
      } else {
        userInfosBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder addUserInfos(
        im.turms.turms.pojo.dto.UserInfo.Builder builderForValue) {
      if (userInfosBuilder_ == null) {
        ensureUserInfosIsMutable();
        userInfos_.add(builderForValue.build());
        onChanged();
      } else {
        userInfosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder addUserInfos(
        int index, im.turms.turms.pojo.dto.UserInfo.Builder builderForValue) {
      if (userInfosBuilder_ == null) {
        ensureUserInfosIsMutable();
        userInfos_.add(index, builderForValue.build());
        onChanged();
      } else {
        userInfosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder addAllUserInfos(
        java.lang.Iterable<? extends im.turms.turms.pojo.dto.UserInfo> values) {
      if (userInfosBuilder_ == null) {
        ensureUserInfosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, userInfos_);
        onChanged();
      } else {
        userInfosBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder clearUserInfos() {
      if (userInfosBuilder_ == null) {
        userInfos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userInfosBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder removeUserInfos(int index) {
      if (userInfosBuilder_ == null) {
        ensureUserInfosIsMutable();
        userInfos_.remove(index);
        onChanged();
      } else {
        userInfosBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public im.turms.turms.pojo.dto.UserInfo.Builder getUserInfosBuilder(
        int index) {
      return getUserInfosFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public im.turms.turms.pojo.dto.UserInfoOrBuilder getUserInfosOrBuilder(
        int index) {
      if (userInfosBuilder_ == null) {
        return userInfos_.get(index);  } else {
        return userInfosBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public java.util.List<? extends im.turms.turms.pojo.dto.UserInfoOrBuilder>
         getUserInfosOrBuilderList() {
      if (userInfosBuilder_ != null) {
        return userInfosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userInfos_);
      }
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public im.turms.turms.pojo.dto.UserInfo.Builder addUserInfosBuilder() {
      return getUserInfosFieldBuilder().addBuilder(
          im.turms.turms.pojo.dto.UserInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public im.turms.turms.pojo.dto.UserInfo.Builder addUserInfosBuilder(
        int index) {
      return getUserInfosFieldBuilder().addBuilder(
          index, im.turms.turms.pojo.dto.UserInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public java.util.List<im.turms.turms.pojo.dto.UserInfo.Builder>
         getUserInfosBuilderList() {
      return getUserInfosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        im.turms.turms.pojo.dto.UserInfo, im.turms.turms.pojo.dto.UserInfo.Builder, im.turms.turms.pojo.dto.UserInfoOrBuilder>
        getUserInfosFieldBuilder() {
      if (userInfosBuilder_ == null) {
        userInfosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            im.turms.turms.pojo.dto.UserInfo, im.turms.turms.pojo.dto.UserInfo.Builder, im.turms.turms.pojo.dto.UserInfoOrBuilder>(
                userInfos_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        userInfos_ = null;
      }
      return userInfosBuilder_;
    }

    private com.google.protobuf.Int64Value lastUpdatedDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> lastUpdatedDateBuilder_;
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     * @return Whether the lastUpdatedDate field is set.
     */
    public boolean hasLastUpdatedDate() {
      return lastUpdatedDateBuilder_ != null || lastUpdatedDate_ != null;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     * @return The lastUpdatedDate.
     */
    public com.google.protobuf.Int64Value getLastUpdatedDate() {
      if (lastUpdatedDateBuilder_ == null) {
        return lastUpdatedDate_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : lastUpdatedDate_;
      } else {
        return lastUpdatedDateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public Builder setLastUpdatedDate(com.google.protobuf.Int64Value value) {
      if (lastUpdatedDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastUpdatedDate_ = value;
        onChanged();
      } else {
        lastUpdatedDateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public Builder setLastUpdatedDate(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDate_ = builderForValue.build();
        onChanged();
      } else {
        lastUpdatedDateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public Builder mergeLastUpdatedDate(com.google.protobuf.Int64Value value) {
      if (lastUpdatedDateBuilder_ == null) {
        if (lastUpdatedDate_ != null) {
          lastUpdatedDate_ =
            com.google.protobuf.Int64Value.newBuilder(lastUpdatedDate_).mergeFrom(value).buildPartial();
        } else {
          lastUpdatedDate_ = value;
        }
        onChanged();
      } else {
        lastUpdatedDateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public Builder clearLastUpdatedDate() {
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDate_ = null;
        onChanged();
      } else {
        lastUpdatedDate_ = null;
        lastUpdatedDateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public com.google.protobuf.Int64Value.Builder getLastUpdatedDateBuilder() {

      onChanged();
      return getLastUpdatedDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getLastUpdatedDateOrBuilder() {
      if (lastUpdatedDateBuilder_ != null) {
        return lastUpdatedDateBuilder_.getMessageOrBuilder();
      } else {
        return lastUpdatedDate_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : lastUpdatedDate_;
      }
    }
    /**
     * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>
        getLastUpdatedDateFieldBuilder() {
      if (lastUpdatedDateBuilder_ == null) {
        lastUpdatedDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getLastUpdatedDate(),
                getParentForChildren(),
                isClean());
        lastUpdatedDate_ = null;
      }
      return lastUpdatedDateBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:im.turms.proto.UsersInfosWithVersion)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.UsersInfosWithVersion)
  private static final im.turms.turms.pojo.response.UsersInfosWithVersion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.turms.pojo.response.UsersInfosWithVersion();
  }

  public static im.turms.turms.pojo.response.UsersInfosWithVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UsersInfosWithVersion>
      PARSER = new com.google.protobuf.AbstractParser<UsersInfosWithVersion>() {
    @java.lang.Override
    public UsersInfosWithVersion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UsersInfosWithVersion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UsersInfosWithVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UsersInfosWithVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.turms.pojo.response.UsersInfosWithVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

