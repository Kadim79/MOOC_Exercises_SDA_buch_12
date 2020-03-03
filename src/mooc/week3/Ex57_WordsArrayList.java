package mooc.week3;

//Create a program that asks the user to input words until the user types in
//an empty String. Then the program prints the words the user gave. Try the
//for repetition sentence here. Use an ArrayList structure in your program.
//ArrayList is defined like this:
//        ArrayList<String> words = new ArrayList<String>();

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ex57_WordsArrayList {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        ArrayList<String> stringArrayList = new ArrayList<>();

        do{
            System.out.print("Type a word: ");
            String wordToAdd = input.nextLine();

            if(wordToAdd.isEmpty())
                break;
            else
                stringArrayList.add(wordToAdd);

        }while (true);

        System.out.println(stringArrayList);

        Iterator<String> iterator = stringArrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(stringArrayList);
        Collections.sort(stringArrayList);
        System.out.println(stringArrayList);
        Collections.shuffle(stringArrayList);
        System.out.println(stringArrayList);
        Collections.reverse(stringArrayList);
        System.out.println(stringArrayList);

    }

}
