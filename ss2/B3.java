package ss2;

public class B3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        boolean isEqual = (x == y);
        boolean isNotEqual = (x != y);
        boolean isGreater = (x > y);
        boolean isLess = (x < y);
        boolean isGreaterOrEqual = (x >= y);
        boolean isLessOrEqual = (x <= y);

        System.out.println("x == y: " + isEqual);
        System.out.println("x != y: " + isNotEqual);
        System.out.println("x > y: " + isGreater);
        System.out.println("x < y: " + isLess);
        System.out.println("x >= y: " + isGreaterOrEqual);
        System.out.println("x <= y: " + isLessOrEqual);

        if (x > y) {
            System.out.println("x lớn hơn y");
        } else if (x == y) {
            System.out.println("x bằng y");
        } else {
            System.out.println("x nhỏ hơn y");
        }
    }
}