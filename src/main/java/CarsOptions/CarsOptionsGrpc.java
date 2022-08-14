package CarsOptions;

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
    comments = "Source: CarsOptions.proto")
public final class CarsOptionsGrpc {

  private CarsOptionsGrpc() {}

  public static final String SERVICE_NAME = "carsOptions.CarsOptions";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CarsOptions.CarRequest,
      CarsOptions.CarResponse> getRequestCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestCar",
      requestType = CarsOptions.CarRequest.class,
      responseType = CarsOptions.CarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<CarsOptions.CarRequest,
      CarsOptions.CarResponse> getRequestCarMethod() {
    io.grpc.MethodDescriptor<CarsOptions.CarRequest, CarsOptions.CarResponse> getRequestCarMethod;
    if ((getRequestCarMethod = CarsOptionsGrpc.getRequestCarMethod) == null) {
      synchronized (CarsOptionsGrpc.class) {
        if ((getRequestCarMethod = CarsOptionsGrpc.getRequestCarMethod) == null) {
          CarsOptionsGrpc.getRequestCarMethod = getRequestCarMethod = 
              io.grpc.MethodDescriptor.<CarsOptions.CarRequest, CarsOptions.CarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "carsOptions.CarsOptions", "RequestCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CarsOptions.CarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CarsOptions.CarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CarsOptionsMethodDescriptorSupplier("RequestCar"))
                  .build();
          }
        }
     }
     return getRequestCarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarsOptionsStub newStub(io.grpc.Channel channel) {
    return new CarsOptionsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarsOptionsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CarsOptionsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarsOptionsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CarsOptionsFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class CarsOptionsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc method for server streaming
     * </pre>
     */
    public void requestCar(CarsOptions.CarRequest request,
        io.grpc.stub.StreamObserver<CarsOptions.CarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestCarMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRequestCarMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                CarsOptions.CarRequest,
                CarsOptions.CarResponse>(
                  this, METHODID_REQUEST_CAR)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CarsOptionsStub extends io.grpc.stub.AbstractStub<CarsOptionsStub> {
    private CarsOptionsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarsOptionsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarsOptionsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarsOptionsStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for server streaming
     * </pre>
     */
    public void requestCar(CarsOptions.CarRequest request,
        io.grpc.stub.StreamObserver<CarsOptions.CarResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getRequestCarMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CarsOptionsBlockingStub extends io.grpc.stub.AbstractStub<CarsOptionsBlockingStub> {
    private CarsOptionsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarsOptionsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarsOptionsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarsOptionsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for server streaming
     * </pre>
     */
    public java.util.Iterator<CarsOptions.CarResponse> requestCar(
        CarsOptions.CarRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getRequestCarMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class CarsOptionsFutureStub extends io.grpc.stub.AbstractStub<CarsOptionsFutureStub> {
    private CarsOptionsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarsOptionsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarsOptionsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarsOptionsFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_REQUEST_CAR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CarsOptionsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CarsOptionsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQUEST_CAR:
          serviceImpl.requestCar((CarsOptions.CarRequest) request,
              (io.grpc.stub.StreamObserver<CarsOptions.CarResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CarsOptionsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarsOptionsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CarsOptions.CarsOptionsServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarsOptions");
    }
  }

  private static final class CarsOptionsFileDescriptorSupplier
      extends CarsOptionsBaseDescriptorSupplier {
    CarsOptionsFileDescriptorSupplier() {}
  }

  private static final class CarsOptionsMethodDescriptorSupplier
      extends CarsOptionsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarsOptionsMethodDescriptorSupplier(String methodName) {
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
      synchronized (CarsOptionsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarsOptionsFileDescriptorSupplier())
              .addMethod(getRequestCarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
