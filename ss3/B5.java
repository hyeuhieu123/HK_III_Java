package ss3;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so thu 1: ");
        double num1 = sc.nextDouble();
        System.out.print("nhap phep toan (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.print("nhap so thu 2: ");
        double num2 = sc.nextDouble();

        switch (op) {
            case '+':
                System.out.println("ket qua: " + (num1 + num2));
                break;
            case '-':
                System.out.println("ket qua: " + (num1 - num2));
                break;
            case '*':
                System.out.println("ket qua: " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) System.out.println("khong the chia cho 0.");
                else System.out.println("ket qua: " + (num1 / num2));
                break;
            default:
                System.out.println("phep toan khong hop le.");
        }
        sc.close();
    }
}