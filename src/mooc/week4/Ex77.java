package mooc.week4;

public class Ex77 {


    public static void main(String[] args) {

        LyyraCard pekkaCard = new LyyraCard("Pekka",20);
        LyyraCard brianCard = new LyyraCard("Pekka",20);
        pekkaCard.payGourmet();
        brianCard.payEconomical();
        System.out.println(pekkaCard);
        System.out.println(brianCard);
        pekkaCard.loadMoney(20);
        brianCard.payGourmet();
        System.out.println(pekkaCard);
        System.out.println(brianCard);
        pekkaCard.payEconomical();
        pekkaCard.payEconomical();
        brianCard.loadMoney(50);
        System.out.println(pekkaCard);
        System.out.println(brianCard);



    }

}

class LyyraCard{

    String name;
    private double balance;

    public LyyraCard(String name,double balanceAtStart) {
        this.name = name;
        this.balance = balanceAtStart;
    }

    public String toString() {
        return this.name + " " + getClass().getSimpleName()
                + " has " + this.balance + " euro!";
    }

    public void payEconomical() {
        if(this.balance>2.5)
            this.balance -= 2.5;
    }

    public void payGourmet() {
        if(this.balance>2.5)
            this.balance -= 4;
    }

    public void loadMoney(double amount) {
        if(amount>=0)
        this.balance += amount;
        }

}
