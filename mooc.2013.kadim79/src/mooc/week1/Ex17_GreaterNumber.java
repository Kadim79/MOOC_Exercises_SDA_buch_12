package mooc.week1;

import java.util.Scanner;

public class Ex17_GreaterNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int number1 = Integer.parseInt(input.nextLine());
        System.out.println();

        System.out.print("Please enter the second number: ");
        int number2 = Integer.parseInt(input.nextLine());

        if(number1>number2)
        {
            System.out.printf("The %d is bigger then the %d",number1,number2);
        }

        else if(number1==number2)
        {
            System.out.println("The 2 numbers are equal!");
        }

        else
        {
            System.out.printf("The %d is bigger then the %d",number2,number1);

        }

    }

}

//    Create a program that asks the user for two numbers and prints the greater of those two.
//        The program should also handle the case in which the two numbers are equal.



