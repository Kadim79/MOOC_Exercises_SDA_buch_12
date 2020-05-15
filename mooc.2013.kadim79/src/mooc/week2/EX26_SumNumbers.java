package mooc.week2;

import java.util.Scanner;

public class EX26_SumNumbers {

    public static void main(String[] args) {

        Ex25_Sum3Numbers.addNumber();
        System.out.println();

        Scanner reader = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Please enter a number. To quit please enter 0! ");
            int read = Integer.parseInt(reader.nextLine());


            if (read == 0) {
                break;
            }

            sum += read;

            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum in the end: " + sum);
    }
}

//    Create a program that reads numbers from the user and prints their sum.
//    The program should stop asking for numbers when user enters the number 0.
//    The program should be structured like this:

