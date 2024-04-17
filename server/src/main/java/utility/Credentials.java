package utility;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
// this class reads and writes credentials to a file in CSV format
public class Credentials {
    // path to the credentials file
    private static final String CREDENTIALS_FILE = "src/main/resources/credentials.csv";
    // ensure the file exists and create it if it doesn't
    public static void ensureFileExists() {
        Path path = Paths.get(CREDENTIALS_FILE);// create a Path object with the path to the file
        if (!Files.exists(path)) {// check if the file exists
            try {
                Files.createDirectories(path.getParent()); // Create the directory structure
                Files.createFile(path); // Create new file
                System.out.println("File created successfully");
            } catch (IOException e) {// catch the IOException
                System.out.println("Failed to create file: " + e.getMessage());
                e.printStackTrace();
            }// end of try catch block
        } else {
            System.out.println("File already exists");
        }// end of if block
    }// end of ensureFileExists method
    // read the credentials from the file and return them as a HashMap object
    public static Map<String, String> readCredentials() {
        Map<String, String> credentials = new HashMap<>();// create a new HashMap to store the credentials
        Path path = Paths.get(CREDENTIALS_FILE);// create a Path object with the path to the file
        // read the file line by line and split each line by comma
        try (BufferedReader reader = Files.newBufferedReader(path))  {
            reader.readLine(); // Skip the first line (column names)
            String line;// create a variable to store the current line
            while ((line = reader.readLine()) != null) {// read the file line by line until the end of the file
                String[] parts = line.split(",");// split the line by comma and store the parts in an array
                if (parts.length >= 2) {// check if the array has at least 2 elements
                    String username = parts[0];// get the username from the first element
                    String password = parts[1];// get the password from the second element
                    credentials.put(username, password);// add the username and password to the HashMap
                }// end of if block
            }//
        } catch (IOException e) {// catch the IOException
            e.printStackTrace();// print the stack trace
        }// end of try catch block

        return credentials;// return the credentials HashMap
    }// end of readCredentials method
    // write the credentials to the file in CSV format
    public static void writeCredentials(Map<String, String> credentials) {
        Path path = Paths.get(CREDENTIALS_FILE);// create a Path object with the path to the file
        // write the credentials to the file in CSV format using a BufferedWriter
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            // Write the column names
            writer.write("Username"+","+"Password"+","+"\n");
            // Write the credentials to the file line by line in CSV format
            for (Map.Entry<String, String> entry : credentials.entrySet()) {
                // Write the username and password separated by a comma and a new line character at the end of each line
                writer.write(entry.getKey() + "," + entry.getValue() + ","+ "\n");
            }// end of for loop
        } catch (IOException e) {
            e.printStackTrace();
        }// end of try catch block
    }// end of writeCredentials method
}// end of Credentials class