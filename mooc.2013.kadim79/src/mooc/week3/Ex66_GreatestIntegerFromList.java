package mooc.week3;

//Create the method greatest, which receives a list of numbers (ArrayList<Integer>)
//as a parameter and then returns the greatest number in the list as a return value.

import java.util.ArrayList;
import java.util.Random;

public class Ex66_GreatestIntegerFromList {

    public static void main(String[] args) {

        ArrayList<Integer> list = generateList();
        System.out.println(list);
        System.out.println(greatestFromList(list));
    }

    protected static ArrayList<Integer> generateList (){

        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < random.nextInt(10); i++) {
            list.add(random.nextInt(15));
        }

        return list;
    }

    protected static int greatestFromList(ArrayList<Integer> list) {

        int j = 0;
        for (int i : list) {
            if (i > j)
                j = i;
        }
        return j;
    }

}
