package mooc.week4;

//Create the method smartCombine that works like the previous combine method except that
//numbers can be on the list only once. This means that the method adds a new number to
//the list only if the list does not already contain that number. You might find the method
//contains from the ArrayList class useful. You can use that method to check if a number is
//in the list.

import java.util.ArrayList;
import java.util.Random;

public class Ex71_SmartCombiningLists {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = generateList();
        System.out.println("List 1: " + list1);

        ArrayList<Integer> list2 = generateList();
        System.out.println("List 2: " + list2);

        combineSmart(list1,list2);
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
    }

    protected static void combineSmart(ArrayList<Integer> first, ArrayList<Integer> second) {

        for (int number : second) {
            if(!first.contains(number))
                first.add(number);
            }
    }

    protected static ArrayList<Integer> generateList(){

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 7+random.nextInt(10); i++) {
            list.add(random.nextInt(15));
        }
        return list;
    }

}
