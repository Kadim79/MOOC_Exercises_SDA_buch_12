package mooc.week3;

import java.util.ArrayList;

public class Ex63_SumElementsArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The sum: " + sum(list));

        list.add(10);

        System.out.println("The sum: " + sum(list));
    }

    private static int sum(ArrayList<Integer>list){
        int sum=0;
        for (int element :list) {
            sum += element;
        }
        return sum;
    }
}
