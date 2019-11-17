// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/message/message.proto

package im.turms.turms.pojo.bo.message;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Int64Value id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>.google.protobuf.Int64Value id = 1;</code>
   * @return The id.
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value delivery_date = 2;</code>
   * @return Whether the deliveryDate field is set.
   */
  boolean hasDeliveryDate();
  /**
   * <code>.google.protobuf.Int64Value delivery_date = 2;</code>
   * @return The deliveryDate.
   */
  com.google.protobuf.Int64Value getDeliveryDate();
  /**
   * <code>.google.protobuf.Int64Value delivery_date = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getDeliveryDateOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value deletion_date = 3;</code>
   * @return Whether the deletionDate field is set.
   */
  boolean hasDeletionDate();
  /**
   * <code>.google.protobuf.Int64Value deletion_date = 3;</code>
   * @return The deletionDate.
   */
  com.google.protobuf.Int64Value getDeletionDate();
  /**
   * <code>.google.protobuf.Int64Value deletion_date = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getDeletionDateOrBuilder();

  /**
   * <code>.google.protobuf.StringValue text = 4;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <code>.google.protobuf.StringValue text = 4;</code>
   * @return The text.
   */
  com.google.protobuf.StringValue getText();
  /**
   * <code>.google.protobuf.StringValue text = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTextOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value sender_id = 5;</code>
   * @return Whether the senderId field is set.
   */
  boolean hasSenderId();
  /**
   * <code>.google.protobuf.Int64Value sender_id = 5;</code>
   * @return The senderId.
   */
  com.google.protobuf.Int64Value getSenderId();
  /**
   * <code>.google.protobuf.Int64Value sender_id = 5;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getSenderIdOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value group_id = 6;</code>
   * @return Whether the groupId field is set.
   */
  boolean hasGroupId();
  /**
   * <code>.google.protobuf.Int64Value group_id = 6;</code>
   * @return The groupId.
   */
  com.google.protobuf.Int64Value getGroupId();
  /**
   * <code>.google.protobuf.Int64Value group_id = 6;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getGroupIdOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value recipient_id = 7;</code>
   * @return Whether the recipientId field is set.
   */
  boolean hasRecipientId();
  /**
   * <code>.google.protobuf.Int64Value recipient_id = 7;</code>
   * @return The recipientId.
   */
  com.google.protobuf.Int64Value getRecipientId();
  /**
   * <code>.google.protobuf.Int64Value recipient_id = 7;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getRecipientIdOrBuilder();

  /**
   * <code>repeated .google.protobuf.BytesValue records = 8;</code>
   */
  java.util.List<com.google.protobuf.BytesValue> 
      getRecordsList();
  /**
   * <code>repeated .google.protobuf.BytesValue records = 8;</code>
   */
  com.google.protobuf.BytesValue getRecords(int index);
  /**
   * <code>repeated .google.protobuf.BytesValue records = 8;</code>
   */
  int getRecordsCount();
  /**
   * <code>repeated .google.protobuf.BytesValue records = 8;</code>
   */
  java.util.List<? extends com.google.protobuf.BytesValueOrBuilder> 
      getRecordsOrBuilderList();
  /**
   * <code>repeated .google.protobuf.BytesValue records = 8;</code>
   */
  com.google.protobuf.BytesValueOrBuilder getRecordsOrBuilder(
      int index);
}