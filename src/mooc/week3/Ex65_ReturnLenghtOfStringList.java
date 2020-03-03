package mooc.week3;

//Create the method lengths that gets a list of String variables as a parameter
//and returns an ArrayList that contains the lengths of the Strings in the same
//order as the original list.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex65_ReturnLenghtOfStringList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        buildList(list);

        System.out.println("The lengths of the Strings: " +
                Arrays.toString(lenghtsArray(list)));

        System.out.println("The lengths of the Strings: " + lenghtsList(list));
    }

    private static void buildList(ArrayList<String> list ){

        Scanner input =new Scanner(System.in);

        do{
            int i = 0;
            System.out.print("Type a word: ");
            String wordToAdd = input.nextLine();

            if(wordToAdd.isEmpty())
                break;
            else
            {
                list.add(wordToAdd);
            }

        }while (true);

        System.out.println(list);
    }

    private static int[] lenghtsArray(ArrayList<String> list){

        int lenghtsList[] = new int[list.size()];

        int i = 0 ;

        for (String s : list ) {
            lenghtsList[i] = s.length();
            i++;
        }
        return lenghtsList;
    }

    private static ArrayList<Integer>lenghtsList(ArrayList<String> list){

        ArrayList<Integer> lenghtsList = new ArrayList<>();
        int i = 0 ;

        for (String s : list ) {
            lenghtsList.add(s.length());
        }
        return lenghtsList;
    }
}
