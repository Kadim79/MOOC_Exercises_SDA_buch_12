package mooc.week6.ex_102_pack.a_build_grades_list;

import mooc.week6.ex_102_pack.c_services.GradesServices;

public class B_Grade {

    private int scoreMin;
    private int scoreMax;
    private int grade;
    private int gradesNumberId;

    public B_Grade(int gradesNumberId) {

        this.gradesNumberId = gradesNumberId;
        int[] buildGrade = GradesServices.buildGrade(gradesNumberId);
        this.grade = buildGrade[0];
        this.scoreMin = buildGrade[1];
        this.scoreMax = buildGrade[2];
    }

    public int getGrade() {
        return grade;
    }

    public int getScoreMin() {
        return scoreMin;
    }

    public int getScoreMax() {
        return scoreMax;
    }

    @Override
    public String toString() {

        return "Grade Object {" + "grade = " + grade +
                " --> scoreMin=" + scoreMin +
                ", scoreMax=" + scoreMax +
                ", Grades System Id=" + gradesNumberId + '}';
    }
}
