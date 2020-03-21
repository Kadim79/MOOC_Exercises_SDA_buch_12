package mooc.week1;

import java.util.Scanner;

public class Ex19_AgeCheck {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("How old are you?  ");
        int age = Integer.parseInt(input.nextLine());

        if(age<0 || age >120)
        {
            System.out.println("\nImpossible");
        }

        else
        {
            System.out.println("\nOk");
        }

    }
}


// Create a program that asks for the user's age and checks that it is reasonable (at least 0 and at most 120).