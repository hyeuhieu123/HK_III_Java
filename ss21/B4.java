package ss21;

import java.util.Scanner;

public class B4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("moi nhap");
			System.out.println("ban da nhap so " +sc.nextInt());
		} catch (NumberFormatException ex) {
			System.out.println("ban phai nhap so nguyen");

		} finally{
			sc.close();
			System.out.println("cam on da su dung ct");
		}
	}
}
