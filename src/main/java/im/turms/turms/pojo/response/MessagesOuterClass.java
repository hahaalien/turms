// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: response/message/messages.proto

package im.turms.turms.pojo.response;

public final class MessagesOuterClass {
  private MessagesOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_Messages_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_Messages_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037response/message/messages.proto\022\016im.tu" +
      "rms.proto\032\031dto/message/message.proto\"5\n\010" +
      "Messages\022)\n\010messages\030\001 \003(\0132\027.im.turms.pr" +
      "oto.MessageB \n\034im.turms.turms.pojo.respo" +
      "nseP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          im.turms.turms.pojo.dto.MessageOuterClass.getDescriptor(),
        });
    internal_static_im_turms_proto_Messages_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_Messages_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_Messages_descriptor,
        new java.lang.String[] { "Messages", });
    im.turms.turms.pojo.dto.MessageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
