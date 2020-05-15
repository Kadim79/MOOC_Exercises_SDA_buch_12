package mooc.week1;

import java.util.Scanner;

public class Ex20_Usernames {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = input.nextLine();

        if(name.equalsIgnoreCase("alex"))
        {

            System.out.print("Type your password: ");
            String password = input.nextLine();

            if(password.equals("mightyducks"))
            {
                System.out.println("You are now logged into the system!");
            }

            else
            {
                System.out.println("Your username or password was invalid!");
            }
        }

        else if (name.equalsIgnoreCase("emily"))
        {
            System.out.print("Type your password: ");

            String password = input.nextLine();

            if(password.equals("cat"))
            {
                System.out.println("You are now logged into the system!");
            }

            else
            {
                System.out.println("Your username or password was invalid!");
            }
        }

        else
        {
            System.out.println("Your username or password was invalid!");
        }
    }
}


//    Create a program that recognizes the following users:
//
//        Username	    Password
//         alex	       mightyducks
//         emily	      cat
//        The program should check for the username and password as follows: