package mooc.week3;

//Create a program that asks for the user's name and gives its characters separately.
//You do not need to create methods in this exercise.


import java.util.Scanner;

public class Ex51_SeparatingAllChars {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String myWord = input.next();
        int count = 0;

        while(count<myWord.length()){
            System.out.printf("%d. character: %s\n", count + 1, myWord.charAt(count));
            count++;
        }
    }
}
