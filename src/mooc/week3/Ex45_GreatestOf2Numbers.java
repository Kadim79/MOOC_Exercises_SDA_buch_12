package mooc.week3;

//Create the method greatest, which gets three integers as parameters and then
//returns the greatest of them. If there are several parameters that are equally great,
//you can decide which one is returned. Printing should be done in the main program.

public class Ex45_GreatestOf2Numbers extends Ex44_LeastOf2Numbers {

    public static void main(String[] args) {

        System.out.println("The greatest of the two numbers is --> "
                + greatestOfTwoNumbers(generateInteger(),generateInteger()));
    }

    private static int greatestOfTwoNumbers(int number1,int number2) {

        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }
}
