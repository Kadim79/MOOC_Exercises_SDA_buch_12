package mooc.week5;

public class Ex85 {

    public static void main(String[] args) {

        Counter myCounter = new Counter();
        System.out.println("Counter evolution : " + myCounter.value());
        myCounter.increase();
        System.out.println("Counter evolution: " + myCounter.value());
        myCounter.increase(7);
        System.out.println("Counter evolution: " + myCounter.value());
        myCounter.decrease();
        System.out.println("Counter evolution: " + myCounter.value());
        myCounter.decrease(3);
        System.out.println("Counter evolution: " + myCounter.value());
        myCounter.increase(-7);
        System.out.println("Counter evolution: " + myCounter.value());
        myCounter.decrease(-7);
        System.out.println("Counter evolution: " + myCounter.value());
    }


}

class Counter{

    private int counter;
    private boolean check;


    public Counter() {
        this.counter = 0;
        this.check = false;
    }

    public Counter(boolean check) {
        this.counter = 0;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.counter = startingValue;
        this.check = false;
    }

    public Counter(int startingValue, boolean check) {
        this.counter = startingValue;
        this.check = check;
    }

    public int value(){
        return counter;
    }

    public void increase(){
        this.counter +=1;
    }

    public void decrease(){
        if(check == false)
            counter--;
    }

    public void increase(int increaseAmount){
        if(increaseAmount>0)
            counter +=increaseAmount;
    }

    public void decrease(int decreaseAmount){

        if(check == true && decreaseAmount>0 && decreaseAmount < counter )
            this.counter -= decreaseAmount;
    }

}
