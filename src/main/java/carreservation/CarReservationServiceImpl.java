// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CarReservation.proto

package carreservation;

public final class CarReservationServiceImpl {
  private CarReservationServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_strings_LoginCarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_strings_LoginCarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_strings_LoginCarResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_strings_LoginCarResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_strings_UnlockCarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_strings_UnlockCarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_strings_UnlockCarResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_strings_UnlockCarResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024CarReservation.proto\022\007strings\"\036\n\017Login" +
      "CarRequest\022\013\n\003val\030\001 \001(\t\"\037\n\020LoginCarRespo" +
      "nse\022\013\n\003val\030\001 \001(\t\"1\n\020UnlockCarRequest\022\013\n\003" +
      "key\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\"&\n\021UnlockCar" +
      "Response\022\021\n\tunloocked\030\001 \001(\0102\235\001\n\016CarReser" +
      "vation\022E\n\010LoginCar\022\030.strings.LoginCarReq" +
      "uest\032\031.strings.LoginCarResponse\"\000(\0010\001\022D\n" +
      "\tUnlockCar\022\031.strings.UnlockCarRequest\032\032." +
      "strings.UnlockCarResponse\"\000B-\n\016carreserv" +
      "ationB\031CarReservationServiceImplP\001b\006prot" +
      "o3"
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
    internal_static_strings_LoginCarRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_strings_LoginCarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_strings_LoginCarRequest_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_strings_LoginCarResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_strings_LoginCarResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_strings_LoginCarResponse_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_strings_UnlockCarRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_strings_UnlockCarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_strings_UnlockCarRequest_descriptor,
        new java.lang.String[] { "Key", "Password", });
    internal_static_strings_UnlockCarResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_strings_UnlockCarResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_strings_UnlockCarResponse_descriptor,
        new java.lang.String[] { "Unloocked", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
