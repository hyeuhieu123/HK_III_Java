class Shape {
    public double area() {
        return 0;
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double area(double width, double height) {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

public class Bai4 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.printf("Diện tích hình tròn (Overriding): %.2f\n", circle.area());
        System.out.printf("Diện tích hình chữ nhật (Overriding): %.2f\n", rectangle.area());

        Shape shape = new Shape();
        System.out.printf("Diện tích hình tròn (Overloading): %.2f\n", shape.area(7));
        System.out.printf("Diện tích hình chữ nhật (Overloading): %.2f\n", shape.area(5, 8));
    }
}
