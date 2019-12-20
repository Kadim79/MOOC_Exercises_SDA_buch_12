import java.util.Scanner;

public class Ex8_Adder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please type your first number : ");
        int firstNumber = Integer.parseInt(input.nextLine());

        System.out.println("Please type your second number : ");
        int secondNumber = Integer.parseInt(input.nextLine());

        System.out.printf("The sum : %d + %d = %d",firstNumber,secondNumber,firstNumber+secondNumber);

    }
}


//        Exercise 8: Adder
//
//        Create a program that asks the user for two integers and then prints their sum.
//
//        Type a number: 6
//        Type another number: 2
//
//        Sum of the numbers: 8
