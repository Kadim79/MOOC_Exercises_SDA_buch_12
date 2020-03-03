package mooc.week4;

//In the template is class Dice that has the following functionality:
//        The constructor Dice(int numberOfSides) creates a new dice object that
//        has the amount of sides defined by the argument.
//        The method roll tells the result of a roll (which depends on the number
//        of its sides)

import java.util.Random;

public class Ex80 {

    public static void main(String[] args) {
        Dice myDice = new Dice(8);

        int i = 0;
        while ( i < 10 ) {
            System.out.println("Please roll the dice: " + myDice.roll());
            i++;
        }
    }

}

class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {
        return random.nextInt(numberOfSides)+1;
    }
}