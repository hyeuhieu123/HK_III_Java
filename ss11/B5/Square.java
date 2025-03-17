package B5;

public class Square implements Colorable {
    private String color;
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    public String getColor() {
        return color;
    }

    public double getEdge() {
        return edge;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("hinh vuong mau: "+color);
    }
}
