package mooc.week2;

import java.util.Scanner;

public class Ex30_PrintToNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int i = Integer.parseInt(input.nextLine());

        for (int j = 1; j <=i ; j++)
        {
            System.out.println(j);
        }

    }
}
