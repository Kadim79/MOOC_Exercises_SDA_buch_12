package mooc.week3;

//Create the method sum that calculates the sum of numbers
//the method receives as parameters.
//    M-am jucat putin la o metoda cam inutila dar destul de educativa :)) Hahaha !

import java.util.Arrays;

public class Ex43_SumOfNumbers extends Ex0_week3_Auxiliar_Methods {

    private static int resultOfSum;

    public static void main(String[] args) {

        System.out.println("The first method to sum: " + sum(1,2,3,4,5));

        int[] array = generateSumArguments();
        System.out.println(Arrays.toString(array));

//        System.out.println("The second method to sum: " + sum(generateSumArguments()));
    }

    public static int sum(int ... number) {
        for (int i :number)
        {
            resultOfSum+=i;
        }
        return resultOfSum;
    }
}
