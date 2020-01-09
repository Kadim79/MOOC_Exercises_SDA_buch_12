package mooc.week3;

import java.util.Arrays;
import java.util.Scanner;

public class ExGeo_CountingVowels {

    static Scanner in = new Scanner(System.in);
    static int countVowels = 0;

    public static void main(String[] args) {

        String[] arraysOfStrings = buildArrayOfStrings();
        System.out.println("Numbers of chars occurrences in " +
                Arrays.toString(arraysOfStrings) + "--> " +
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

    public static int countVowelsOccurrencesInString(String str,char[]c) {

        char[] arrayChars = str.toCharArray();

        for (char letter:c) {

            for (int i = 0; i < str.length(); i++) {
                if (arrayChars[i]==letter)
                    countVowels++;
            }
        }
        return countVowels;
    }

    public static int countVowelsOccurrences(String[] arrayOfStrings, char[] c){

        for (String s : arrayOfStrings) {
            countVowelsOccurrencesInString(s,c);
        }
        return countVowels;
    }
}

