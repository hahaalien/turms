// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/user/user_status_detail.proto

package im.turms.turms.pojo.bo.user;

public interface UserStatusDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.UserStatusDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 user_id = 1;</code>
   * @return The userId.
   */
  long getUserId();

  /**
   * <code>.im.turms.proto.UserStatus user_status = 2;</code>
   * @return The enum numeric value on the wire for userStatus.
   */
  int getUserStatusValue();
  /**
   * <code>.im.turms.proto.UserStatus user_status = 2;</code>
   * @return The userStatus.
   */
  im.turms.turms.constant.UserStatus getUserStatus();

  /**
   * <code>repeated .im.turms.proto.DeviceType using_device_types = 3;</code>
   * @return A list containing the usingDeviceTypes.
   */
  java.util.List<im.turms.turms.constant.DeviceType> getUsingDeviceTypesList();
  /**
   * <code>repeated .im.turms.proto.DeviceType using_device_types = 3;</code>
   * @return The count of usingDeviceTypes.
   */
  int getUsingDeviceTypesCount();
  /**
   * <code>repeated .im.turms.proto.DeviceType using_device_types = 3;</code>
   * @param index The index of the element to return.
   * @return The usingDeviceTypes at the given index.
   */
  im.turms.turms.constant.DeviceType getUsingDeviceTypes(int index);
  /**
   * <code>repeated .im.turms.proto.DeviceType using_device_types = 3;</code>
   * @return A list containing the enum numeric values on the wire for usingDeviceTypes.
   */
  java.util.List<java.lang.Integer>
  getUsingDeviceTypesValueList();
  /**
   * <code>repeated .im.turms.proto.DeviceType using_device_types = 3;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of usingDeviceTypes at the given index.
   */
  int getUsingDeviceTypesValue(int index);
}
