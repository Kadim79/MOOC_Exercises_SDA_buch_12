package mooc.week3;

//Create a program that asks the user to input words, until the user gives
// an empty string. Then the program prints the words the user gave in reversed
// order, the last word is printed first etc.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ex59_WordsReverseOrder {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        ArrayList<String> stringArrayList = new ArrayList<>();
        String wordToAdd;

        while(true){
            System.out.print("Type a word: ");
            wordToAdd = input.nextLine();

            if(!wordToAdd.isEmpty()){
                stringArrayList.add(wordToAdd);
            }
            else {
                break;
            }
        }

        System.out.println(stringArrayList);

        Collections.reverse(stringArrayList);

        Iterator<String> iterator = stringArrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
