package ss6;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập địa chỉ email: ");
        String email = sc.nextLine().trim();
        if (email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}$")) {
            String userName = email.split("@")[0];
            String tenmien = email.split("@")[1];
            System.out.println("Ten nguoi dung: "+userName+" "+"Ten mien " + tenmien);
        } else {
            System.out.println("Email không hợp lệ.");
        }
    }
}