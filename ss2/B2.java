package ss2;

public class B2 {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b;
        int remainder = a % b;

        System.out.println("Giá trị của biến a: " + a);
        System.out.println("Giá trị của biến b: " + b);
        System.out.println("Tổng của a và b: " + sum);
        System.out.println("Hiệu của a và b: " + difference);
        System.out.println("Tích của a và b: " + product);
        System.out.println("Thương của a chia cho b: " + quotient);
        System.out.println("Phần dư khi chia a cho b: " + remainder);
    }
}