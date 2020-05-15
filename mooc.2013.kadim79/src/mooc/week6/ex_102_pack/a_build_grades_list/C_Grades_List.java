package mooc.week6.ex_102_pack.a_build_grades_list;

import mooc.week6.ex_102_pack.c_services.GradesServices;

import java.util.ArrayList;

public class C_Grades_List {

    private ArrayList<B_Grade> gradesList;

    public C_Grades_List(A_Grades_System gradesNumber) {

        System.out.println("Please enter the name of the gradesList: ");
        this.gradesList = GradesServices.buildGradesList(gradesNumber);

    }

    @Override
    public String toString() {
        return "The Grades List = " + gradesList;
    }
}
