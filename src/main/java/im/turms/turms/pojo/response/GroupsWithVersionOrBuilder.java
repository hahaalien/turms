// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: response/group/groups_with_version.proto

package im.turms.turms.pojo.response;

public interface GroupsWithVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.GroupsWithVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .im.turms.proto.Group groups = 1;</code>
   */
  java.util.List<im.turms.turms.pojo.dto.Group> 
      getGroupsList();
  /**
   * <code>repeated .im.turms.proto.Group groups = 1;</code>
   */
  im.turms.turms.pojo.dto.Group getGroups(int index);
  /**
   * <code>repeated .im.turms.proto.Group groups = 1;</code>
   */
  int getGroupsCount();
  /**
   * <code>repeated .im.turms.proto.Group groups = 1;</code>
   */
  java.util.List<? extends im.turms.turms.pojo.dto.GroupOrBuilder> 
      getGroupsOrBuilderList();
  /**
   * <code>repeated .im.turms.proto.Group groups = 1;</code>
   */
  im.turms.turms.pojo.dto.GroupOrBuilder getGroupsOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   * @return Whether the lastUpdatedDate field is set.
   */
  boolean hasLastUpdatedDate();
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   * @return The lastUpdatedDate.
   */
  com.google.protobuf.Int64Value getLastUpdatedDate();
  /**
   * <code>.google.protobuf.Int64Value last_updated_date = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getLastUpdatedDateOrBuilder();
}
