package mooc.week2;

import java.util.Scanner;

public class Ex33_SumBetween2Numbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        System.out.println("Please enter the lower limit: ");
        int lowerToSum = Integer.parseInt(input.nextLine());

        System.out.println("Please enter the upper limit: ");
        int upperToSum = Integer.parseInt(input.nextLine());

        for (int i = lowerToSum; i <= upperToSum ; i++) {
            sum += i;
        }

        System.out.println("The sum: "+sum);

    }
}

//    Similar to the previous exercise, except that the program should ask for both
//    the lower and upper bound. You can assume that the users first gives the
//    smaller number and then the greater number.

