package mooc.week2;

import java.util.Scanner;

public class Ex32_SumTillNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        System.out.println("Please enter the number till we sum: ");

        int numberToSum = Integer.parseInt(input.nextLine());

        for (int i = 0; i <= numberToSum ; i++) {
            sum += i;
        }

        System.out.println("The sum: "+sum);

    }
}

//    Create a program that calculates the sum 1+2+3+…+n where n is a number entered by the user.