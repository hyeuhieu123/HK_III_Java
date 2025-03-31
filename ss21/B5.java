package ss21;

import java.util.Scanner;

public class B5 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			try {
				System.out.println("nhap so ");
				int n = sc.nextInt();
				if(n <=0) throw new IllegalArgumentException("ko hop le de kiem tra");
				System.out.println(isPrime(n));
			} catch (NumberFormatException e) {
				System.out.println("ko phai mot so");
			}

	}
	public static boolean isPrime(int num){
		if(num <2) return false;
		for(int i = 2;i <num;i++){
			if(num %i==0){
				return false;
			}
		}
		return true;
	}
}
