package mooc.week3;

//Create the method public static void removeLast(ArrayList<String> list),
// which removes the last item from the list.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex62_RemoveLastFromOrderedList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> myArrayList = new ArrayList<>();

        myArrayList.add("Barlad");
        myArrayList.add("Craiova");
        myArrayList.add("Brasov");
        myArrayList.add("Constanta");
        System.out.println(myArrayList);

        removeLastElement(myArrayList);
        System.out.println(myArrayList);
    }

    private static void removeLastElement(ArrayList<String> list){
        Collections.sort(list);
        list.remove(list.get(list.size()-1));
    }
}
