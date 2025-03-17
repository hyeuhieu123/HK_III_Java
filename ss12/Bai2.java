class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum1 = calculator.add(5, 10);
        System.out.println("Tổng của 5 và 10 là: " + sum1);
        int sum2 = calculator.add(3, 7, 2);
        System.out.println("Tổng của 3, 7 và 2 là: " + sum2);
    }
}
