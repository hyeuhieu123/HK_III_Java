import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        String sb = new StringBuilder(str).reverse().toString();
        if (str.equals(sb)) {
            System.out.println("dx");
        } else {
            System.out.println("ko dx");
        }
        sc.close();
    }
}
