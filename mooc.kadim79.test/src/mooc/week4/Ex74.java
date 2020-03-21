package mooc.week4;

//Implement the class Multiplier that has:
//  - a constructor public Multiplier(int number).
//  - a method public int multiply(int otherNumber) that returns otherNumber multiplied
//    by number (i.e., the constructor parameter).

public class Ex74 {

    public static void main(String[] args) {

        Multiplier threeMultiplier = new Multiplier(3);
        System.out.println("threeMultiplier.multiply(3): " +
                threeMultiplier.multiply(3));
    }
}

class Multiplier{

    int number;

    public Multiplier(int number) {
        this.number = number;
    }

    public int multiply(int otherNumber){
        return otherNumber*this.number;
    }
}