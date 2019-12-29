package mooc.week1;

import java.util.Scanner;

public class Ex9_Divider {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please type your first number : ");
        int firstNumber = Integer.parseInt(input.nextLine());

        System.out.println("Please type your second number : ");
        int secondNumber = Integer.parseInt(input.nextLine());

        double quotient = (double)firstNumber/secondNumber;

        System.out.printf("The divider is : %d + %d = %.2f",firstNumber,secondNumber,quotient);
    }
}


//Exercise 9: Divider
//
//        Create a program that asks the user for two integers and prints their quotient.
//        Make sure that 3 / 2 = 1.5. If the decimal part is missing, take another look at 5.1
//        Floating point numbers (decimal numbers) to find the solution.
//
//        Type a number: 3
//        Type another number: 2
//
//        Division: 3 / 2 = 1.5
