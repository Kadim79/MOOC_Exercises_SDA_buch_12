package mooc.week3;

//Create a program that asks the user for two words. Then the program tells
//if the second word is included in the first word. Use String method indexOf
//in your program.


import java.util.Scanner;

public class Ex55_WordInWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first word: ");
        String firstWord = input.nextLine();
        System.out.print("Please enter the second word to find in the first word: ");
        String secondWord = input.nextLine();

        if(firstWord.indexOf(secondWord)>0)
        {
            System.out.print("The word " + secondWord + " was found in the first word "
                    + secondWord + ".");
        }

        else {
            System.out.print("The word " + secondWord + " wasn't found in the first word "
                    + secondWord + ".");
        }
    }
}
