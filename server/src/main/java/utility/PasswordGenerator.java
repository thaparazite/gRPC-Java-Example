package utility;
// this class generates a random password of length 16 using the ASCII table characters from 33 to 126 (inclusive)
public class PasswordGenerator {

        public static String passwordGenerator() {
            // Define an array to represent the ASCII table
            char[] asciiTable = new char[]{
                    '\u0000', '\u0001', '\u0002', '\u0003', '\u0004', '\u0005', '\u0006', '\u0007',
                    '\b', '\t', '\n', '\u000b', '\f', '\r', '\u000e', '\u000f',
                    '\u0010', '\u0011', '\u0012', '\u0013', '\u0014', '\u0015', '\u0016', '\u0017',
                    '\u0018', '\u0019', '\u001a', '\u001b', '\u001c', '\u001d', '\u001e', '\u001f',
                    ' ', '!', '"', '#', '$', '%', '&', '\'',
                    '(', ')', '*', '+', ',', '-', '.', '/',
                    '0', '1', '2', '3', '4', '5', '6', '7',
                    '8', '9', ':', ';', '<', '=', '>', '?',
                    '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                    'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                    'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
                    'X', 'Y', 'Z', '[', '\\', ']', '^', '_',
                    '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
                    'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                    'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                    'x', 'y', 'z', '{', '|', '}', '~', '\u007f'
            };// end of the array

            // Print the ASCII table
            // for (int i = 0; i < 128; i++) {
            // System.out.printf("%d: %c%n", i, asciiTable[i]);
            // }

            String password = "";// create a new String object to store the password
            StringBuilder tempPassword = new StringBuilder();// create a new StringBuilder object to store the password
            // generate a random password of length 12 using the ASCII table defined above
            for(int i = 0;i<tempPassword.capacity();i++){// loop through the password length and generate a random character
                // append the random character to the password string
                tempPassword.append(asciiTable[(33+(int)((Math.random()*(asciiTable.length-35))))]);
            }// end of for loop
            password = tempPassword.toString();// convert the StringBuilder object to a String

            //System.out.println("Password: " + password);
            //System.out.println("Password lenght: " + password.length());
            return password;
        }// end of passwordGenerator method
    }// end of PasswordGenerator class

