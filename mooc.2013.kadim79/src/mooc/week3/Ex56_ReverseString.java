package mooc.week3;

//Create the method reverse that puts the given string in reversed order.
//Use the following program body for the method:

import java.util.Scanner;

public class Ex56_ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = input.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

    private static String reverse(String text){
        String reverseText ="";
        for (int i = text.length()-1; i >=0 ; i--) {
            reverseText += text.charAt(i);
        }
        return reverseText;
    }
}
