package mooc.week1;

import java.util.Scanner;

public class Ex12_SumAges {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type your name: ");
        String firstName = input.nextLine();
        System.out.println("Type your age: ");
        int firstAge = Integer.parseInt(input.nextLine());

        System.out.println("Type your name: ");
        String secondName = input.nextLine();
        System.out.println("Type your age: ");
        int secondAge = Integer.parseInt(input.nextLine());

        int totalAge = firstAge+secondAge;

        System.out.printf("\n%s and %s are %d years old in total.",firstName,secondName,totalAge);



    }
}

//    Create a program that asks for the names and ages of two users.
//        After that the program prints the sum of their ages.
//        Type your name: Matti
//        Type your age: 14
//
//        Type your name: Arto
//        Type your age: 12
//        Matti and Arto are 26 years old in total.
