package GUI;

import gRPC_resources.UserGrpc;
import gRPC_resources.UserOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class UserController {
    // create a new blocking stub
    private final UserGrpc.UserBlockingStub userStub;
    // create a new managed channel and connect to the server
    public UserController() {
        // create a new managed channel and connect to the server on localhost:50051
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
        this.userStub = UserGrpc.newBlockingStub(channel);// create a new blocking stub
    }// end of constructor
    // method to login a user with the given username and password
    public UserOuterClass.APIResponse login(String username, String password) {
        // create a new login request with the given username and password
        UserOuterClass.LoginRequest loginRequest = UserOuterClass.LoginRequest.newBuilder()
                .setUserName(username)// set the username
                .setPassword(password)// set the password
                .build();// build the request
        userStub.login(loginRequest);// call the login method on the stub and pass the request
        return userStub.login(loginRequest);// return the response
    }// end of login method
    // method to logout the user from the system
    public UserOuterClass.APIResponse logout() {
        // create an empty logout request to logout the user
        UserOuterClass.Empty logoutRequest = UserOuterClass.Empty.newBuilder().build();
        return userStub.logout(logoutRequest);// call the logout method on the stub and pass the request
    }// end of logout method
    // method to add a new user with the given username and password
    public UserOuterClass.APIResponse addUser(String username, String password) {
        // create a new add user request with the given username and password
        UserOuterClass.AddUserRequest addUserRequest = UserOuterClass.AddUserRequest.newBuilder()
                .setUserName(username)// set the username
                .setPassword(password)// set the password
                .build();// build the request
        return userStub.addUser(addUserRequest);// call the add user method on the stub and pass the request
    }// end of addUser method
    // method to delete a user with the given username
    public UserOuterClass.APIResponse deleteUser(String username) {
        // create a new delete user request with the given username
        UserOuterClass.DeleteUserRequest deleteUserRequest = UserOuterClass.DeleteUserRequest.newBuilder()
                .setUserName(username)// set the username
                .build();// build the request
        return userStub.deleteUser(deleteUserRequest);// call the delete user method on the stub and pass the request
    }// end of deleteUser method
}// end of UserController class