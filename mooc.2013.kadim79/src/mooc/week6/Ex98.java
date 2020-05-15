package mooc.week6;

import java.util.Arrays;

public class Ex98 {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        copied[0] = 99;

        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));

        int[] reverse = reverseCopy(original);

        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] reverseCopy(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[array.length-i-1] = array[i];
        }
        return newArray;
    }
}


