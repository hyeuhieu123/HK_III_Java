package ss2;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double length = scanner.nextDouble();

        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double width = scanner.nextDouble();

        double area = calculateArea(length, width);
        double perimeter = calculatePerimeter(length, width);

        System.out.println("Diện tích của hình chữ nhật: " + area);
        System.out.println("Chu vi của hình chữ nhật: " + perimeter);
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}
