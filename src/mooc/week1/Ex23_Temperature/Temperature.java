package mooc.week1.Ex23_Temperature;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type in today's temperature: ");
            double temp = Double.parseDouble(reader.nextLine());

            if (!(temp < -30) && !(temp > 40)) {
                Graph.addNumber(temp);
            }
        }
    }
}
