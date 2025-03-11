import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("str ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
        sc.close();
    }
}