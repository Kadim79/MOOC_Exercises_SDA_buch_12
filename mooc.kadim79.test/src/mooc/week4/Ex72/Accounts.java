package mooc.week4.Ex72;

public class Accounts {

    private int accountBalance;
    private String accountOwner;

    public Accounts(int accountBalance, String accountOwner) {
        this.accountBalance = accountBalance;
        this.accountOwner = accountOwner;
    }

    public void depositMoney(int amount) {
        accountBalance += amount;
    }

    public void takeMoney(int amount) {
        accountBalance -= amount;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {

        return "This is the account of " + accountOwner + " and the balance is " +
                accountBalance;
    }

    public static void tranferMoney(Accounts debitAccount, Accounts creditAccount,
                                    int transferAmount) {
        debitAccount.takeMoney(transferAmount);
        System.out.println("From the " + debitAccount.accountOwner + " account was tooked " +
                transferAmount + " and transferred to " + creditAccount.accountOwner + ".");

        creditAccount.depositMoney(transferAmount);
        System.out.println("In the " + creditAccount.accountOwner + " account was trasferred " +
                transferAmount + " from the " + debitAccount.accountOwner + " acoount.");
    }
}
