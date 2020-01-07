package mooc.week2;

import java.util.Scanner;

public class EX35_2Powers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number : ");
        int number = Integer.parseInt(input.nextLine());
        int sum = 0;

        for (int i = 0; i < number; i++) {
            sum += Math.pow(2,i);
        }

        System.out.println("The sum of the 2 powers is : " + (int)sum);
    }
}
