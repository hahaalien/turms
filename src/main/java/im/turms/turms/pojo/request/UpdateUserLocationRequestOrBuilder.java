// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/update_user_location_request.proto

package im.turms.turms.pojo.request;

public interface UpdateUserLocationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.UpdateUserLocationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>float latitude = 1;</code>
   * @return The latitude.
   */
  float getLatitude();

  /**
   * <code>float longitude = 2;</code>
   * @return The longitude.
   */
  float getLongitude();

  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <code>.google.protobuf.StringValue address = 4;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.google.protobuf.StringValue address = 4;</code>
   * @return The address.
   */
  com.google.protobuf.StringValue getAddress();
  /**
   * <code>.google.protobuf.StringValue address = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getAddressOrBuilder();
}
