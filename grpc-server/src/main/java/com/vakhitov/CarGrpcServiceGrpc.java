package com.vakhitov;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: car_grpc_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CarGrpcServiceGrpc {

  private CarGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "com.vakhitov.CarGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CarGrpcServiceOuterClass.CarRequest,
      CarGrpcServiceOuterClass.CarResponse> getGetCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCar",
      requestType = CarGrpcServiceOuterClass.CarRequest.class,
      responseType = CarGrpcServiceOuterClass.CarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CarGrpcServiceOuterClass.CarRequest,
      CarGrpcServiceOuterClass.CarResponse> getGetCarMethod() {
    io.grpc.MethodDescriptor<CarGrpcServiceOuterClass.CarRequest, CarGrpcServiceOuterClass.CarResponse> getGetCarMethod;
    if ((getGetCarMethod = CarGrpcServiceGrpc.getGetCarMethod) == null) {
      synchronized (CarGrpcServiceGrpc.class) {
        if ((getGetCarMethod = CarGrpcServiceGrpc.getGetCarMethod) == null) {
          CarGrpcServiceGrpc.getGetCarMethod = getGetCarMethod =
              io.grpc.MethodDescriptor.<CarGrpcServiceOuterClass.CarRequest, CarGrpcServiceOuterClass.CarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CarGrpcServiceOuterClass.CarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CarGrpcServiceOuterClass.CarResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CarGrpcServiceMethodDescriptorSupplier("GetCar"))
              .build();
        }
      }
    }
    return getGetCarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarGrpcServiceStub>() {
        @Override
        public CarGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarGrpcServiceStub(channel, callOptions);
        }
      };
    return CarGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarGrpcServiceBlockingStub>() {
        @Override
        public CarGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return CarGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarGrpcServiceFutureStub>() {
        @Override
        public CarGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return CarGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getCar(CarGrpcServiceOuterClass.CarRequest request,
                        io.grpc.stub.StreamObserver<CarGrpcServiceOuterClass.CarResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCarMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CarGrpcService.
   */
  public static abstract class CarGrpcServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return CarGrpcServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CarGrpcService.
   */
  public static final class CarGrpcServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CarGrpcServiceStub> {
    private CarGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CarGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCar(CarGrpcServiceOuterClass.CarRequest request,
                       io.grpc.stub.StreamObserver<CarGrpcServiceOuterClass.CarResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCarMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CarGrpcService.
   */
  public static final class CarGrpcServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CarGrpcServiceBlockingStub> {
    private CarGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CarGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public CarGrpcServiceOuterClass.CarResponse getCar(CarGrpcServiceOuterClass.CarRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCarMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CarGrpcService.
   */
  public static final class CarGrpcServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CarGrpcServiceFutureStub> {
    private CarGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected CarGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CarGrpcServiceOuterClass.CarResponse> getCar(
        CarGrpcServiceOuterClass.CarRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAR:
          serviceImpl.getCar((CarGrpcServiceOuterClass.CarRequest) request,
              (io.grpc.stub.StreamObserver<CarGrpcServiceOuterClass.CarResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetCarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              CarGrpcServiceOuterClass.CarRequest,
              CarGrpcServiceOuterClass.CarResponse>(
                service, METHODID_GET_CAR)))
        .build();
  }

  private static abstract class CarGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarGrpcServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return CarGrpcServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarGrpcService");
    }
  }

  private static final class CarGrpcServiceFileDescriptorSupplier
      extends CarGrpcServiceBaseDescriptorSupplier {
    CarGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class CarGrpcServiceMethodDescriptorSupplier
      extends CarGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarGrpcServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CarGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetCarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
