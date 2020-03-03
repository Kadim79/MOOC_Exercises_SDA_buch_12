package mooc.week3;

//Create a program that asks the user to input words until the user gives
// the same word twice. Use an ArrayList structure in your program.


import java.util.ArrayList;
import java.util.Scanner;

public class Ex58_ReccuringWordArrayList {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        ArrayList<String> stringArrayList = new ArrayList<>();
        String wordToAdd;

        while(true){
            System.out.print("Type a word: ");
            wordToAdd = input.nextLine();
            if(!stringArrayList.contains(wordToAdd.toLowerCase())){
                stringArrayList.add(wordToAdd.toLowerCase());
            }
            else {
                System.out.println("You gave the word "+ wordToAdd + " twice.");
                break;
            }
        }
        System.out.println(stringArrayList);
    }
}
