package mooc.week3;

//Create the method moreThanOnce that gets a list of integers and an integer (i.e. number)
//as parameter. If the number appears on the list more than once the method returns true
//and otherwise false.


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex68_FindDuplicateInList {

    static Random random = new Random();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = generateList();
        System.out.println(list);
        System.out.print("Please type a number : ");
        int number = Integer.parseInt(input.nextLine());

        if(moreThenOnce(list,number))
        {
            System.out.println(number + " appears more than once.");
        }
        else
        {
            System.out.println(number + " does not appear more than once.");
        }
    }

    protected static boolean moreThenOnce(ArrayList<Integer>list,int number){

        for (int num : list) {
            if(num == number)
                return true;
        }
        return false;
    }

    protected static ArrayList<Integer> generateList (){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 7+random.nextInt(10); i++) {
            list.add(random.nextInt(15));
        }
        return list;
    }
}
