package mooc.week3;

//Cerinte Problema Geo:
//Am nevoie de un program, care citeste de la tastatura 5 cuvinte si
//le pune intr-un array. Dupa asta, acel array este analizat si sunt numarate vocalele.
//La final se printeaza numarul de vocale din toate cuvintele. Vocale sunt A E I O U.
//Ex. 'gigi', 'brenciu','telefon' -> 8 vocale.

import java.util.Arrays;
import java.util.Scanner;

public class ExGeo_CountingVowels {

    static Scanner in = new Scanner(System.in);
    static int countVowels = 0;

    public static void main(String[] args) {

        String[] arraysOfStrings = buildArrayOfStrings();
        System.out.println("Numbers of our chars occurrences in " +
                Arrays.toString(arraysOfStrings) + " is --> " +
                countVowelsOccurrences(arraysOfStrings,buildArraysOfCharsOccurrences()));
    }

    public static String[] buildArrayOfStrings(){

        System.out.print("Please enter the number of strings: ");
        int numberOfStrings = Integer.parseInt(in.nextLine());
        String[] arrayOfStrings = new String[numberOfStrings];

        for (int i = 0; i < numberOfStrings ; i++) {
            System.out.print("Input the string no."+ (i+1)+" : ");
            arrayOfStrings[i] = in.nextLine();
        }
        return arrayOfStrings;
    }

    public static char[] buildArraysOfCharsOccurrences(){

        System.out.println("\nPlease enter chars occurrences: ");
        char[] arrayOfCharsOccurrences = in.nextLine().toCharArray();
        return arrayOfCharsOccurrences;
    }

    public static int countVowelsOccurrences(String[] arrayOfStrings, char[] c){

        for (String s : arrayOfStrings) {
            countVowelsOccurrences(s,c);
        }
        return countVowels;
    }

    public static int countVowelsOccurrences(String str, char[]c) {

        str.toLowerCase();
        char[] arrayChars = str.toCharArray();

        for (char letter:c) {

            for (int i = 0; i < str.length(); i++) {
                if (arrayChars[i]==letter)
                    countVowels++;
            }
        }
        return countVowels;
    }
}

//    Pentru cine vrea sa se joace cu recursivitatea :)) medal of honor ==--+++

//    private static int countOccurences(String someString, char searchedChar, int index) {
//
//        if (index >= someString.length()) {
//            return 0;
//        }
//    int count = someString.charAt(index) == searchedChar ? 1 : 0;
//        return count + countOccurences(someString, searchedChar, index + 1);
//    }

