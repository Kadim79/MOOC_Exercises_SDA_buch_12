package mooc.week5;

public class Ex84 {

    public static void main(String[] args) {

        Counter myCounter = new Counter();
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
