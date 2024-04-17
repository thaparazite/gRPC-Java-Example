package com.skety.grpc_java;

import GUI.Login;
import javafx.application.Application;


public class App {
    public static void main( String[] args ) {
        // call the loadingServerMessage method to print the loading message
        App.loadingServerMessage();
        // start the application
        Application.launch(Login.class, args);
    }// end of main method
    // method to print the loading message when the server is starting
    private static void loadingServerMessage() {
        System.out.print("Client Connecting to GRPC server");
        for(int i = 0; i < 3; i++) {// loop through the loading message
            System.out.print(".");// print a dot after each second
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
