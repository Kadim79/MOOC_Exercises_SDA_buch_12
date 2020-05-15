package mooc.week2;

import java.util.Scanner;

public class Ex25_Sum3Numbers {

    public static void main(String[] args) {

        System.out.println("The sum of the 3 numbers is : " + addNumber());
    }

    public static int addNumber() {

        int sum = 0;
        int number;
        int j = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of integeres you want to sum : ");
        int i = Integer.parseInt(input.nextLine());

        while (true) {

            j++;

            if (j > i) {
                System.out.println("The sum is : " + sum);
                break;
            }

            System.out.printf("Please enter the %d number : \n", j);
            number = Integer.parseInt(input.nextLine());
            sum += number;
        }
        return sum;
    }
}
