package mooc.week1;

import java.util.Scanner;

public class Ex18_GradesPoints {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of points: ");
        int pointNumbers = Integer.parseInt(input.nextLine());

        if (pointNumbers<0)
        {
            System.out.println("You entered a wrong number!");
        }

        else if(pointNumbers>0 && pointNumbers<29)
        {
            System.out.println("Grade: failed");
        }

        else if(pointNumbers > 29 && pointNumbers<35)
        {
            System.out.println("Grade: 1");
        }

        else if (pointNumbers>34 && pointNumbers<39)
        {
            System.out.println("Grade: 2");
        }

        else if(pointNumbers>39 && pointNumbers<45)
        {
            System.out.println("Grade: 3");
        }

        else if(pointNumbers>44 && pointNumbers<50)
        {
            System.out.println("Grade: 4");
        }

        else if(pointNumbers>49 && pointNumbers<61)
        {
            System.out.println("Grade: 5");
        }

        else
        {
            System.out.println("Wrong number!");
        }
    }
}


//    Create a program that gives the course grade based on the following table.
//
//        Points	Grade
//         0–29	    failed
//        30–34	      1
//        35–39	      2
//        40–44	      3
//        45–49	      4
//        50–60	      5
