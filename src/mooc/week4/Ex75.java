package mooc.week4;

public class Ex75 {

    public static void main(String[] args) {

        DecreasingCounter test = new DecreasingCounter(10);
        test.printValue();
        test.decrease();
        test.printValue();
    }
}

class DecreasingCounter {

    private int value;   // object variable that remembers the value of the counter

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        this.value--;

    }

    // and here the rest of the methods
}