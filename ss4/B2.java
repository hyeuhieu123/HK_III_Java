package ss4;

import java.util.Scanner;

public class B2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n < 2) {
            System.out.println("ko phai snt");
            return; 
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break; 
            }
        }

        if (isPrime) {
            System.out.println("day la snt");
        } else {
            System.out.println("ko phai snt");
        }
		sc.close();
    }
}