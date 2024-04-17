package gRPC_resources;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: user.proto")
public final class UserGrpc {

  private UserGrpc() {}

  public static final String SERVICE_NAME = "User";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gRPC_resources.UserOuterClass.LoginRequest,
      gRPC_resources.UserOuterClass.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = gRPC_resources.UserOuterClass.LoginRequest.class,
      responseType = gRPC_resources.UserOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gRPC_resources.UserOuterClass.LoginRequest,
      gRPC_resources.UserOuterClass.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<gRPC_resources.UserOuterClass.LoginRequest, gRPC_resources.UserOuterClass.APIResponse> getLoginMethod;
    if ((getLoginMethod = UserGrpc.getLoginMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getLoginMethod = UserGrpc.getLoginMethod) == null) {
          UserGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<gRPC_resources.UserOuterClass.LoginRequest, gRPC_resources.UserOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "User", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_resources.UserOuterClass.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_resources.UserOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gRPC_resources.UserOuterClass.Empty,
      gRPC_resources.UserOuterClass.APIResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = gRPC_resources.UserOuterClass.Empty.class,
      responseType = gRPC_resources.UserOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gRPC_resources.UserOuterClass.Empty,
      gRPC_resources.UserOuterClass.APIResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<gRPC_resources.UserOuterClass.Empty, gRPC_resources.UserOuterClass.APIResponse> getLogoutMethod;
    if ((getLogoutMethod = UserGrpc.getLogoutMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getLogoutMethod = UserGrpc.getLogoutMethod) == null) {
          UserGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<gRPC_resources.UserOuterClass.Empty, gRPC_resources.UserOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "User", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_resources.UserOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_resources.UserOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gRPC_resources.UserOuterClass.AddUserRequest,
      gRPC_resources.UserOuterClass.APIResponse> getAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addUser",
      requestType = gRPC_resources.UserOuterClass.AddUserRequest.class,
      responseType = gRPC_resources.UserOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gRPC_resources.UserOuterClass.AddUserRequest,
      gRPC_resources.UserOuterClass.APIResponse> getAddUserMethod() {
    io.grpc.MethodDescriptor<gRPC_resources.UserOuterClass.AddUserRequest, gRPC_resources.UserOuterClass.APIResponse> getAddUserMethod;
    if ((getAddUserMethod = UserGrpc.getAddUserMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getAddUserMethod = UserGrpc.getAddUserMethod) == null) {
          UserGrpc.getAddUserMethod = getAddUserMethod = 
              io.grpc.MethodDescriptor.<gRPC_resources.UserOuterClass.AddUserRequest, gRPC_resources.UserOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "User", "addUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_resources.UserOuterClass.AddUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_resources.UserOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("addUser"))
                  .build();
          }
        }
     }
     return getAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gRPC_resources.UserOuterClass.DeleteUserRequest,
      gRPC_resources.UserOuterClass.APIResponse> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUser",
      requestType = gRPC_resources.UserOuterClass.DeleteUserRequest.class,
      responseType = gRPC_resources.UserOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gRPC_resources.UserOuterClass.DeleteUserRequest,
      gRPC_resources.UserOuterClass.APIResponse> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<gRPC_resources.UserOuterClass.DeleteUserRequest, gRPC_resources.UserOuterClass.APIResponse> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserGrpc.getDeleteUserMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getDeleteUserMethod = UserGrpc.getDeleteUserMethod) == null) {
          UserGrpc.getDeleteUserMethod = getDeleteUserMethod = 
              io.grpc.MethodDescriptor.<gRPC_resources.UserOuterClass.DeleteUserRequest, gRPC_resources.UserOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "User", "deleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_resources.UserOuterClass.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_resources.UserOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserMethodDescriptorSupplier("deleteUser"))
                  .build();
          }
        }
     }
     return getDeleteUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStub newStub(io.grpc.Channel channel) {
    return new UserStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserFutureStub(channel);
  }

  /**
   */
  public static abstract class UserImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * login the user to the system
     * </pre>
     */
    public void login(gRPC_resources.UserOuterClass.LoginRequest request,
        io.grpc.stub.StreamObserver<gRPC_resources.UserOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     * logout the user from the system
     * </pre>
     */
    public void logout(gRPC_resources.UserOuterClass.Empty request,
        io.grpc.stub.StreamObserver<gRPC_resources.UserOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     * <pre>
     * add user to the system
     * </pre>
     */
    public void addUser(gRPC_resources.UserOuterClass.AddUserRequest request,
        io.grpc.stub.StreamObserver<gRPC_resources.UserOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * delete a user
     * </pre>
     */
    public void deleteUser(gRPC_resources.UserOuterClass.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<gRPC_resources.UserOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC_resources.UserOuterClass.LoginRequest,
                gRPC_resources.UserOuterClass.APIResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC_resources.UserOuterClass.Empty,
                gRPC_resources.UserOuterClass.APIResponse>(
                  this, METHODID_LOGOUT)))
          .addMethod(
            getAddUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC_resources.UserOuterClass.AddUserRequest,
                gRPC_resources.UserOuterClass.APIResponse>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            getDeleteUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC_resources.UserOuterClass.DeleteUserRequest,
                gRPC_resources.UserOuterClass.APIResponse>(
                  this, METHODID_DELETE_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserStub extends io.grpc.stub.AbstractStub<UserStub> {
    private UserStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserStub(channel, callOptions);
    }

    /**
     * <pre>
     * login the user to the system
     * </pre>
     */
    public void login(gRPC_resources.UserOuterClass.LoginRequest request,
        io.grpc.stub.StreamObserver<gRPC_resources.UserOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * logout the user from the system
     * </pre>
     */
    public void logout(gRPC_resources.UserOuterClass.Empty request,
        io.grpc.stub.StreamObserver<gRPC_resources.UserOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * add user to the system
     * </pre>
     */
    public void addUser(gRPC_resources.UserOuterClass.AddUserRequest request,
        io.grpc.stub.StreamObserver<gRPC_resources.UserOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * delete a user
     * </pre>
     */
    public void deleteUser(gRPC_resources.UserOuterClass.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<gRPC_resources.UserOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserBlockingStub extends io.grpc.stub.AbstractStub<UserBlockingStub> {
    private UserBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * login the user to the system
     * </pre>
     */
    public gRPC_resources.UserOuterClass.APIResponse login(gRPC_resources.UserOuterClass.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * logout the user from the system
     * </pre>
     */
    public gRPC_resources.UserOuterClass.APIResponse logout(gRPC_resources.UserOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * add user to the system
     * </pre>
     */
    public gRPC_resources.UserOuterClass.APIResponse addUser(gRPC_resources.UserOuterClass.AddUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * delete a user
     * </pre>
     */
    public gRPC_resources.UserOuterClass.APIResponse deleteUser(gRPC_resources.UserOuterClass.DeleteUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserFutureStub extends io.grpc.stub.AbstractStub<UserFutureStub> {
    private UserFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * login the user to the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC_resources.UserOuterClass.APIResponse> login(
        gRPC_resources.UserOuterClass.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * logout the user from the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC_resources.UserOuterClass.APIResponse> logout(
        gRPC_resources.UserOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * add user to the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC_resources.UserOuterClass.APIResponse> addUser(
        gRPC_resources.UserOuterClass.AddUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * delete a user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC_resources.UserOuterClass.APIResponse> deleteUser(
        gRPC_resources.UserOuterClass.DeleteUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;
  private static final int METHODID_ADD_USER = 2;
  private static final int METHODID_DELETE_USER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((gRPC_resources.UserOuterClass.LoginRequest) request,
              (io.grpc.stub.StreamObserver<gRPC_resources.UserOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((gRPC_resources.UserOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<gRPC_resources.UserOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_ADD_USER:
          serviceImpl.addUser((gRPC_resources.UserOuterClass.AddUserRequest) request,
              (io.grpc.stub.StreamObserver<gRPC_resources.UserOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((gRPC_resources.UserOuterClass.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<gRPC_resources.UserOuterClass.APIResponse>) responseObserver);
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

  private static abstract class UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gRPC_resources.UserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("User");
    }
  }

  private static final class UserFileDescriptorSupplier
      extends UserBaseDescriptorSupplier {
    UserFileDescriptorSupplier() {}
  }

  private static final class UserMethodDescriptorSupplier
      extends UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getAddUserMethod())
              .addMethod(getDeleteUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
