package mooc.week4;

import java.util.Random;

public class Ex81 {

    public static void main(String[] args) {

        PasswordRandomizer randomizer = new PasswordRandomizer(9);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}

class PasswordRandomizer {
    // Define the variables here
    private int passwordLenght;
    private Random random;


    public PasswordRandomizer(int length) {
        random = new Random();
        this.passwordLenght = length;

    }

    public String createPassword() {
        String s = "";
        for (int i = 0; i < passwordLenght; i++) {
            int number = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            s += symbol;
        }
        return s;
    }
}
