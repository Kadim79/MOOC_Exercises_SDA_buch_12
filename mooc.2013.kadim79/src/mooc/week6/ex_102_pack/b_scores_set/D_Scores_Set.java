package mooc.week6.ex_102_pack.b_scores_set;

import java.util.ArrayList;
import java.util.Scanner;

//    https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/

public class D_Scores_Set {

    private String nameDataSet;
    private ArrayList<Integer> setOfScores;
    private ArrayList<Integer> calculatedGrades;

    private Scanner scanner = new Scanner(System.in);

    public D_Scores_Set() {

        System.out.print("Please type a name for this data set: ");

        this.nameDataSet = scanner.nextLine();
        setOfScores = new ArrayList<>();
        calculatedGrades = new ArrayList<>();
        buildSetOfScores();
        scanner.close();
    }

    public ArrayList<Integer> getSetOfScores() {
        return setOfScores;
    }

    public ArrayList<Integer> getCalculatedGrades() {
        return calculatedGrades;
    }

    @Override
    public String toString() {
        return "----------------------------------------------- \n" +
                "--> This set of scores name is " + nameDataSet +
                "\n\t o The recorded data are : \n\t    - Set of scores \t--> " + setOfScores +
                "\n\t    - Calculated grades --> " + calculatedGrades;
    }


    public void buildSetOfScores() {

        int score;
        int dataSetLimit = 0;
        System.out.println(" *To end the scores set please type -1 !*\n");

        while (true) {

            System.out.print("Please enter the score: ");
            score = Integer.parseInt(scanner.nextLine());

            confirmData();

            if (score == -1)
                break;

            setOfScores.add(score);

//            calculatedGrades.add(GradesListServices.calculateGrade(score));


//     stabilesc o limita maxima pt setul de date pt a nu da ocazia unei bucle infinite

            dataSetLimit++;

            if (dataSetLimit > 100)
                break;
        }
    }


    public boolean confirmData() {

//        System.out.println("te rog sa confirmi introducerea datelor!");
//        if (JOptionPane.showInputDialog("Confirmi datele introduse ? :D")
//                .equalsIgnoreCase("da")) {
//            System.out.println("Bravo !!! Mergem mai departe");
//            return true;
//        } else {
//            System.out.println("Trebuie sa introduci din nou datele !");
//            return false;
        // trebuie sa introduc o variabila cu cea mai mica valoare pt gradesList si
        // cu cea mai mare valoare pentru gradesList iar daca valoarea nu este in
        //acest interval atunci se cere reintroducerea valorii
//    }
        System.out.println("Metoda de verificare date in constructie! :D");
        return true;

    }
}
