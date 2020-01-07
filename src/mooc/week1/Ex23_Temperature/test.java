package mooc.week1.Ex23_Temperature;

import java.io.Console;

public class test {

    public static void main(String[] args)
    {
        Console console = System.console();

        console.printf("Please enter your username: ");
        String username = console.readLine();
        console.printf(username + "\n");

        console.printf("Please enter your password: ",console.readLine());
        char[] passwordChars = console.readPassword();
        String passwordString = new String(passwordChars);
        console.printf("\nAfiseaza parola: " + passwordString + "\n");
    }
}
