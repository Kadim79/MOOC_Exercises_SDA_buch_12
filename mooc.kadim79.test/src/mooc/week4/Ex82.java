package mooc.week4;

import java.util.ArrayList;
import java.util.Random;

public class Ex82 {

    public static void main(String[] args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();

        System.out.println("Lottery numbers:");
        for (int number : lotteryNumbers.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}

class LotteryNumbers {

    private ArrayList<Integer> numbers;
    Random random;

    public LotteryNumbers() {
        random = new Random();
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void drawNumbers() {

        for (int i = 0; i < 7; i++) {
            int number = random.nextInt(39) + 1;

            if (containsNumber(number))
                i--;
            else {
                numbers.add(number);
            }
        }

        System.out.println(numbers);
    }

    public boolean containsNumber(int number) {

        if (numbers.contains(Integer.valueOf(number)))
            return true;
        else
            return false;
    }
}
