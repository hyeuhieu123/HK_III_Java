package ex5;

public class Circle implements Colorable {
    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.printf("hinh tron mau: "+color);
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
}
