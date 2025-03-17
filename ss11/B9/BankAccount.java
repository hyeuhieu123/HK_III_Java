package B9;


public abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void withdraw(double amount);
    abstract void deposit(double amount);
    abstract void displayBalance();
}
