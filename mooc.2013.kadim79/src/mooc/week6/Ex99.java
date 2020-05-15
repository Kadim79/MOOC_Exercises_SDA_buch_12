package mooc.week6;

public class Ex99 {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for (int element : array) {
            for (int i = 0; i < element; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

