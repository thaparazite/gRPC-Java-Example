package GUI;

import gRPC_resources.UserOuterClass;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login extends Application {

    private TextField usernameField;
    private PasswordField passwordField;
    private UserController userController;
    private Button logoutButton;
    private Button addUserButton;
    private Button deleteUserButton;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");// set the title of the window

        usernameField = new TextField();// create a new TextField object
        usernameField.setPromptText("Username");// set the prompt text of the TextField object

        passwordField = new PasswordField();// create a new PasswordField object
        passwordField.setPromptText("Password");// set the prompt text of the PasswordField object

        Button loginButton = new Button("Login");// create a new Button object
        loginButton.setOnAction(e -> login());// set the action of the button to call the login method

        logoutButton = new Button("Logout");// create a new Button object
        logoutButton.setOnAction(e -> logout());// set the action of the button to call the logout method

        addUserButton = new Button("Add User");// create a new Button object
        addUserButton.setOnAction(e -> addUser());// set the action of the button to call the addUser method

        deleteUserButton = new Button("Delete User");
        deleteUserButton.setOnAction(e -> deleteUser());


        // create a new VBox object and add the usernameField, passwordField, loginButton, logoutButton, and addUserButton to it
        VBox vbox = new VBox(usernameField, passwordField, loginButton, logoutButton, addUserButton, deleteUserButton);
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(8);// set the spacing between the nodes

        Scene scene = new Scene(vbox, 300, 250);// create a new Scene object with the VBox object
        primaryStage.setScene(scene);// set the scene of the window
        primaryStage.show();// display the window

        userController = new UserController();
    }// end of start method

    private void login() {
        String username = usernameField.getText();// get the text from the usernameField
        String password = passwordField.getText();// get the text from the passwordField

        // call the login method of the userController object with the username and password
        UserOuterClass.APIResponse response = userController.login(username, password);
        // create a new Alert object with the response message
        Alert alert = new Alert(Alert.AlertType.INFORMATION);// create a new Alert object
        alert.setTitle("Login Response");// set the title of the alert
        alert.setHeaderText(response.getResponseMessage());// set the header text of the alert
        alert.showAndWait();// display the alert
    }// end of login method

    private void logout() {
        UserOuterClass.APIResponse response = userController.logout();// call the logout method of the userController object
        // create a new Alert object with the response message
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Logout Response");// set the title of the alert
        alert.setHeaderText(response.getResponseMessage());// set the header text of the alert
        alert.showAndWait();// display the alert
    }// end of logout method

    private void addUser() {
        String username = usernameField.getText();// get the text from the usernameField
        String password = passwordField.getText();// get the text from the passwordField
        // call the addUser method of the userController object with the username and password
        UserOuterClass.APIResponse response = userController.addUser(username, password);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);// create a new Alert object
        alert.setTitle("Add User Response");// set the title of the alert
        alert.setHeaderText(response.getResponseMessage());// set the header text of the alert
        alert.showAndWait();// display the alert
    }// end of addUser method

    private void deleteUser() {
        String username = usernameField.getText();// get the text from the usernameField
        // call the deleteUser method of the userController object with the username
        UserOuterClass.APIResponse response = userController.deleteUser(username);
        // create a new Alert object with the response message
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Delete User Response");// set the title of the alert
        alert.setHeaderText(response.getResponseMessage());// set the header text of the alert
        alert.showAndWait();// display the alert
    }// end of deleteUser method
}// end of Login class