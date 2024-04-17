package com.skety.grpc_java;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.UserService;

import java.io.IOException;


public class App {
    public static void main( String[] args ) {
          App.loadingServerMessage();// print the loading message
          // Create a new server instance
          Server server = ServerBuilder.forPort(50051).addService(new UserService()).build();

          // Start the server
          try {
          server.start();// start the server
          System.out.println("Server started at " + server.getPort());// print the por the server is running on
          server.awaitTermination();// keep the server running
          } catch (IOException e) {// catch the IOException
          System.out.println("Server failed to start");
          } catch (InterruptedException e) {// catch the InterruptedException
          System.out.println("Server stopped");
          } // end of try catch block


    }// end of main method
    // method to print the loading message to the console
    private static void loadingServerMessage() {
          System.out.print("Starting GRPC server");
          for(int i = 0; i < 3; i++) {// loop through the loading message
                System.out.print(".");// print a dot to the console to simulate loading
                try {
                      // sleep for 1 second
                      Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {// catch the InterruptedException
                      System.out.println("Server failed to start !");
                }// end of try catch block
          }// end of for loop
          System.out.println();
    }// end of loadingServerMessage method

}// end of App class
