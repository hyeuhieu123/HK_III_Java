package ex9;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("rut tien vang lai" + amount + " tu tk" + accountNumber);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("nap tien vang lai" + amount + " vao tk " + accountNumber);
    }

    @Override
    void displayBalance() {
        System.out.println("tk vang lai " + accountNumber + " - so du" + balance);
    }
}