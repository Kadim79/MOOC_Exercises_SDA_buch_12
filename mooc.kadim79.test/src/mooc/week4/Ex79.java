package mooc.week4;


import java.util.Scanner;

public class Ex79 {

    public static void main(String[] args) throws Exception {

        NumberStatistics stats = new NumberStatistics();

        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);

        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.getSum());
        System.out.println("average: " + stats.average());
        System.out.println("-----------------------");

        NumberStatistics statsTotal = new NumberStatistics();
        System.out.println("The sum of the numbers from statsTotal object " +
                "is: " + statsTotal.makeSumOfScannerNumbers("all numbers"));
        System.out.println("-----------------------");

        NumberStatistics statsEven = new NumberStatistics();
        System.out.println("sum of even: "
                + statsEven.makeSumOfScannerNumbers("even"));
        System.out.println("-----------------------");

        NumberStatistics statsOdd = new NumberStatistics();
        System.out.println("sum of odd: "
                + statsOdd.makeSumOfScannerNumbers("odd"));
        System.out.println("-----------------------");
    }
}

class NumberStatistics {

    private int amountOfNumbers;
    private int sum;
    private Scanner input = new Scanner(System.in);

    public NumberStatistics() {
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        amountOfNumbers++;
        sum = sum + number;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

    public double average() {
        return (double) sum / amountOfNumbers;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int makeSumOfScannerNumbers(String s) {

        System.out.println("This is a " + s + " implementation!");

        System.out.println("Type numbers: ");

        do {
            int number = Integer.parseInt(input.nextLine());
            if (number == -1) {
                break;
            }
            addNumber(chooseEvenOdd(number, s));

        } while (true);

        return getSum();
    }

    private int chooseEvenOdd(int number, String s) {

        if(!(s.equalsIgnoreCase("even")||
                s.equalsIgnoreCase("odd")))
            return number;

        if (s.equalsIgnoreCase("even") && number % 2 == 0)
            return number;
        else if (s.equalsIgnoreCase("odd") && number % 2 != 0)
            return number;
        else
            return 0;
    }
}