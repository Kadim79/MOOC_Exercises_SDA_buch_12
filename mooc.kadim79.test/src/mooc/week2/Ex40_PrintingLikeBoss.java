package mooc.week2;

public class Ex40_PrintingLikeBoss{

    public static void main(String[] args) {

        printRightSideTriangle(5);
        printXmasTree(7);
    }

    private static void printWhiteSpaces(int size){

        for (int i = 0; i <size ; i++) {
            System.out.print(" ");
        }
    }

    private static void printStars(int starNumbers){

        for (int i = 0; i <starNumbers ; i++) {
            System.out.print("*");
        }
    }


    private static void printRightSideTriangle(int size){

        System.out.println("Print a right side triangle: ");

        for (int i = 1; i <=size ; i++) {
            printWhiteSpaces(size-i);
            printStars(i);
            System.out.println();
        }
        System.out.println();
    }

    private static void printXmasTree(int height){

        int starsNumber = 1;
        System.out.println("Christmas Tree **@<:-)");

        if(height<3)
        {
            System.out.println("Wrong size!");
            return;
        }

        for (int i = 1; i < height+2; i++) {

            if(i<=height)
            {
                printWhiteSpaces(height-i);
                printStars(starsNumber);
                System.out.println();
                starsNumber+=2;
            }

            else
            {
                for (int j = 0; j <3 ; j++) {
                    printWhiteSpaces(height-2);
                    printStars(3);
                    System.out.println();
                }

            }
        }
    }
}



//    Create a method printWhitespaces(int size) that prints the given amount of whitespaces.
//        Them method should not print a line break.
//
//        Reimplement or copy the method printStars(int size) from the previous exercise.
//
//        Exercise 40.2: Printing a right-aligned triangle
//
//        Create the method printTriangle(int size) that prints a triangle using the mehtods
//        printWhitespaces and printStars. Note: do not print anything in the method itself,
//        just call the helper methods to do the actual printing.
//        Create the method xmasTree(int height) that prints a Christmas tree using the mehtods
//        printWhitespaces and printStars. A Christmas tree consists of a triangle of given
//        height and a stand. The stand is two stars tall and three stars wide and it is
//        located in the center of the bottom of the triangle. Note: do not print anything
//        in the method itself, just call the helper methods to do the actual printing.