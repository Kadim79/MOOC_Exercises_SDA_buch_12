package mooc.week6.ex_102_pack.d_result_data;

import mooc.week6.ex_102_pack.a_build_grades_list.A_Grades_System;

public class Grades_System {

    public static Grades_System instanceOfGrades_System;

    private String grades_System_Name;
    private int grades_System_Id;
    private int gradesNumber;

    private Grades_System(A_Grades_System gradesSystem) {

        this.grades_System_Name = gradesSystem.getGradesSystemName();
        this.grades_System_Id = gradesSystem.getGradesNumberId();
        this.gradesNumber = gradesSystem.getGradesNumber();
    }

    public static Grades_System getInstance(A_Grades_System gradesSistem){
        if(instanceOfGrades_System ==null)
            instanceOfGrades_System = new Grades_System(gradesSistem);
        return instanceOfGrades_System;
    }

    public String getGradesSystemName() {
        return grades_System_Name;
    }

    public int getGrades_System_Id() {
        return grades_System_Id;
    }

    public int getGradesNumber() {
        return gradesNumber;
    }


    @Override
    public String toString() {
        return "Grades_System => " +
                "System_Name='" + grades_System_Name + '\'' +
                ", System_Id=" + grades_System_Id +
                ", Number_Of_Grades=" + gradesNumber;
    }
}
