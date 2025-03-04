package ss3;

import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so (100-999): ");
        int num = sc.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("so nhap vao khong hop le.");
            return;
        }

        int hundreds = num / 100, tens = (num / 10) % 10, units = num % 10;
        String[] numWords = {"", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"};

        System.out.print(numWords[hundreds] + " tram ");
        if (tens == 0 && units != 0) System.out.print("le ");
        else if (tens == 1) System.out.print("muoi ");
        else if (tens > 1) System.out.print(numWords[tens] + " muoi ");

        if (units != 0) System.out.print(numWords[units]);

        System.out.println();
        sc.close();
    }
}