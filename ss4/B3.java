package ss4;

import java.util.Scanner;

public class B3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();
		if(n<1) System.out.println("ko hop le");
		for(int i=1;i<=10;i++){
			System.out.println(n +" x " + i + " = " + n*i);
		}
	}
}
