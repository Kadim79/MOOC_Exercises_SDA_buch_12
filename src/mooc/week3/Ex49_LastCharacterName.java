package mooc.week3;

//Create a program that asks for the user's name and gives the last character.

import java.util.Scanner;

public class Ex49_LastCharacterName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = input.nextLine();
        System.out.println("Last character: " + lastCharacter(name));
    }

    public static char lastCharacter(String text){
        return text.charAt(text.length()-1);
    }
}
