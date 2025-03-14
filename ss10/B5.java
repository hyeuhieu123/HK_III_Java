package ss10;
class Circle {
    private double radius;
    private static final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}
public class B5 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("dt hinh tron " + circle.getArea());

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("the tich hinh tru "+ cylinder.getVolume());

        
        circle.setRadius(7);
        System.out.println("dt hinh tron sau khi doi" + circle.getArea());

        cylinder.setRadius(7);
        cylinder.setHeight(15);
        System.out.println("the tich hinh tru sau khi doi" + cylinder.getVolume());
    }
}