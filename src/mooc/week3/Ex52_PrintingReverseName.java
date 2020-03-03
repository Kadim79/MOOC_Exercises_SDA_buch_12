package mooc.week3;

import java.util.Scanner;

public class Ex52_PrintingReverseName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String myWord = input.next();
        int count = myWord.length()-1;

        while(count>=0){
            System.out.printf("%d. character: %s\n", count + 1, myWord.charAt(count));
            count--;
        }
    }

}
