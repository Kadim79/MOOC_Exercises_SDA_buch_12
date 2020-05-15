package mooc.week6;

public class Ex95 {

    public static void main(String[] args) {

        Money a = new Money(10, 0);
        Money b = new Money(5, 0);

        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);          // NOTE: new Money-object is created and reference to that
        //           is assigned to variable a.
        //       The Money object 10.00e that variable a used to hold
        //           is not referenced anymore

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

    }
}


class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }
        return euros + "." + zero + cents + " Euro";
    }

    public Money plus(Money added) {

        Money plusMoney = new Money(this.euros + added.euros, this.cents + added.cents);
        return plusMoney;
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros)
            return true;
        else if (this.cents < compared.cents)
            return true;
        return false;
    }

    public Money minus(Money decremented) {

        if (this.euros > decremented.euros && this.cents > decremented.cents
                || (this.euros == decremented.euros && this.cents >= decremented.cents))
            return new Money(this.euros - decremented.euros,
                    this.cents - decremented.cents);

        else if (this.euros > decremented.euros && this.cents < decremented.cents)
            return new Money(this.euros - decremented.euros - 1,
                    this.cents + 100 - decremented.cents);
        else
            return new Money(0, 0);
    }

    public static void main(String[] args) {

        Money a = new Money(3, 10);
        Money b = new Money(3, 20);
        Money c = new Money(3, 15);

        System.out.println(a.less(b));  // false
        System.out.println(b.less(c));  // true

        Money aa = new Money(10, 0);
        Money bb = new Money(3, 50);

        Money cc = aa.minus(bb);

        System.out.println(aa);  // 10.00e
        System.out.println(bb);  // 3.50e
        System.out.println(cc);  // 6.50e

        cc = cc.minus(aa);         // NOTE: new Money-object is created and reference to that is assigned to variable c
        //       the Money object 6.50e that variable c used to hold, is not referenced anymore

        System.out.println(aa);  // 10.00e
        System.out.println(bb);  // 3.50e
        System.out.println(cc);  // 0.00e
    }
}

