package mooc.week1.Ex23_Temperature;
import java.io.Console;

// ruleaza din command com/bash sau cu visual studio code

public class Temperature_Console {

        public static void main(String[] args)
        {
            Console console = System.console();

            console.printf("Please enter your username: ");
            String username = console.readLine();

            console.printf("Please enter your password: ");
            char[] passwordChars = console.readPassword();

            String passwordString = new String(passwordChars);
            console.printf("\nAfiseaza parola: " + passwordString + "\n");

        }
    }
