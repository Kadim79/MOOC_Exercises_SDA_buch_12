package mooc.week3;

//Create a program that asks for the user's name and says how many
//characters the name contains.

import java.util.Scanner;

public class Ex47_NameLength {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = input.nextLine();
        System.out.println("Number of characters: " + calculateCharacters(name));
    }

    public static int calculateCharacters(String text){

        return text.length();
    }
}
