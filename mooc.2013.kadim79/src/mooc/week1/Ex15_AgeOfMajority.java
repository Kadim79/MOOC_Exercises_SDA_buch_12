package mooc.week1;

import java.util.Scanner;

public class Ex15_AgeOfMajority {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How old are you? ");
        int user_Age = Integer.parseInt(input.nextLine());

        if (user_Age<18)
        {
            System.out.println("You have not reached the age of majority yet!");
        }
        else
        {
            System.out.println("You have reached the age of majority!");
        }
    }
}

//    Create a program that asks for the user's age and tells whether
//        the user has reached the age of majority (i.e. 18 years old or older).