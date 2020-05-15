package mooc;

import java.util.Locale;
import java.util.Scanner;

public class Mooc2020 {

    public static void main(String[] args) {

        String s = "blabla true false";
        Scanner input = new Scanner(s);
        input.useLocale(Locale.US);

        System.out.println("Test boolean? "+ input.hasNextBoolean());
        input.hasNext();
        System.out.println("Test boolean? "+ input.hasNextBoolean());
    }
}
