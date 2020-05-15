package mooc.week2;

import java.util.Scanner;

public class Ex36_Loops {

    private static int sum = 0;
    private static int countEvenNumbers = 0;
    private static int countOddNumbers = 0;
    private static int average;


    public static void main(String[] args) {

        int number = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Type numbers: ");

        do{
            number = Integer.parseInt(input.nextLine());
            sum += sortNumber(number);
            if(number%2==0)
            {
                countEvenNumbers++;
            }
            else if(number!=-1)
            {
                countOddNumbers++;
            }

        }while(number!=-1);

        printResult();

    }

    private static int sortNumber(int i){
        if(i==-1)
        {
            return 0;
        }
        else
        {
            return i;
        }
    }

    private static void printResult(){

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is: "+ sum);
        System.out.println("How many numbers: "+(countOddNumbers+countEvenNumbers));
        System.out.println("The average is : "+ sum/(countEvenNumbers+countOddNumbers));
        System.out.println("Even numbers : "+countEvenNumbers);
        System.out.println("Odd numbers : "+countOddNumbers);
    }
}

//    Develop your number reading, summing and counting program by adding the following feature:
//    the program should print the average of the numbers the user typed (without the number -1).
//
//        Example:
//
//        Type numbers:
//        5
//        2
//        4
//        -1
//        Thank you and see you later!
//        The sum is 11
//        How many numbers: 3
//        Average: 3.666666666666
//        Even numbers: 2
//        Odd numbers: 1

