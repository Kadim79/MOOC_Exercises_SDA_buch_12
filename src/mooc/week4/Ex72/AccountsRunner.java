package mooc.week4.Ex72;

//Exercise 72.1: Your first account
//Note: there is a different exercise template for each of the sub-exercises. For this
//exercise use the template 072.1
//Create a program that creates an account with the balance of 100.0, deposits 20.0 and
//prints the account. Note! do all the steps described in the exercise exactly in the
//described order!

public class AccountsRunner {

    public static void main(String[] args) {

        Accounts myFirstAccount = new Accounts(100, "Catalin_Dimu");
        System.out.println(myFirstAccount);
        myFirstAccount.depositMoney(20);
        System.out.println(myFirstAccount);
        System.out.println();

        myFirstAccount.setAccountBalance(0);

        Accounts MattAccount = new Accounts(1000, "Matt");
        System.out.println(MattAccount);
        Accounts TimAccount = new Accounts(0, "Tim");
        System.out.println(TimAccount);
        System.out.println();

        Accounts.tranferMoney(MattAccount, myFirstAccount, 100);
        System.out.println(MattAccount);
        System.out.println(myFirstAccount);
        System.out.println();

        Accounts.tranferMoney(MattAccount, TimAccount, 100);
        System.out.println(MattAccount);
        System.out.println(TimAccount);
    }

}
