package mooc.week1;

import java.util.Scanner;

public class Ex10_Circle_Circum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please type the radius value : ");
        int radius = Integer.parseInt(input.nextLine());

        double circumference = 2*Math.PI*radius;

        System.out.printf("The circle circumference : 2*PI*%d = %.2f",radius,circumference);
    }
}

//    The circumference of a circle is calculated using the formula 2 * pi * radius.
//        Create a program that asks the user for the radius and then calculates the
//        circumference using the given radius. Java already contains the value of pi
//        in the Math.PI variable, which you can use in your calculation.
//
//        Type the radius: 20
//
//        Circumference of the circle: 125.66370614359172
