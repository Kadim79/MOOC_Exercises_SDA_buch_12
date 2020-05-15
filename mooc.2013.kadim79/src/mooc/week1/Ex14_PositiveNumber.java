package mooc.week1;

import java.util.Scanner;

public class Ex14_PositiveNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int flag = 0;

            System.out.println("Please enter your number: ");
            int number = Integer.parseInt(input.nextLine());
            if(number>0)
            {
                System.out.println("Positive number!");
            }
            else
            {
                System.out.println("Not a positive number!");
            }
    }
}


//    Create a program that asks the user for a number and tells
//        if the number is positive (i.e. greater than zero).