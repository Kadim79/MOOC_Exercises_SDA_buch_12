package mooc.week1;

import java.util.Scanner;

public class Ex4_VaryingVariables {


    public static void main(String[] args) {
        int chickens = 9000;
        double bacon = 0.1;
        String tractor = "Zetor";
        System.out.println("Chickens:\n"+chickens+"\nBacon (kg):\n" + bacon +
                "\nA tractor:\n"+tractor);
        System.out.println("\nIn a nutshell:\n"+chickens+"\n"+bacon+"\n"+tractor);

        System.out.println("Test");
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println("Give a number:");
        value = Integer.parseInt(scanner.nextLine());
        System.out.println("You gave the number " + value);

    }

}


//    The exercise file initially contains a program which prints:
//
//        Chickens:
//        3
//        Bacon (kg):
//        5.5
//        A tractor:
//        There is none!
//
//        In a nutshell:
//        3
//        5.5
//        There is none!
//
//        Change the program in the specified places so that it will print:
//
//        Chickens:
//        9000
//        Bacon (kg):
//        0.1
//        A tractor:
//        Zetor
//
//        In a nutshell:
//        9000
//        0.1
//        Zetor
//