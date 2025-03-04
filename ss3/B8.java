package ss3;

import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println(c == 0 ? "phuong trinh vo so nghiem." : "phuong trinh vo nghiem.");
            } else {
                System.out.println("nghiem: x = " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double sqrtDelta = Math.sqrt(delta);
                System.out.println("x1 = " + (-b + sqrtDelta) / (2 * a));
                System.out.println("x2 = " + (-b - sqrtDelta) / (2 * a));
            } else if (delta == 0) {
                System.out.println("nghiem kep: x = " + (-b / (2 * a)));
            } else {
                System.out.println("phuong trinh vo nghiem.");
            }
        }

        sc.close();
    }
}