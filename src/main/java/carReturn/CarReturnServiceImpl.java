// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CarReturn.proto

package carReturn;

public final class CarReturnServiceImpl {
  private CarReturnServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CarReturnService_CarReturnResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CarReturnService_CarReturnResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CarReturnService_CarReturnRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CarReturnService_CarReturnRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017CarReturn.proto\022\020CarReturnService\"%\n\021C" +
      "arReturnResponse\022\020\n\010returnOk\030\001 \001(\t\" \n\020Ca" +
      "rReturnRequest\022\014\n\004item\030\001 \001(\t2c\n\tCarRetur" +
      "n\022V\n\tCarReturn\022\".CarReturnService.CarRet" +
      "urnRequest\032#.CarReturnService.CarReturnR" +
      "esponse(\001B#\n\tcarReturnB\024CarReturnService" +
      "ImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_CarReturnService_CarReturnResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CarReturnService_CarReturnResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CarReturnService_CarReturnResponse_descriptor,
        new java.lang.String[] { "ReturnOk", });
    internal_static_CarReturnService_CarReturnRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CarReturnService_CarReturnRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CarReturnService_CarReturnRequest_descriptor,
        new java.lang.String[] { "Item", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
