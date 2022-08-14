package carReturn;

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
    comments = "Source: CarReturn.proto")
public final class CarReturnGrpc {

  private CarReturnGrpc() {}

  public static final String SERVICE_NAME = "CarReturnService.CarReturn";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<carReturn.CarReturnRequest,
      carReturn.CarReturnResponse> getCarReturnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CarReturn",
      requestType = carReturn.CarReturnRequest.class,
      responseType = carReturn.CarReturnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<carReturn.CarReturnRequest,
      carReturn.CarReturnResponse> getCarReturnMethod() {
    io.grpc.MethodDescriptor<carReturn.CarReturnRequest, carReturn.CarReturnResponse> getCarReturnMethod;
    if ((getCarReturnMethod = CarReturnGrpc.getCarReturnMethod) == null) {
      synchronized (CarReturnGrpc.class) {
        if ((getCarReturnMethod = CarReturnGrpc.getCarReturnMethod) == null) {
          CarReturnGrpc.getCarReturnMethod = getCarReturnMethod = 
              io.grpc.MethodDescriptor.<carReturn.CarReturnRequest, carReturn.CarReturnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CarReturnService.CarReturn", "CarReturn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  carReturn.CarReturnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  carReturn.CarReturnResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CarReturnMethodDescriptorSupplier("CarReturn"))
                  .build();
          }
        }
     }
     return getCarReturnMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarReturnStub newStub(io.grpc.Channel channel) {
    return new CarReturnStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarReturnBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CarReturnBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarReturnFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CarReturnFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class CarReturnImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc method for client streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<carReturn.CarReturnRequest> carReturn(
        io.grpc.stub.StreamObserver<carReturn.CarReturnResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCarReturnMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCarReturnMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                carReturn.CarReturnRequest,
                carReturn.CarReturnResponse>(
                  this, METHODID_CAR_RETURN)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CarReturnStub extends io.grpc.stub.AbstractStub<CarReturnStub> {
    private CarReturnStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarReturnStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarReturnStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarReturnStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for client streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<carReturn.CarReturnRequest> carReturn(
        io.grpc.stub.StreamObserver<carReturn.CarReturnResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCarReturnMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CarReturnBlockingStub extends io.grpc.stub.AbstractStub<CarReturnBlockingStub> {
    private CarReturnBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarReturnBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarReturnBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarReturnBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CarReturnFutureStub extends io.grpc.stub.AbstractStub<CarReturnFutureStub> {
    private CarReturnFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarReturnFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarReturnFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarReturnFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CAR_RETURN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CarReturnImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CarReturnImplBase serviceImpl, int methodId) {
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
        case METHODID_CAR_RETURN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.carReturn(
              (io.grpc.stub.StreamObserver<carReturn.CarReturnResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CarReturnBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarReturnBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return carReturn.CarReturnServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarReturn");
    }
  }

  private static final class CarReturnFileDescriptorSupplier
      extends CarReturnBaseDescriptorSupplier {
    CarReturnFileDescriptorSupplier() {}
  }

  private static final class CarReturnMethodDescriptorSupplier
      extends CarReturnBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarReturnMethodDescriptorSupplier(String methodName) {
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
      synchronized (CarReturnGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarReturnFileDescriptorSupplier())
              .addMethod(getCarReturnMethod())
              .build();
        }
      }
    }
    return result;
  }
}
