package mooc.week2;

//Exercise 41: Guessing a number game
//Exercise 41.1: Guessing a number
//Exercise 41.2: Repeated guessing
//Exercise 41.3: Counting the guesses

import java.util.Random;
import java.util.Scanner;

public class Ex41_GuessNumber {

    private static int numberToGuess;
    private static Scanner input = new Scanner(System.in);
    private static int myGuess;
    private static int guessCounter = 1;

    public static void main(String[] args) {

        boolean flag = false;
        drawNumber();

        while(!flag)
        {
            System.out.print("Guess the number: ");
            flag = guessNumber();
            printMessage(myGuess);
            guessCounter++;
        }
    }

    private static void drawNumber()
    {
        Random random = new Random();
        System.out.println("The number to be guessed it was generated!");
        numberToGuess = random.nextInt(100);
    }

    private static boolean guessNumber()
    {
        myGuess = Integer.parseInt(input.nextLine());

        if(myGuess == numberToGuess)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private static void printMessage(int number)
    {
        if(number==numberToGuess) {
            System.out.println("Congratulations, your guess is correct!");
            System.out.println("You guess the number in "+guessCounter+" tries!");
        }

        else if(number<numberToGuess) {
            System.out.printf("The number is bigger, guess made : %d!\n",guessCounter);
        }

        else {
            System.out.printf("The number is lesser, guess made : %d!\n",guessCounter);
        }
    }
}

