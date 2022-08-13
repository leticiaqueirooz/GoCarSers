package carreservation;

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
    comments = "Source: CarReservation.proto")
public final class CarReservationGrpc {

  private CarReservationGrpc() {}

  public static final String SERVICE_NAME = "strings.CarReservation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<carreservation.LoginCarRequest,
      carreservation.LoginCarResponse> getLoginCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoginCar",
      requestType = carreservation.LoginCarRequest.class,
      responseType = carreservation.LoginCarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<carreservation.LoginCarRequest,
      carreservation.LoginCarResponse> getLoginCarMethod() {
    io.grpc.MethodDescriptor<carreservation.LoginCarRequest, carreservation.LoginCarResponse> getLoginCarMethod;
    if ((getLoginCarMethod = CarReservationGrpc.getLoginCarMethod) == null) {
      synchronized (CarReservationGrpc.class) {
        if ((getLoginCarMethod = CarReservationGrpc.getLoginCarMethod) == null) {
          CarReservationGrpc.getLoginCarMethod = getLoginCarMethod = 
              io.grpc.MethodDescriptor.<carreservation.LoginCarRequest, carreservation.LoginCarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "strings.CarReservation", "LoginCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  carreservation.LoginCarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  carreservation.LoginCarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CarReservationMethodDescriptorSupplier("LoginCar"))
                  .build();
          }
        }
     }
     return getLoginCarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<carreservation.UnlockCarRequest,
      carreservation.UnlockCarResponse> getUnlockCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnlockCar",
      requestType = carreservation.UnlockCarRequest.class,
      responseType = carreservation.UnlockCarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<carreservation.UnlockCarRequest,
      carreservation.UnlockCarResponse> getUnlockCarMethod() {
    io.grpc.MethodDescriptor<carreservation.UnlockCarRequest, carreservation.UnlockCarResponse> getUnlockCarMethod;
    if ((getUnlockCarMethod = CarReservationGrpc.getUnlockCarMethod) == null) {
      synchronized (CarReservationGrpc.class) {
        if ((getUnlockCarMethod = CarReservationGrpc.getUnlockCarMethod) == null) {
          CarReservationGrpc.getUnlockCarMethod = getUnlockCarMethod = 
              io.grpc.MethodDescriptor.<carreservation.UnlockCarRequest, carreservation.UnlockCarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "strings.CarReservation", "UnlockCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  carreservation.UnlockCarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  carreservation.UnlockCarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CarReservationMethodDescriptorSupplier("UnlockCar"))
                  .build();
          }
        }
     }
     return getUnlockCarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarReservationStub newStub(io.grpc.Channel channel) {
    return new CarReservationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarReservationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CarReservationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarReservationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CarReservationFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class CarReservationImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc method for bidirectional streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<carreservation.LoginCarRequest> loginCar(
        io.grpc.stub.StreamObserver<carreservation.LoginCarResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getLoginCarMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void unlockCar(carreservation.UnlockCarRequest request,
        io.grpc.stub.StreamObserver<carreservation.UnlockCarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlockCarMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginCarMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                carreservation.LoginCarRequest,
                carreservation.LoginCarResponse>(
                  this, METHODID_LOGIN_CAR)))
          .addMethod(
            getUnlockCarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                carreservation.UnlockCarRequest,
                carreservation.UnlockCarResponse>(
                  this, METHODID_UNLOCK_CAR)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CarReservationStub extends io.grpc.stub.AbstractStub<CarReservationStub> {
    private CarReservationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarReservationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarReservationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarReservationStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for bidirectional streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<carreservation.LoginCarRequest> loginCar(
        io.grpc.stub.StreamObserver<carreservation.LoginCarResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getLoginCarMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void unlockCar(carreservation.UnlockCarRequest request,
        io.grpc.stub.StreamObserver<carreservation.UnlockCarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlockCarMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CarReservationBlockingStub extends io.grpc.stub.AbstractStub<CarReservationBlockingStub> {
    private CarReservationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarReservationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarReservationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarReservationBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public carreservation.UnlockCarResponse unlockCar(carreservation.UnlockCarRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnlockCarMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CarReservationFutureStub extends io.grpc.stub.AbstractStub<CarReservationFutureStub> {
    private CarReservationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarReservationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarReservationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarReservationFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<carreservation.UnlockCarResponse> unlockCar(
        carreservation.UnlockCarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlockCarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNLOCK_CAR = 0;
  private static final int METHODID_LOGIN_CAR = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CarReservationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CarReservationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UNLOCK_CAR:
          serviceImpl.unlockCar((carreservation.UnlockCarRequest) request,
              (io.grpc.stub.StreamObserver<carreservation.UnlockCarResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN_CAR:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.loginCar(
              (io.grpc.stub.StreamObserver<carreservation.LoginCarResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CarReservationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarReservationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return carreservation.CarReservationServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarReservation");
    }
  }

  private static final class CarReservationFileDescriptorSupplier
      extends CarReservationBaseDescriptorSupplier {
    CarReservationFileDescriptorSupplier() {}
  }

  private static final class CarReservationMethodDescriptorSupplier
      extends CarReservationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarReservationMethodDescriptorSupplier(String methodName) {
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
      synchronized (CarReservationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarReservationFileDescriptorSupplier())
              .addMethod(getLoginCarMethod())
              .addMethod(getUnlockCarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
