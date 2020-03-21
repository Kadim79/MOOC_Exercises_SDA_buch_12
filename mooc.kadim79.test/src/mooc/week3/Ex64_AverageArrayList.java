package mooc.week3;

import java.util.ArrayList;

public class Ex64_AverageArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The sum: " + sum(list));
        System.out.println("The average of the list is : "+average(list));

        list.add(10);

        System.out.println("The sum: " + sum(list));
        System.out.println("The average of the list is : "+average(list));

    }

    protected static int sum(ArrayList<Integer>list){
        int sum=0;
        for (int element :list) {
            sum += element;
        }
        return sum;
    }

    protected static double average(ArrayList<Integer>list){

        return (double) sum(list)/list.size();
    }
}
