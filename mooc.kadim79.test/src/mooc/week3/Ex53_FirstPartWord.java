package mooc.week3;

import java.util.Scanner;

public class Ex53_FirstPartWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type a word: ");
        String myWord = input.nextLine();
        System.out.print("Type the length of the first part: ");
        int firstPartLenght = Integer.parseInt(input.nextLine());
        int count = 0;

        while(count<(myWord.length()-firstPartLenght)){
            System.out.printf("%d. character: %s\n", count + 1, myWord.charAt(count));
            count++;
        }
    }
}
