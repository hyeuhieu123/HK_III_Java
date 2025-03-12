import java.util.Scanner;
class Circle  {
    private double radius;
    private double PI = Math.PI;
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * PI * radius;
    }
    public void display() {
        System.out.printf("Bán kính: %.2f\n", radius);
        System.out.printf("Diện tích: %.2f\n", getArea());
        System.out.printf("Chu vi: %.2f\n", getCircumference());
    }
}

public class B4 {
	 public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Hình tròn 1 (mặc định):");
        circle1.display();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập bán kính cho hình tròn 2: ");
        double radius = sc.nextDouble();

        Circle circle2 = new Circle(radius);
        System.out.println("\nHình tròn 2 (tham số):");
        circle2.display();

        sc.close();
    }
}
