package mooc.week1;

import java.util.Scanner;

public class Ex21_LeapYear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Type a year: ");
        int year = Integer.parseInt(input.nextLine());
        if((year%4==0 && year%100!=0) || year%400==0)
        {
            System.out.println("It is a leap year.");
        }

        else
        {
            System.out.println("The year is not a leap year.");
        }
    }

}

//    A year is a leap year if it is divisible by 4. But if the year is divisible by 100,
////  it is a leap year only when it is also divisible by 400.
////  Create a program that checks whether the given year is a leap year.