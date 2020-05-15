package mooc.week6.ex_102_pack.d_result_data;

import mooc.week6.ex_102_pack.a_build_grades_list.B_Grade;

import java.util.ArrayList;

public class PartialData {

    ArrayList<B_Grade> partialGradesList;
    ArrayList<Integer> partialScoresList;

    public static PartialData instanceOfPartialData;
    public static int gradesNumberId;

    private PartialData() {
        this.partialGradesList = partialGradesList;
        this.partialScoresList = partialScoresList;
    }

    public static PartialData getInstance(){
        if(instanceOfPartialData == null)
            instanceOfPartialData = new PartialData();
        return instanceOfPartialData;
    }
}
