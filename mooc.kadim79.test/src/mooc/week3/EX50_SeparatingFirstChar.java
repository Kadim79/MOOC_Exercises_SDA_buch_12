package mooc.week3;

//Create a program that asks for the user's name and gives its first,
//second and third characters separately. If the name length is less than three,
//the program prints nothing. You do not need to create methods in this exercise.


import java.util.Scanner;

public class EX50_SeparatingFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = input.nextLine();

            if (name.length() < 3){
                System.out.println("");
            }

            else {
                for (int i = 0; i < 3; i++) {
                    System.out.printf("%d. character: %s\n", i + 1, name.charAt(i));
                }
            }
    }
}
