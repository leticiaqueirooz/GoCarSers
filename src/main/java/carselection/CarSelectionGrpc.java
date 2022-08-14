package carselection;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: CarSelection.proto")
public final class CarSelectionGrpc {

  private CarSelectionGrpc() {}

  public static final String SERVICE_NAME = "CarSelection.CarSelection";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<carselection.SelectCarRequest,
      carselection.SelectCarResponse> getSelectCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SelectCar",
      requestType = carselection.SelectCarRequest.class,
      responseType = carselection.SelectCarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<carselection.SelectCarRequest,
      carselection.SelectCarResponse> getSelectCarMethod() {
    io.grpc.MethodDescriptor<carselection.SelectCarRequest, carselection.SelectCarResponse> getSelectCarMethod;
    if ((getSelectCarMethod = CarSelectionGrpc.getSelectCarMethod) == null) {
      synchronized (CarSelectionGrpc.class) {
        if ((getSelectCarMethod = CarSelectionGrpc.getSelectCarMethod) == null) {
          CarSelectionGrpc.getSelectCarMethod = getSelectCarMethod = 
              io.grpc.MethodDescriptor.<carselection.SelectCarRequest, carselection.SelectCarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CarSelection.CarSelection", "SelectCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  carselection.SelectCarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  carselection.SelectCarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CarSelectionMethodDescriptorSupplier("SelectCar"))
                  .build();
          }
        }
     }
     return getSelectCarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<carselection.ChooseCarRequest,
      carselection.ChooseCarResponse> getChooseCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChooseCar",
      requestType = carselection.ChooseCarRequest.class,
      responseType = carselection.ChooseCarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<carselection.ChooseCarRequest,
      carselection.ChooseCarResponse> getChooseCarMethod() {
    io.grpc.MethodDescriptor<carselection.ChooseCarRequest, carselection.ChooseCarResponse> getChooseCarMethod;
    if ((getChooseCarMethod = CarSelectionGrpc.getChooseCarMethod) == null) {
      synchronized (CarSelectionGrpc.class) {
        if ((getChooseCarMethod = CarSelectionGrpc.getChooseCarMethod) == null) {
          CarSelectionGrpc.getChooseCarMethod = getChooseCarMethod = 
              io.grpc.MethodDescriptor.<carselection.ChooseCarRequest, carselection.ChooseCarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CarSelection.CarSelection", "ChooseCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  carselection.ChooseCarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  carselection.ChooseCarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CarSelectionMethodDescriptorSupplier("ChooseCar"))
                  .build();
          }
        }
     }
     return getChooseCarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarSelectionStub newStub(io.grpc.Channel channel) {
    return new CarSelectionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarSelectionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CarSelectionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarSelectionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CarSelectionFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class CarSelectionImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc method for server streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<carselection.SelectCarRequest> selectCar(
        io.grpc.stub.StreamObserver<carselection.SelectCarResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSelectCarMethod(), responseObserver);
    }

    /**
     * <pre>
     * client stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<carselection.ChooseCarRequest> chooseCar(
        io.grpc.stub.StreamObserver<carselection.ChooseCarResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getChooseCarMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSelectCarMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                carselection.SelectCarRequest,
                carselection.SelectCarResponse>(
                  this, METHODID_SELECT_CAR)))
          .addMethod(
            getChooseCarMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                carselection.ChooseCarRequest,
                carselection.ChooseCarResponse>(
                  this, METHODID_CHOOSE_CAR)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CarSelectionStub extends io.grpc.stub.AbstractStub<CarSelectionStub> {
    private CarSelectionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarSelectionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarSelectionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarSelectionStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for server streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<carselection.SelectCarRequest> selectCar(
        io.grpc.stub.StreamObserver<carselection.SelectCarResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSelectCarMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * client stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<carselection.ChooseCarRequest> chooseCar(
        io.grpc.stub.StreamObserver<carselection.ChooseCarResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getChooseCarMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CarSelectionBlockingStub extends io.grpc.stub.AbstractStub<CarSelectionBlockingStub> {
    private CarSelectionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarSelectionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarSelectionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarSelectionBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CarSelectionFutureStub extends io.grpc.stub.AbstractStub<CarSelectionFutureStub> {
    private CarSelectionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarSelectionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarSelectionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarSelectionFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SELECT_CAR = 0;
  private static final int METHODID_CHOOSE_CAR = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CarSelectionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CarSelectionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SELECT_CAR:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.selectCar(
              (io.grpc.stub.StreamObserver<carselection.SelectCarResponse>) responseObserver);
        case METHODID_CHOOSE_CAR:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.chooseCar(
              (io.grpc.stub.StreamObserver<carselection.ChooseCarResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CarSelectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarSelectionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return carselection.CarSelectionServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarSelection");
    }
  }

  private static final class CarSelectionFileDescriptorSupplier
      extends CarSelectionBaseDescriptorSupplier {
    CarSelectionFileDescriptorSupplier() {}
  }

  private static final class CarSelectionMethodDescriptorSupplier
      extends CarSelectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarSelectionMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CarSelectionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarSelectionFileDescriptorSupplier())
              .addMethod(getSelectCarMethod())
              .addMethod(getChooseCarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
