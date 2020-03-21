package mooc.week2;

import java.util.Scanner;

public class Ex34_Factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number to calculate the number: ");

        int number = Integer.parseInt(input.nextLine());

        int factorial = 1;

        if(number == 0)
        {
            System.out.println(number+"! = 1");
        }

        for (int i = 1; i <=number ; i++) {
            factorial *=i;
        }

        System.out.println(number+"! = "+factorial);
    }
}
