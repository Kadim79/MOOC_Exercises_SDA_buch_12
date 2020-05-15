package mooc.week6.ex_102_pack.a_build_grades_list;

import static mooc.week6.ex_102_pack.c_services.GeneralServices.input;
import static mooc.week6.ex_102_pack.c_services.GeneralServices.random;

public class A_Grades_System {

    private String gradesSystemName;
    private int gradesNumber;
    private int gradesSystemId;


    public A_Grades_System(){

        System.out.print("Please enter the name for this grades sistem: ");
        this.gradesSystemName = input.nextLine();
        System.out.print("Please enter the grades number: ");
        this.gradesNumber = Integer.valueOf(input.nextLine());
        System.out.print("The grades number id: ");
        this.gradesSystemId = random.nextInt(90)+10;
        System.out.println(gradesSystemId);

        System.out.println(toString()+"\n");
    }

    public String getGradesSystemName() {
        return gradesSystemName;
    }

    public int getGradesNumberId() {
        return gradesSystemId;
    }

    public int getGradesNumber() {
        return gradesNumber;
    }


    @Override
    public String toString() {

        return "------------------------\n" +
                "The Grades System Object is => " +
                "Name='" + gradesSystemName + '\'' +
                "  Number_of_Grades=" + gradesNumber +
                "  System_ID=" + gradesSystemId;
    }
}
