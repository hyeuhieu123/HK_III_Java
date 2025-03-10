package ss6;

import java.util.Scanner;

public class B6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        String specialChars = "!@#$%^&*()~";
        if (password.length() < 8) {
            System.out.println("Mat khau khong hop le");
            return;
        }
        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;
        int countSpecial = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                countUpper++;
            } else if (Character.isLowerCase(ch)) {
                countLower++;
            } else if (Character.isDigit(ch)) {
                countDigit++;
            } else if (specialChars.contains(String.valueOf(ch))) {
                countSpecial++;
            }
        }
        if (countUpper > 0 && countLower > 0 && countDigit > 0 && countSpecial > 0) {
            System.out.println("Mat khau hop le");
        } else {
            System.out.println("Mat khau khong hop le");
        }
    }
}