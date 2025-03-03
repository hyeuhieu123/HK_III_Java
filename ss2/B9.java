package ss2;

import java.util.Scanner;

public class B9{
	  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày tháng năm: ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int dayIsMonth = (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) ? 31 : (month == 2 ? (leapYear ? 29 : 28) : 30);

        day = (day == dayIsMonth) ? 1 : day + 1;
        month = (day == 1) ? (month == 12 ? 1 : month + 1) : month;
        year = (day == 1 && month == 1) ? year + 1 : year;

        System.out.println("ngày tiếp theo: " + day + "-" + month + "-" + year);
    }
}