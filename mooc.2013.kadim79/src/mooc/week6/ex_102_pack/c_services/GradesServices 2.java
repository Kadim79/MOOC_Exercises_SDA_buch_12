package mooc.week6.ex_102_pack.c_services;

import mooc.week6.ex_102_pack.a_build_grades_list.A_Grades_System;
import mooc.week6.ex_102_pack.a_build_grades_list.B_Grade;

import java.util.ArrayList;

import static mooc.week6.ex_102_pack.c_services.GeneralServices.input;
import static mooc.week6.ex_102_pack.c_services.PrintGradesList.stringNiceFormat;

public class GradesServices {

    public static int[] buildGrade(int id){

        System.out.print("Please enter the grade: ");
        int grade = Integer.valueOf(input.nextLine());

        System.out.print("Please enter the scoreMin: ");
        int scoreMin = Integer.valueOf(input.nextLine());

        System.out.print("Please enter the scoreMax: ");
        int scoreMax = Integer.valueOf(input.nextLine());

        System.out.println("Points: " + scoreMin + "-" + scoreMax +
                "-> Grade = " + grade);
        System.out.println("------------------------");

        stringNiceFormat(scoreMin, scoreMax, grade);

        return new int[] {grade,scoreMin,scoreMax};
    }

    public static ArrayList<B_Grade> buildGradesList(A_Grades_System gradesNumber)  {

        ArrayList<B_Grade> list = new ArrayList<>();

        for (int i = 0; i < gradesNumber.getGradesNumber(); i++) {

            list.add(new B_Grade(gradesNumber.getGradesNumberId()));
        }

        PrintGradesList.printGrades(list);

        return list;
    }

    public static int calculateGrade(int number) {

        System.out.println("Metoda calculateGrade() in constructie!");

        if (number >= 0 && number < 30) {
            return 0;
        } else if (number >= 30 && number < 35) {
            return 1;
        } else if (number >= 35 && number < 40) {
            return 2;
        } else if (number >= 40 && number < 45) {
            return 3;
        } else if (number >= 45 && number < 50) {
            return 4;
        } else if (number >= 50 && number <= 60) {
            return 5;
        } else {
            System.out.println("Too big value for this grades system!");
            return -1;
        }

//        System.out.println("O eroare in modul automat de preluare date " +
//                "te rog introdu de la consola!");
//        return calculateGrade(Integer.parseInt(input.nextLine()));


        //list.add(Integer.toString(new B_BuildGrade().getGrade())); // *** mai trebuie lucrat aici

        // trebuie sa lucrez ca sa stochez in clasa GradesList obiectele de tip BuildGrades
        // iar clasa BuildGradesList sa functioneze cu obiecte si nu cu fielduri inca
        // de lucru la structura ... poate reusesc sa fac si un factory de ScoresAndGrades
        // care sa genereze practic in functie de cum construiesc GradesList un rezultat
        // practic vor fi in functie de nr-ul de grades si de intervalele lor AHAAAA :))
        // deci factory trebuie sa imi genereze GradesList dupa care sa functioneze
        // SetOfScores adicalea setul de date sa fie prelucrat in functie de lista de
        // de grades generata din factory in functie de numarul de grades is intervale
    }
}
