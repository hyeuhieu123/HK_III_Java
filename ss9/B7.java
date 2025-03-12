import java.util.Scanner;

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Tính biệt thức delta
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Kiểm tra phương trình có nghiệm thực hay không
    public boolean hasRealRoots() {
        return getDiscriminant() >= 0;
    }

    // Tính nghiệm thứ nhất
    public double getRoot1() {
        if (!hasRealRoots()) return Double.NaN;
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    // Tính nghiệm thứ hai
    public double getRoot2() {
        if (!hasRealRoots()) return Double.NaN;
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public void display() {
        if (!hasRealRoots()) {
            System.out.println("Phương trình không có nghiệm thực.");
        } else if (getDiscriminant() == 0) {
            System.out.printf("Phương trình có nghiệm kép: x = %.2f\n", getRoot1());
        } else {
            System.out.printf("Phương trình có hai nghiệm phân biệt: x1 = %.2f, x2 = %.2f\n", getRoot1(), getRoot2());
        }
    }

}

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        equation.display();

        sc.close();
    }
}