import java.util.Scanner;

public class Ex7_Multiplication {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 4;
        int y = 5;

        System.out.println(x + " * " + y + " = " + (x*y));

        System.out.print("Please enter a number with Integer.parseint : ");
        Integer.parseInt(input.nextLine());
    }

}
