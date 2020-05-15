package mooc.week3;

//Create a similar program as the previous one, but in which the words
// are printed in alphabetical order.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ex60_WordsAlphabetOrder {

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

        Collections.sort(stringArrayList);

        Iterator<String> iterator = stringArrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
