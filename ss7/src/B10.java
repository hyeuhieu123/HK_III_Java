import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Hello World");
        while (true) {
            System.out.println("1. Đảo ngược");
            System.out.println("2. Chèn chuỗi");
            System.out.println("3. Xóa đoạn");
            System.out.println("4. Thay thế");
            System.out.println("5. Chuyển đổi chữ hoa/thường");
            System.out.println("6. Thoát");
            int c = sc.nextInt();
            sc.nextLine();
            if (c == 1) sb.reverse();
            else if (c == 2) {
                System.out.print("Nhập chuỗi: ");
                String sub = sc.nextLine();
                System.out.print("Nhập vị trí: ");
                int pos = sc.nextInt();
                sb.insert(pos, sub);
            } else if (c == 3) {
                System.out.print("Nhập bắt đầu: ");
                int start = sc.nextInt();
                System.out.print("Nhập kết thúc: ");
                int end = sc.nextInt();
                sb.delete(start, end);
            } else if (c == 4) {
                System.out.print("Nhập bắt đầu: ");
                int start = sc.nextInt();
                System.out.print("Nhập kết thúc: ");
                int end = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập chuỗi thay thế: ");
                String rep = sc.nextLine();
                sb.replace(start, end, rep);
            } else if (c == 5) {
                System.out.println("1. Chữ hoa\n2. Chữ thường");
                int t = sc.nextInt();
                sb = new StringBuilder(t == 1 ? sb.toString().toUpperCase() : sb.toString().toLowerCase());
            } else if (c == 6) {
                System.out.println("Thoát chương trình. Tạm biệt!");
                break;
            }
            System.out.println("Chuỗi hiện tại: " + sb);
        }
    }
}
