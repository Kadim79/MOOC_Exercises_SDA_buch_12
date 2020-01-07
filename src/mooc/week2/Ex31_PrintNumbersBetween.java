package mooc.week2;

import java.util.Scanner;

public class Ex31_PrintNumbersBetween {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the lower limit: ");
        int lowerLimit = Integer.parseInt(input.nextLine());
        System.out.println("Please enter the upper limit : ");
        int upperLimit = Integer.parseInt(input.nextLine());

        System.out.println("Printing the numbers between gived limits: ");

        for (int i = lowerLimit; i <= upperLimit ; i++) {
            System.out.println(i);
        }
    }
}
