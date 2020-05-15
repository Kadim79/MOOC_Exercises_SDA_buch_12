package mooc.week6;

import java.util.Scanner;

public class AssertionsExample {

        public static void main( String args[] ){

            Scanner scanner = new Scanner( System.in );
            System.out.print("Enter ur age ");

            int value = scanner.nextInt();
            assert value>=18 : " Not valid - Text from assertion!";

            System.out.println("value is "+value);
        }
}
