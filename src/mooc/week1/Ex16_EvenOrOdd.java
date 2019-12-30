package mooc.week1;

import java.util.Scanner;

public class Ex16_EvenOrOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = Integer.parseInt(input.nextLine());

        if (number%2==0){
            System.out.println(number+" is a even number!");
        }

        else
        {
            System.out.println(number+" is a odd number!");
        }
    }

}


//    Create a program that asks the user for a number and tells whether the number is even or odd.

