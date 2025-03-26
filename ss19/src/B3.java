import java.util.Scanner;

class MathOperations {
    static int add(int a, int b) {
        return a + b;
    }
    static int subtract(int a, int b) {
        return a - b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
    static int divide(int a, int b) {
        return a / b;
    }
}
public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so b");
        int b = Integer.parseInt(sc.nextLine());

        System.out.println("a+b = "+MathOperations.add(a,b));
        System.out.println("a-b = "+MathOperations.subtract(a,b));
        System.out.println("a*b = "+MathOperations.multiply(a,b));
        System.out.println("a/b = "+MathOperations.divide(a,b));
    }
}
