// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dto/group/group.proto

package im.turms.turms.pojo.dto;

public final class GroupOuterClass {
  private GroupOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_Group_descriptor;
  static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_Group_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025dto/group/group.proto\022\016im.turms.proto\032" +
      "\036google/protobuf/wrappers.proto\"\316\004\n\005Grou" +
              "p\022'\n\002id\030\001 \001(\0132\033.google.protobuf.Int64Val" +
      "ue\022,\n\007type_id\030\002 \001(\0132\033.google.protobuf.In" +
      "t64Value\022/\n\ncreator_id\030\003 \001(\0132\033.google.pr" +
      "otobuf.Int64Value\022-\n\010owner_id\030\004 \001(\0132\033.go" +
      "ogle.protobuf.Int64Value\022*\n\004name\030\005 \001(\0132\034" +
      ".google.protobuf.StringValue\022+\n\005intro\030\006 " +
      "\001(\0132\034.google.protobuf.StringValue\0222\n\014ann" +
      "ouncement\030\007 \001(\0132\034.google.protobuf.String" +
      "Value\0229\n\023profile_picture_url\030\010 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\0222\n\rcreation_dat" +
      "e\030\t \001(\0132\033.google.protobuf.Int64Value\0222\n\r" +
      "deletion_date\030\n \001(\0132\033.google.protobuf.In" +
      "t64Value\0222\n\rmute_end_date\030\013 \001(\0132\033.google" +
      ".protobuf.Int64Value\022*\n\006active\030\014 \001(\0132\032.g" +
      "oogle.protobuf.BoolValueB\033\n\027im.turms.tur" +
      "ms.pojo.dtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_im_turms_proto_Group_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_Group_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_Group_descriptor,
        new java.lang.String[] { "Id", "TypeId", "CreatorId", "OwnerId", "Name", "Intro", "Announcement", "ProfilePictureUrl", "CreationDate", "DeletionDate", "MuteEndDate", "Active", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
