package mooc.week6.ex_102_pack.a_build_grades_list;

import mooc.week6.ex_102_pack.c_services.GradesServices;
import mooc.week6.ex_102_pack.d_result_data.GradesList;
import mooc.week6.ex_102_pack.d_result_data.Grades_System;

public class Runner_For_Test {

    public static void main(String[] args) {

        A_Grades_System gradesNumber_Test_0 = new A_Grades_System();
        GradesList.resultGradesList =
                GradesServices.buildGradesList(gradesNumber_Test_0);

        System.out.println(GradesList.resultGradesList); // just for test
        System.out.println();
        System.out.println(Grades_System.getInstance(gradesNumber_Test_0));//test

//        B_Grade firstGrade = new B_Grade(test0.getGradesNumberId());
//        System.out.println(firstGrade.toString());
//        C_GradesList list = new C_GradesList();
//        System.out.println(list.toString());

    }
}
