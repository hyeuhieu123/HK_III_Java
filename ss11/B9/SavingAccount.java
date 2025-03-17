package B9;


public class SavingAccount extends BankAccount {
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("rut" + amount + " tu " + accountNumber);
        } else {
            System.out.println("Số du khong du!");
        }
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("nap" + amount + " vao tk " + accountNumber);
    }

    @Override
    void displayBalance() {
        System.out.println("tk tiet kiem " + accountNumber + " - so du tiet kiem: " + balance);
    }
}