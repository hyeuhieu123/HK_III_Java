package B4;

public class Circle implements Shape{
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double area(){
        double result = radius * radius * Math.PI;
        System.out.println("dien tich hinh tron "+ result);
        return result;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        circle.area();
        Shape.description();
    }
}
