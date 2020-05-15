package mooc.week3;

//Create a program that prints the end part of a word. The program asks the user
//for the word and the length of the end part. Use the substring method in your program.

import java.util.Scanner;

public class EX54_PrintEndPartWord {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Type a word: ");
        String myWord = input.nextLine();
        System.out.print("Type the length of the end part: ");
        int endPartLenght = Integer.parseInt(input.nextLine());

        try {
            String newWord = myWord.substring(myWord.length() - endPartLenght, myWord.length());
            System.out.println("The result is: " + newWord);
        }catch (StringIndexOutOfBoundsException eror)
        {
            System.out.println("You typed a number too big for the end part lenght!");
        }
    }
}
