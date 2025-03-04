package ss3;

import java.util.Scanner;

public class B6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap thang: ");
        int month = sc.nextInt();

        int days;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> days = 28;
            default -> {
                System.out.println("thang khong hop le.");
                return;
            }
        }

        System.out.println("thang " + month + " co " + days + " ngay.");
        sc.close();

    }
}
