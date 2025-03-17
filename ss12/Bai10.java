abstract class PaymentMethod {
    double amount;

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract double calculateFee();
    public abstract double processPayment(double amount);
    public abstract void processPayment(double amount, String currency);
}

class CreditCard extends PaymentMethod {
    public CreditCard(double amount) {
        super(amount);
    }

    @Override
    public double calculateFee() {
        return amount * 0.02;
    }

    @Override
    public double processPayment(double amount) {
        double total = amount + calculateFee();
        setAmount(total);
        return total;
    }

    @Override
    public void processPayment(double amount, String currency) {
        double total = processPayment(amount);
        System.out.println("processed payment of " + amount + " " + currency + " with total: " + total + " " + currency);
    }
}

class DebitCard extends PaymentMethod {
    public DebitCard(double amount) {
        super(amount);
    }

    @Override
    public double calculateFee() {
        return amount * 0.01;
    }

    @Override
    public double processPayment(double amount) {
        double total = amount + calculateFee();
        setAmount(total);
        return total;
    }

    @Override
    public void processPayment(double amount, String currency) {
        double total = processPayment(amount);
        System.out.println("processed payment of " + amount + " " + currency + " with total: " + total + " " + currency);
    }
}

class Cash extends PaymentMethod {
    public Cash(double amount) {
        super(amount);
    }

    @Override
    public double calculateFee() {
        return 0;
    }

    @Override
    public double processPayment(double amount) {
        double total = amount + calculateFee();
        setAmount(total);
        return total;
    }

    @Override
    public void processPayment(double amount, String currency) {
        double total = processPayment(amount);
        System.out.println("processed payment of " + amount + " " + currency + " with total: " + total + " " + currency);
    }
}

public class Bai10 {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard(1000);
        System.out.println("--- Credit Card ---");
        double totalCredit = creditCard.processPayment(1000);
        System.out.println("Total Payment (Credit Card): " + totalCredit);
        creditCard.processPayment(1000, "USD");
        System.out.println("----------------------------");

        PaymentMethod debitCard = new DebitCard(1000);
        System.out.println("--- Debit Card ---");
        double totalDebit = debitCard.processPayment(1000);
        System.out.println("Total Payment (Debit Card): " + totalDebit);
        debitCard.processPayment(1000, "EUR");
        System.out.println("----------------------------");

        PaymentMethod cash = new Cash(1000);
        System.out.println("--- Cash ---");
        double totalCash = cash.processPayment(1000);
        System.out.println("Total Payment (Cash): " + totalCash);
        cash.processPayment(1000, "JPY");
        System.out.println("----------------------------");
    }
}