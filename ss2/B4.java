package ss2;

public class B4 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        if (a && b) {
            System.out.println("Cả hai đều đúng");
        } else if (a || b) {
            System.out.println("Ít nhất một đúng");
        } else if (!a && b) {
            System.out.println("Không đúng");
        }

        System.out.println("Giá trị của c trước khi đảo ngược: " + c);
        c = !c;
        System.out.println("Giá trị của c sau khi đảo ngược: " + c);

        // Kiểm tra phức tạp hơn
        if ((a && !b) || (c && a)) {
            System.out.println("Điều kiện phức tạp đúng");
        } else {
            System.out.println("Điều kiện phức tạp sai");
        }
    }
}
