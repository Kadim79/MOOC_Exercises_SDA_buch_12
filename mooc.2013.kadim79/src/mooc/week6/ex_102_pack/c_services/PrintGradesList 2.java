package mooc.week6.ex_102_pack.c_services;

import mooc.week6.ex_102_pack.a_build_grades_list.B_Grade;

import java.util.ArrayList;

public class PrintGradesList {

    public static void printGrades(ArrayList<B_Grade> list) {

        System.out.println("\n" + "    This your grades list ");
        System.out.println("    --------------------");
        System.out.println("      Points   Grades");

        for (B_Grade grade : list) {
            System.out.println("   |   " + adjustNumberDigitsFormat(grade.getScoreMin()) +
                    "-"
                    + adjustNumberDigitsFormat(grade.getScoreMax()) + "     " + grade.getGrade()
                    +  "      |");
        }

        System.out.println("    --------------------\n");
    }

    public static String adjustNumberDigitsFormat(int number){

        if(number>=0 && number<9)
            return '0' + String.valueOf(number);

        else if (number>9 && number<100)
            return String.valueOf(number);
        else
            return "invalid value --> accepted values between 0-99";
    }

    public static String stringNiceFormat(int scoreMin, int scoreMax, int grade) {

        // puteam sa folosesc si Stringuri ca nu aglomeram String Pool-ul dar am preferat
        //  sa ma joc cu StringByilderul :))

        StringBuilder sb1 = new StringBuilder(Integer.toString(scoreMin) + "-" +
                Integer.toString(scoreMax) + " => Grade " + Integer.toString(grade));
        StringBuilder sb2 = new StringBuilder(Integer.toString(scoreMin) + "-" +
                Integer.toString(scoreMax) + " => Grade " + Integer.toString(grade));

        if (scoreMin < 10)
            return sb1.insert(0, '0').toString();

        else if (scoreMax < 10)
            return sb1.insert(3, '0').toString();
        else
            return sb2.toString();
    }
}
