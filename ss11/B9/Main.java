package B9;


public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingAccount saving = new SavingAccount("tietkiem1", 1000.0);
        CheckingAccount checking = new CheckingAccount("kiemtra1", 500.0);

        bank.addAccount(saving);
        bank.addAccount(checking);

        System.out.println("tienhanh giao dich:");
        saving.deposit(500.0);
        saving.withdraw(200.0);

        checking.deposit(300.0);

        System.out.println("\nhien thi so du hien tai:");
        bank.displayAllBalances();
    }
}