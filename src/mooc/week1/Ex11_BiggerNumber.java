package mooc.week1;

import java.util.Scanner;

public class Ex11_BiggerNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please type your first number : ");
        int firstNumber = Integer.parseInt(input.nextLine());

        System.out.println("Please type your second number : ");
        int secondNumber = Integer.parseInt(input.nextLine());

        System.out.printf("The bigger number between %d and %d is %d",firstNumber,secondNumber,
                Math.max(firstNumber,secondNumber));
    }
}
