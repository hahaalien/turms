// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/relationship/query_related_users_ids_request.proto

package im.turms.turms.pojo.request;

public interface QueryRelatedUsersIdsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.QueryRelatedUsersIdsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.BoolValue is_blocked = 1;</code>
   * @return Whether the isBlocked field is set.
   */
  boolean hasIsBlocked();
  /**
   * <code>.google.protobuf.BoolValue is_blocked = 1;</code>
   * @return The isBlocked.
   */
  com.google.protobuf.BoolValue getIsBlocked();
  /**
   * <code>.google.protobuf.BoolValue is_blocked = 1;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getIsBlockedOrBuilder();

  /**
   * <code>.google.protobuf.Int32Value group_index = 2;</code>
   * @return Whether the groupIndex field is set.
   */
  boolean hasGroupIndex();
  /**
   * <code>.google.protobuf.Int32Value group_index = 2;</code>
   * @return The groupIndex.
   */
  com.google.protobuf.Int32Value getGroupIndex();
  /**
   * <code>.google.protobuf.Int32Value group_index = 2;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getGroupIndexOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 3;</code>
   * @return Whether the lastUpdatedDate field is set.
   */
  boolean hasLastUpdatedDate();
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 3;</code>
   * @return The lastUpdatedDate.
   */
  com.google.protobuf.Int64Value getLastUpdatedDate();
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getLastUpdatedDateOrBuilder();
}
