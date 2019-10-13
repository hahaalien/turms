// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/message/query_messages_request.proto

package im.turms.turms.pojo.request;

public interface QueryMessagesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.QueryMessagesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Int32Value size = 1;</code>
   * @return Whether the size field is set.
   */
  boolean hasSize();
  /**
   * <code>.google.protobuf.Int32Value size = 1;</code>
   * @return The size.
   */
  com.google.protobuf.Int32Value getSize();
  /**
   * <code>.google.protobuf.Int32Value size = 1;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getSizeOrBuilder();

  /**
   * <code>.im.turms.proto.ChatType chat_type = 2;</code>
   * @return The enum numeric value on the wire for chatType.
   */
  int getChatTypeValue();
  /**
   * <code>.im.turms.proto.ChatType chat_type = 2;</code>
   * @return The chatType.
   */
  im.turms.turms.constant.ChatType getChatType();

  /**
   * <code>.google.protobuf.Int64Value from_id = 3;</code>
   * @return Whether the fromId field is set.
   */
  boolean hasFromId();
  /**
   * <code>.google.protobuf.Int64Value from_id = 3;</code>
   * @return The fromId.
   */
  com.google.protobuf.Int64Value getFromId();
  /**
   * <code>.google.protobuf.Int64Value from_id = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getFromIdOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value delivery_date_after = 4;</code>
   * @return Whether the deliveryDateAfter field is set.
   */
  boolean hasDeliveryDateAfter();
  /**
   * <code>.google.protobuf.Int64Value delivery_date_after = 4;</code>
   * @return The deliveryDateAfter.
   */
  com.google.protobuf.Int64Value getDeliveryDateAfter();
  /**
   * <code>.google.protobuf.Int64Value delivery_date_after = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getDeliveryDateAfterOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value delivery_date_before = 5;</code>
   * @return Whether the deliveryDateBefore field is set.
   */
  boolean hasDeliveryDateBefore();
  /**
   * <code>.google.protobuf.Int64Value delivery_date_before = 5;</code>
   * @return The deliveryDateBefore.
   */
  com.google.protobuf.Int64Value getDeliveryDateBefore();
  /**
   * <code>.google.protobuf.Int64Value delivery_date_before = 5;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getDeliveryDateBeforeOrBuilder();

  /**
   * <code>.im.turms.proto.MessageDeliveryStatus delivery_status = 6;</code>
   * @return The enum numeric value on the wire for deliveryStatus.
   */
  int getDeliveryStatusValue();
  /**
   * <code>.im.turms.proto.MessageDeliveryStatus delivery_status = 6;</code>
   * @return The deliveryStatus.
   */
  im.turms.turms.constant.MessageDeliveryStatus getDeliveryStatus();
}
