// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CarSelection.proto

package carselection;

public final class CarSelectionServiceImpl {
  private CarSelectionServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CarSelection_SelectCarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CarSelection_SelectCarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CarSelection_SelectCarResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CarSelection_SelectCarResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CarSelection_ChooseCarResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CarSelection_ChooseCarResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CarSelection_ChooseCarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CarSelection_ChooseCarRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022CarSelection.proto\022\014CarSelection\" \n\020Se" +
      "lectCarRequest\022\014\n\004val1\030\001 \001(\t\"!\n\021SelectCa" +
      "rResponse\022\014\n\004val2\030\001 \001(\t\"$\n\021ChooseCarResp" +
      "onse\022\017\n\007length1\030\001 \001(\005\" \n\020ChooseCarReques" +
      "t\022\014\n\004val3\030\001 \001(\t2\262\001\n\014CarSelection\022R\n\tSele" +
      "ctCar\022\036.CarSelection.SelectCarRequest\032\037." +
      "CarSelection.SelectCarResponse\"\000(\0010\001\022N\n\t" +
      "ChooseCar\022\036.CarSelection.ChooseCarReques" +
      "t\032\037.CarSelection.ChooseCarResponse(\001B)\n\014" +
      "carselectionB\027CarSelectionServiceImplP\001b" +
      "\006proto3"
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
    internal_static_CarSelection_SelectCarRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CarSelection_SelectCarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CarSelection_SelectCarRequest_descriptor,
        new java.lang.String[] { "Val1", });
    internal_static_CarSelection_SelectCarResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CarSelection_SelectCarResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CarSelection_SelectCarResponse_descriptor,
        new java.lang.String[] { "Val2", });
    internal_static_CarSelection_ChooseCarResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_CarSelection_ChooseCarResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CarSelection_ChooseCarResponse_descriptor,
        new java.lang.String[] { "Length1", });
    internal_static_CarSelection_ChooseCarRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_CarSelection_ChooseCarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CarSelection_ChooseCarRequest_descriptor,
        new java.lang.String[] { "Val3", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}