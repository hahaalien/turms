// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: response/user/user_relationships_with_version.proto

package im.turms.turms.pojo.response;

public final class UserRelationshipsWithVersionOuterClass {
  private UserRelationshipsWithVersionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_UserRelationshipsWithVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_UserRelationshipsWithVersion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3response/user/user_relationships_with_" +
      "version.proto\022\016im.turms.proto\032\036google/pr" +
      "otobuf/wrappers.proto\032 dto/user/user_rel" +
      "ationship.proto\"\224\001\n\034UserRelationshipsWit" +
      "hVersion\022<\n\022user_relationships\030\001 \003(\0132 .i" +
      "m.turms.proto.UserRelationship\0226\n\021last_u" +
      "pdated_date\030\002 \001(\0132\033.google.protobuf.Int6" +
      "4ValueB \n\034im.turms.turms.pojo.responseP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          im.turms.turms.pojo.dto.UserRelationshipOuterClass.getDescriptor(),
        });
    internal_static_im_turms_proto_UserRelationshipsWithVersion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_UserRelationshipsWithVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_UserRelationshipsWithVersion_descriptor,
        new java.lang.String[] { "UserRelationships", "LastUpdatedDate", });
    com.google.protobuf.WrappersProto.getDescriptor();
    im.turms.turms.pojo.dto.UserRelationshipOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
