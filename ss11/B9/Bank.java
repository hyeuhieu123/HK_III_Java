package B9;

public class Bank {
    private BankAccount[] accounts;
    private int index;
    private static final int MAX = 10;

    public Bank() {
        accounts = new BankAccount[MAX];
        index = 0;
    }

    public void addAccount(BankAccount account) {
        if (index < MAX) {
            accounts[index] = account;
            index++;
        }
    }

    public void displayAllBalances() {
        for (int i = 0; i < index; i++) {
            accounts[i].displayBalance();
        }
    }
}