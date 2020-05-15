package mooc.week5;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex88 {

    public static void main(String[] args) {

        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);
        System.out.println();

        ArrayList<Student> studentsList = new ArrayList<>();

        studentsList.add(new Student("Student First","1"));
        studentsList.add(new Student("Student Second","2"));
        studentsList.add(new Student("Student Third","3"));
        System.out.println(studentsList);

        Student.checkStudentName(studentsList);

        }
    }

class Student {

    private String name;
    private String studentNumber;
    private static Scanner input = new Scanner(System.in);


    public String getStudentNumber() {
        return studentNumber;
    }

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + studentNumber + ")";
    }

    public static void checkStudentName(ArrayList<Student> list) {
        System.out.print("Please enter the student name you want to search: ");
        String name = input.nextLine();

        for (Student student : list) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(student.toString() + " is your search !");
            }
        }
    }
}