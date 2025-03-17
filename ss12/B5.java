package ss12;
class ShapeBai5 {
    public double area() {
        return 0.0;
    }
}

class CircleBai5 extends Shape {
    private double radius;

    public CircleBai5(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class RectangleBai5 extends Shape {
    private double width, height;

    public RectangleBai5(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

public class B5 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3);

        for (int i = 0; i < shapes.length; i++) {
            double area = shapes[i].area();
            System.out.println("Diện tích: " + String.format("%.2f", area));
        }
    }
}
