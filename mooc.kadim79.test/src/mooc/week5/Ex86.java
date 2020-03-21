package mooc.week5;

public class Ex86 {

    public static void main(String[] args) {
        LyyraCard cardOfPekka = new LyyraCard(10);

        System.out.println("money on the card " + cardOfPekka.balance() );
        boolean succeeded = cardOfPekka.pay(8);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );

        succeeded = cardOfPekka.pay(4);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );
        System.out.println();

        CashRegister unicafeExactum = new CashRegister();

        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange );

        theChange = unicafeExactum.payEconomical(5);
        System.out.println("the change was "  + theChange );

        theChange = unicafeExactum.payGourmet(4);
        System.out.println("the change was "  + theChange );

        System.out.println( unicafeExactum );
        System.out.println();

        CashRegister unicafeExactum1 = new CashRegister();
        System.out.println( unicafeExactum1 );

        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded1 = unicafeExactum1.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded1);

        unicafeExactum1.loadMoneyToCard(cardOfJim, 100);

        succeeded1 = unicafeExactum1.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded1);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum1 );
    }
}


class LyyraCard {
    private double balance;

    public LyyraCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }

    public boolean pay(double amount){
        if(amount > balance)
            return false;
        else
        {
            balance -= amount;
            return true;
        }
    }
}

class CashRegister {

    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        if(cashGiven>=2.5)
        {
          economicalSold++;
          cashInRegister +=2.5;
          return cashGiven-2.5;
        }
        else
            return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if(cashGiven>=4)
        {
            gourmetSold++;
            cashInRegister +=4;
            return cashGiven - 4;
        }
        else
            return cashGiven;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum>0)
        {
            card.loadMoney(sum);
        }
    }

    public boolean payEconomical(LyyraCard card) {

        if(card.balance()>=2.5)
        {
            economicalSold++;
            card.pay(2.5);
            cashInRegister +=2.5;
            return true;
        }
        else
            return false;
    }

    public boolean payGourmet(LyyraCard card) {

        if (card.balance()>=4)
        {
            gourmetSold++;
            card.pay(4);
            cashInRegister +=4;
            return true;
        }
        else
            return false;
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold:"+economicalSold+" and gourmet lunches sold:"+gourmetSold;
    }
}

