package ss21;

import java.util.Scanner;

public class B1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n1 =sc.nextInt();
			int n2 =sc.nextInt();
			System.out.println(n1 /n2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
