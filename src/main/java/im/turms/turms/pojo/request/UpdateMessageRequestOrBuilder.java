// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/message/update_message_request.proto

package im.turms.turms.pojo.request;

public interface UpdateMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.UpdateMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 message_id = 1;</code>
   * @return The messageId.
   */
  long getMessageId();

  /**
   * <code>.google.protobuf.StringValue text = 2;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <code>.google.protobuf.StringValue text = 2;</code>
   * @return The text.
   */
  com.google.protobuf.StringValue getText();
  /**
   * <code>.google.protobuf.StringValue text = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTextOrBuilder();

  /**
   * <code>repeated bytes records = 3;</code>
   * @return A list containing the records.
   */
  java.util.List<com.google.protobuf.ByteString> getRecordsList();
  /**
   * <code>repeated bytes records = 3;</code>
   * @return The count of records.
   */
  int getRecordsCount();
  /**
   * <code>repeated bytes records = 3;</code>
   * @param index The index of the element to return.
   * @return The records at the given index.
   */
  com.google.protobuf.ByteString getRecords(int index);

  /**
   * <code>.google.protobuf.Int64Value recallDate = 4;</code>
   * @return Whether the recallDate field is set.
   */
  boolean hasRecallDate();
  /**
   * <code>.google.protobuf.Int64Value recallDate = 4;</code>
   * @return The recallDate.
   */
  com.google.protobuf.Int64Value getRecallDate();
  /**
   * <code>.google.protobuf.Int64Value recallDate = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getRecallDateOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value readDate = 5;</code>
   * @return Whether the readDate field is set.
   */
  boolean hasReadDate();
  /**
   * <code>.google.protobuf.Int64Value readDate = 5;</code>
   * @return The readDate.
   */
  com.google.protobuf.Int64Value getReadDate();
  /**
   * <code>.google.protobuf.Int64Value readDate = 5;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getReadDateOrBuilder();
}
