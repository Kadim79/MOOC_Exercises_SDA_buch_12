package mooc.week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0_week3_Auxiliar_Methods {

    protected static int countArguments;
    private static Scanner input = new Scanner(System.in);

    protected static boolean isNumeric(String strNum) {

        if (strNum == null) {
            return false;
        }

        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    protected static int generateInteger(){

        System.out.print("Please enter a number:");
        boolean flag = true;
        int number = 0;

        while(flag){
            String s = input.nextLine();

            if(isNumeric(s))
            {
                number = Integer.parseInt(s);
                flag = false;
            }
            else
            {
                System.out.println("You didn't type an integer. Please type again!");
                System.out.println("If you want to quit program just type --> quit" );
                if(s.equalsIgnoreCase("quit"))
                {
                    System.exit(0);
                }
                flag = true;
            }
        }
        return number;
    }

    protected static int[] generateSumArguments(){

        countArguments = 0;
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        ArrayList<Integer> arrayListArguments = new ArrayList<Integer>();
        int[] arrayArguments = new int[arrayListArguments.size()];

        while(flag){

            System.out.print("Please enter numbers to be summed : ");
            String string = input.nextLine();

            if(!isNumeric(string))
            {
                System.out.println("You didn't type any number or you finish to introduce your " +
                        "arguments!");
                flag = false;
                arrayListArguments.remove(countArguments);
            }

            else
            {
                countArguments++;
                arrayListArguments.add(Integer.parseInt(string));
            }
        }

        for (int i = 0; i < arrayListArguments.size(); i++) {
            arrayArguments[i]=arrayListArguments.get(i);
        }

        return arrayArguments;
    }
}
