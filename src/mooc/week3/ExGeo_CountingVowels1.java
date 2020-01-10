package mooc.week3;

//Cerinte Problema Geo:
//Am nevoie de un program, care citeste de la tastatura 5 cuvinte si
//le pune intr-un array. Dupa asta, acel array este analizat si sunt numarate vocalele.
//La final se printeaza numarul de vocale din toate cuvintele. Vocale sunt A E I O U.
//Ex. 'gigi', 'brenciu','telefon' -> 8 vocale.


import java.util.Arrays;
import java.util.Scanner;

public class ExGeo_CountingVowels1 {

    static Scanner in = new Scanner(System.in);
    static int countVowels = 0;
    static char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    static char[] charOfArrayStrings;
    String[] arrayOfstrings = new String[5];

    public ExGeo_CountingVowels1() {

        for (int i = 0; i < arrayOfstrings.length; i++) {

            System.out.print("Type the string no." + (i + 1) + " : ");
            this.arrayOfstrings[i] = in.nextLine();
            countVowelsOccurrences(arrayOfstrings[i], vowels);
        }
    }

    public static void main(String[] args) {

        String s = "joy";

        while (!s.equalsIgnoreCase("quit")) {

            ExGeo_CountingVowels1 object = new ExGeo_CountingVowels1();
            System.out.println("Number of vowels occurrences in " +
                    Arrays.toString(object.arrayOfstrings) + " is --> " + countVowels);
            System.out.println("\nPlease type 'quit' to exit program!");
            s = in.nextLine();
            System.out.println();
        }
    }

    public static void countVowelsOccurrences(String str, char[] c) {

        for (char letter : c) {
            for (int i = 0; i < str.length(); i++) {
                if (str.toCharArray()[i] == letter)
                    countVowels++;
            }
        }
    }
}
