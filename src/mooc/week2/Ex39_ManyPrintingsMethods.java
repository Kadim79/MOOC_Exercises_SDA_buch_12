package mooc.week2;

public class Ex39_ManyPrintingsMethods {

    public static void main(String[] args) {
        printStars(5);
        System.out.println();
        printSquare(5);
        printRectangular(4,3);
        printLeftSideTriangle(4);
    }
    private static void printStars(int starNumbers){

        for (int i = 0; i <starNumbers ; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void printSquare(int size){
        System.out.println("Print a Square: ");
        for (int i = 1; i <= size; i++) {
            printStars(size);
        }
        System.out.println();
    }

    private static void printRectangular(int width, int height){
        System.out.println("Print a Rectangular: ");
        for (int i = 1; i <= height ; i++) {
            printStars(width);
        }
        System.out.println();
    }

    private static void printLeftSideTriangle(int size){

        System.out.println("Print a left side triangle: ");
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
        System.out.println();
    }
}
