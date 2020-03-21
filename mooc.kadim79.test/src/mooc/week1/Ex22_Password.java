package mooc.week1;

import java.io.IOException;
import java.util.Scanner;

public class Ex22_Password {

    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Enter your name: ");
//
//        String name = reader.readLine();
//        System.out.println("Your name is: " + name);


        Scanner input = new Scanner(System.in);

        boolean flag = true;
        int passwordsCounter = 0;

        do {

            System.out.print("Username: ");
            String myName = input.next();

            System.out.print("Type password: ");
            String password = input.next();
            System.out.println();

            if (myName.equalsIgnoreCase("dorel") && password.equals("123")) {

                System.out.println("Correct password you unlocked the secret message!\n");
                System.out.println("The secret message is : Don't compare your begining to someone else's middle!\n");
                flag = false;
            } else {

                System.out.println("Wrong myName or password. Please try again!\n");
                flag = true;
                System.out.println("Please enter again your username and password!");

                passwordsCounter++;

                if (passwordsCounter == 3) {

                    System.out.println("You failed three time to login. Please try again later.");
                    break;
                }

            }

        } while (flag);
    }
}

//        In this exercise we create a program that asks the user for a password.
//        If the password is right, a secret message is shown to the user.

