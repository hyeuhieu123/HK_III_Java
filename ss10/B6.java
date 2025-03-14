package ss10;
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class MoveablePoint extends Point {
    private double xSpeed;
    private double ySpeed;

    public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    @Override
    public String toString() {
        return super.toString() + " với tốc độ (" + xSpeed + ", " + ySpeed + ")";
    }
}

public class B6 {
    public static void main(String[] args) {
        Point p1 = new Point(3.0, 4.0);
        System.out.println("Điểm: " + p1);

        MoveablePoint mp1 = new MoveablePoint(1.0, 2.0, 0.5, 0.5);
        System.out.println("Trước khi di chuyển: " + mp1);

        mp1.move();
        System.out.println("Sau khi di chuyển: " + mp1);

        mp1.setXSpeed(1.0);
        mp1.setYSpeed(1.5);
        mp1.move();
        System.out.println("Sau khi thay đổi tốc độ và di chuyển: " + mp1);
    }
}

