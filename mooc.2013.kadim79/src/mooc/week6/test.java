package mooc.week6;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        String test = "Ana are mere";
        Scanner input = new Scanner(test);

        String dinTest1 = input.findInLine("Kadim");
        System.out.println(dinTest1);

        String dinTest2 = input.findInLine("Ana");
        System.out.println(dinTest2);
    }
}
