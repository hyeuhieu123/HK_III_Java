package ss3;

import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap he so a, b, c, d: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble();

        if (a == 0) {
            // phương trình bậc 2: bx² + cx + d = 0
            if (b == 0) {
                if (c == 0) System.out.println(d == 0 ? "vo so nghiem" : "vo nghiem");
                else System.out.println("x = " + (-d / c));
            } else {
                double delta = c * c - 4 * b * d;
                if (delta > 0) System.out.println("x1 = " + (-c + Math.sqrt(delta)) / (2 * b) + 
                                                  ", x2 = " + (-c - Math.sqrt(delta)) / (2 * b));
                else if (delta == 0) System.out.println("x = " + (-c / (2 * b)));
                else System.out.println("vo nghiem");
            }
        } else {
            // phương trình bậc 3: ax³ + bx² + cx + d = 0 (dùng công thức Cardano)
            double f = ((3 * c / a) - (b * b) / (a * a)) / 3;
            double g = ((2 * Math.pow(b, 3)) / Math.pow(a, 3) - (9 * b * c) / Math.pow(a, 2) + (27 * d / a)) / 27;
            double h = (Math.pow(g, 2) / 4) + (Math.pow(f, 3) / 27);

            if (h > 0) {
                // 1 nghiệm thực, 2 nghiệm phức
                double r = -(g / 2) + Math.sqrt(h);
                double s = Math.cbrt(r);
                double t = -(g / 2) - Math.sqrt(h);
                double u = Math.cbrt(t);
                double x1 = s + u - (b / (3 * a));
                System.out.println("x = " + x1);
            } else if (f == 0 && g == 0 && h == 0) {
                // 1 nghiệm bội
                double x = -Math.cbrt(d / a);
                System.out.println("x = " + x);
            } else {
                // 3 nghiệm thực
                double i = Math.sqrt((Math.pow(g, 2) / 4) - h);
                double j = Math.cbrt(i);
                double k = Math.acos(-(g / (2 * i)));
                double m = Math.cos(k / 3);
                double n = Math.sqrt(3) * Math.sin(k / 3);
                double p = -(b / (3 * a));

                double x1 = 2 * j * m + p;
                double x2 = -j * (m + n) + p;
                double x3 = -j * (m - n) + p;
                System.out.println("x1 = " + x1 + ", x2 = " + x2 + ", x3 = " + x3);
            }
        }
        sc.close();
    }
}