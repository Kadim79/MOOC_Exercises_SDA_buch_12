package mooc.week6.ex_102_pack.b_scores_set;

// de refacut structura

import java.util.ArrayList;
import java.util.Scanner;

// am exersat Design Pattern-ul Singletton

public class CalculatedGradesList {

    String name;
    private ArrayList<String> availableGrades;
    private static CalculatedGradesList only_instance = null;

    private Scanner input = new Scanner(System.in);

    private CalculatedGradesList(){

        availableGrades = new ArrayList<>();
        System.out.println("Please enter your list name: ");
        name = input.nextLine();
        System.out.print("Please enter the number of grades : ");

    }

    public static CalculatedGradesList getGradesList(){
        if(only_instance == null)
            only_instance = new CalculatedGradesList();
        return only_instance;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getAvailableGrades() {
        return availableGrades;
    }

//    public void setAvailableGrades(ArrayList<String> availableGrades) {
//        this.availableGrades = GradesListServices.buildGradesList();
//    }
}
