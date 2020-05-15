package mooc.week3;

//Create the method least, which returns the least of the numbers given as parameters.
//If the parameters are equal, you can decide which one is returned.

import java.util.Scanner;

public class Ex44_LeastOf2Numbers extends Ex0_week3_Auxiliar_Methods {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("The least of the two numbers is --> "
                + leastOfTwoNumbers(generateInteger(),generateInteger()));
    }


    private static int leastOfTwoNumbers(int number1,int number2) {

        if (number1 > number2) {
            return number2;
        } else {
            return number1;
        }
    }

}
