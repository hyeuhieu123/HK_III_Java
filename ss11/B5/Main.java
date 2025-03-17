package ex5;

public class Main {
    public static void main(String[] args) {
        Colorable circle = new Circle(4);
        Colorable retangle = new Rectangle(3,4);
        Colorable square = new Square(10);

        // gan mau cho hinh va kiem tra mau
        circle.setColor("red");
        retangle.setColor("green");
        square.setColor("blue");

    }
}
