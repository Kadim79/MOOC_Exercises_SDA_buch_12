package mooc.week3;

import java.util.Scanner;

public class Ex69_PalindromList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please type a word : ");
        String word = input.nextLine();

        if(isPalindrom(word))
            System.out.println("The word is a palindrom!");
        else
            System.out.println("The word is not a palindrom!");

    }

    protected static boolean isPalindrom(String word) {

        for (int i = 0; i < word.length()/2-1; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i))
                return false;
        }
        return true;
    }
}
