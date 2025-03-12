import java.util.Scanner;

class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private void simplify() {
        int gcdValue = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcdValue;
        denominator /= gcdValue;
        if (denominator < 0) { // Đảm bảo mẫu số luôn dương
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Không thể chia cho phân số có tử số bằng 0");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số phân số thứ nhất: ");
        int num1 = sc.nextInt();
        System.out.print("Nhập mẫu số phân số thứ nhất: ");
        int den1 = sc.nextInt();

        System.out.print("Nhập tử số phân số thứ hai: ");
        int num2 = sc.nextInt();
        System.out.print("Nhập mẫu số phân số thứ hai: ");
        int den2 = sc.nextInt();

        Fraction f1 = new Fraction(num1, den1);
        Fraction f2 = new Fraction(num2, den2);

        System.out.println("Tổng: " + f1.add(f2));
        System.out.println("Hiệu: " + f1.subtract(f2));
        System.out.println("Tích: " + f1.multiply(f2));
        System.out.println("Thương: " + f1.divide(f2));
    }
}