import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp tiền thành công. Số dư hiện tại: " + balance);
        } else {
            System.out.println("Số tiền nạp không hợp lệ!");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Số dư không đủ!");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Rút tiền thành công. Số dư hiện tại: " + balance);
        } else {
            System.out.println("Số tiền rút không hợp lệ!");
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        if (amount > balance) {
            System.out.println("Số dư không đủ để chuyển!");
        } else if (amount > 0) {
            balance -= amount;
            recipient.balance += amount;
            System.out.println("Chuyển tiền thành công. Số dư hiện tại: " + balance);
        } else {
            System.out.println("Số tiền chuyển không hợp lệ!");
        }
    }

    public void display() {
        System.out.println("Số tài khoản: " + accountNumber);
        System.out.println("Chủ tài khoản: " + accountHolder);
        System.out.println("Số dư: " + balance);
    }
}

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc1 = new BankAccount("123456", "Nguyen Van A", 10000);
        BankAccount acc2 = new BankAccount("789012", "Tran Van B", 5000);

        System.out.println("Thông tin tài khoản ban đầu:");
        acc1.display();
        acc2.display();

        System.out.println("\nNhập số tiền muốn nạp vào tài khoản 1: ");
        double depositAmount = sc.nextDouble();
        acc1.deposit(depositAmount);
        acc1.display();

        System.out.println("\nNhập số tiền muốn rút từ tài khoản 2: ");
        double withdrawAmount = sc.nextDouble();
        acc2.withdraw(withdrawAmount);
        acc2.display();

        System.out.println("\nNhập số tiền muốn chuyển từ tài khoản 1 sang tài khoản 2: ");
        double transferAmount = sc.nextDouble();
        acc1.transfer(acc2, transferAmount);
        acc1.display();
        acc2.display();

        sc.close();
    }
}