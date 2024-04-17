package user;

import gRPC_resources.UserGrpc;
import gRPC_resources.UserOuterClass;
import gRPC_resources.UserOuterClass.APIResponse;
import gRPC_resources.UserOuterClass.Empty;
import io.grpc.stub.StreamObserver;
import utility.Credentials;
import utility.PasswordGenerator;

import java.util.HashMap;
import java.util.Map;


public class UserService extends UserGrpc.UserImplBase {
    // create a HashMap to store the users and their passwords
    private Map<String, String> users;

    public UserService() {
        // Ensure the CSV file exists
        Credentials.ensureFileExists();
        // Read users from the CSV file
        this.users = Credentials.readCredentials();

        // if the map is empty, add some real names and generate passwords for them
        if (users.isEmpty()) {
            // Add some real names and generate passwords for them
            String[] names = {"JohnDoe", "JaneDoe", "BobSmith", "AliceJohnson"};
            for (String name : names) {// loop through the names array
                // generate a random password for each name
                String password = PasswordGenerator.passwordGenerator();
                users.put(name, password);// add the name and password to the users map
            }// end of for loop
            // Write the updated users to the CSV file
            Credentials.writeCredentials(users);
        }// end of if block
        //displayUsers();// display the users
    }// end of UserService constructor
    // implement the addUser method to add a new user
    @Override
    public void addUser(UserOuterClass.AddUserRequest request, StreamObserver<APIResponse> responseObserver) {
        String username = request.getUserName();// get the username from the request object
        String password = request.getPassword();// get the password from the request object
        // create a response object to send back to the client
        APIResponse.Builder response = APIResponse.newBuilder();

        // Check if the username already exists
        if(users.containsKey(username)) {
            // Set the response code and message accordingly
            response.setResponseCode(100).setResponseMessage("Username already exists");
        } else {
            // Add the new user to the users map
            users.put(username, password);
            // Write the updated users to the CSV file
            Credentials.writeCredentials(users);
            response.setResponseCode(0).setResponseMessage("User added successfully");
        }// end of if else block

        responseObserver.onNext(response.build());// send the response object to the client
        responseObserver.onCompleted();// complete the RPC call

        //displayUsers();// display the users
    }// end of addUser method
    // implement the updateUser method to update an existing user
    @Override
    public void deleteUser(UserOuterClass.DeleteUserRequest request, StreamObserver<APIResponse> responseObserver) {
        String username = request.getUserName();// get the username from the request object
        // create a response object to send back to the client
        APIResponse.Builder response = APIResponse.newBuilder();

        // Check if the username exists
        if(users.containsKey(username)) {
            // Remove the user from the HashMap
            users.remove(username);
            // Write the updated users to the CSV file
            Credentials.writeCredentials(users);
            // Set the response code and message accordingly
            response.setResponseCode(0).setResponseMessage("User deleted successfully");
        } else {
            // Set the response code and message accordingly
            response.setResponseCode(100).setResponseMessage("Username does not exist");
        }// end of if else block

        responseObserver.onNext(response.build());// send the response object to the client
        responseObserver.onCompleted();// complete the RPC call

        //displayUsers();// display the users
    }// end of updateUser method
    // implement the login method to authenticate a user
     @Override
     public void login(UserOuterClass.LoginRequest request, StreamObserver<APIResponse>
     responseObserver) {
     System.out.println("Login endpoint hit");

      String username = request.getUserName();// get the username from the request object
      String password = request.getPassword();// get the password from the request object

      APIResponse.Builder response = APIResponse.newBuilder();// create a response object

         boolean loginSuccessful = false; // create a boolean variable to check if the login was successful

         // iterate over the users HashMap
         for(Map.Entry<String, String> entry : users.entrySet()) {// if the username exists and the password matches
             // Check if the username exists in the HashMap and if the password matches
             if(entry.getKey().equals(username) && entry.getValue().equals(password)) {
                 loginSuccessful = true;// set the loginSuccessful variable to true
                 break;// break out of the loop
             }// end of if block
         }// end of for loop

         // check if the login was successful
         if(loginSuccessful) {
             // set the response code and message
             response.setResponseCode(0).setResponseMessage("Login successful");
         } else {
             // set the response code and message
             response.setResponseCode(100).setResponseMessage("Login failed");
         }// end of if else block

    responseObserver.onNext(response.build());// send the response object to the client
    responseObserver.onCompleted();// complete the RPC call

         //displayUsers();// display the users
    }// end of login method
    // implement the logout method to log out a user
    @Override
    public void logout(UserOuterClass.Empty request, StreamObserver<UserOuterClass.APIResponse> responseObserver) {
        // create a response object to send back to the client
        UserOuterClass.APIResponse response = UserOuterClass.APIResponse.newBuilder()
                .setResponseCode(0) // set the response code to 0
                .setResponseMessage("Logout successful")// set the response message to "Logout successful"
                .build();// build the response object

        responseObserver.onNext(response);// send the response object to the client
        responseObserver.onCompleted();// complete the RPC call

        //displayUsers();// display the users
    }// end of logout method
    /*
    public void displayUsers() {
        System.out.println("Current users:");
        // iterate over the users HashMap and display the usernames and passwords
        for (Map.Entry<String, String> entry : users.entrySet()) {
            System.out.println("Username: " + entry.getKey() + ", Password: " + entry.getValue());
        }// end of for loop
    }// end of displayUsers method
   */
}// end of UserService class