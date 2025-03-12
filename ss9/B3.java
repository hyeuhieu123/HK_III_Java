class Rectangle {
    private double length;
    private double width;
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
    public void display() {
        System.out.println("dai " + length);
        System.out.println("rong " + width);
        System.out.println("dien tich " + getArea());
        System.out.println("chu vi " + getPerimeter());
    }
}

public class B3 {
	public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("hcn1Param:");
        rect1.display();

        Rectangle rect2 = new Rectangle(5.0, 3.0);
        System.out.println("hcn2Param:");
        rect2.display();
    }
}
