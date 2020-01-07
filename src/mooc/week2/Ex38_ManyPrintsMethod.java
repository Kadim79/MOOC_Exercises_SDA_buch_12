package mooc.week2;

import java.util.Scanner;

public class Ex38_ManyPrintsMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter ho many time to print: ");
        int printsNumber = Integer.parseInt(input.nextLine());
        System.out.println();

        for (int i = 0; i < printsNumber; i++) {
            printText();
        }
    }

    private static void printText(){

        System.out.println("Create a method printText that prints the following string of characters: " +
                "\"\nIn the beginning there were the swamp, the hoe and Java.\" and a line break.\n");
    }
}

//    Develop the program by adding the following feature:
//        the main program should ask the user how many times the text
//        should be printed (meaning how many times the method is called).

