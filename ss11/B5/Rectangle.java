package B5;


public class Rectangle implements Colorable {
    private String color;
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void setColor(String color){
        this.color = color;
        System.out.println("hcn mau: "+color);
    }
}
