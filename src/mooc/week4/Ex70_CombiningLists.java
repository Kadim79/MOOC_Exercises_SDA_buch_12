package mooc.week4;

//Create the method public static void
//combine(ArrayList<Integer> first, ArrayList<Integer> second) that inserts the items
//in a list called second to a list called first. The order of the items can be anything
//and the same item can appear in the list more than once.

import java.util.ArrayList;
import java.util.Random;

public class Ex70_CombiningLists {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = generateList();
        System.out.println("This is the first list: " + list1);
        ArrayList<Integer> list2 = generateList();
        System.out.println("This is the second list: " + list2);

        combine(list1,list2);

        System.out.println("This is the first list: " + list1);
        System.out.println("This is the second list: " + list2);
    }

    protected static void combine(ArrayList<Integer> first,ArrayList<Integer> second){
        first.addAll(second);
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
