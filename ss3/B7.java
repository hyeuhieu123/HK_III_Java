package ss3;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap 3 canh tam giac: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("ba canh khong tao thanh tam giac.");
        } else if (a == b && b == c) {
            System.out.println("tam giac deu.");
        } else if (a == b || a == c || b == c) {
            System.out.println("tam giac can.");
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            System.out.println("tam giac vuong.");
        } else {
            System.out.println("tam giac thuong.");
        }

        sc.close();
    }
}
