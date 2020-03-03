package mooc.week4;

//Clock using a counter

import java.util.Scanner;

public class Ex78 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("Please enter the seconds: ");
        int s = Integer.parseInt(input.nextLine());
        System.out.print("Please enter the minutes: ");
        int m = Integer.parseInt(input.nextLine());
        System.out.print("Please enter the hours: ");
        int h = Integer.parseInt(input.nextLine());
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;

        while (i < 30) {
            System.out.println("" + hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);
            seconds.next();
            i++;

            if (seconds.getValue() == 0 ) {
                minutes.next();
                if (minutes.getValue() == 0 ) {
                    hours.next();
                }
            }

        }

    }
}

class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (this.value <upperLimit)
            value++;
        else
            this.value = 0;
    }

    public String toString() {
        if (this.value < 10)
            return "0" + this.value;
        else
            return "" + this.value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(!(value<0 || value>this.upperLimit) )
        this.value = value;
    }
}
