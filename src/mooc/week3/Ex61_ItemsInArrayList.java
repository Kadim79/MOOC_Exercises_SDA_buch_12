package mooc.week3;

//Create the method public static int countItems(ArrayList<String> list)
// that returns the number of the items in the list. Your method should
// not print anything. Use a return statement to return the number as
// shown in the following example:


import java.util.ArrayList;

public class Ex61_ItemsInArrayList {

    public static void main(String[] args) {

        ArrayList<String> programmingLanguages = new ArrayList<String>();

        programmingLanguages.add("Pascal");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("C++");

        print(programmingLanguages);

        removeFirst(programmingLanguages);

        System.out.println();  // prints an empty line

        print(programmingLanguages);
        System.out.println();

        System.out.println("There are this many items in the list: "
                + countItems(programmingLanguages));
        System.out.println();

        insertElement("Cobol",programmingLanguages);
        print(programmingLanguages);

    }
    public static void print(ArrayList<String> printed) {
        for (String word : printed) {
            System.out.println( word );
        }
    }

    public static void removeFirst(ArrayList<String> list) {
        list.remove(0);  // removes the first item (indexed 0)
    }

    static int countItems(ArrayList<String> list){
        return list.size();
    }

    public static void insertElement(String element, ArrayList<String>list ){

        list.add(element);

    }

}
