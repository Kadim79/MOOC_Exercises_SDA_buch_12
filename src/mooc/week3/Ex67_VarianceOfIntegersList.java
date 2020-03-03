package mooc.week3;

//Create the method variance, which receives a list of integers as a parameter and then
//returns the sample variance of that list. You can check how a sample variance is calculated
//in Wikipedia, under "Population variance and sample variance".Note: the method should use
//the method average of exercise 64 to calculate the average of the parameters. The method
//should be called only once!

import java.util.ArrayList;

public class Ex67_VarianceOfIntegersList {

    public static void main(String[] args) {

//        ArrayList<Integer> list = Ex66_GreatestIntegerFromList.generateList();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println(list);
        System.out.println(varianceOfList(list));
    }

    protected static double varianceOfList (ArrayList<Integer> list){

        double mean = Ex64_AverageArrayList.average(list);
        System.out.println(mean);
        double var1 = 0;

        for (int i = 0; i < list.size(); i++) {
            var1 += Math.pow((list.get(i)- mean),2) ;
            System.out.println(var1);
        }

       return var1/(list.size()-1);
    }
}
