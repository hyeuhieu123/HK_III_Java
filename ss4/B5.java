package ss4;

import java.util.Scanner;

public class B5 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Không có số hoàn hảo nào nhỏ hơn " + n);
        } else {
            System.out.println("Các số hoàn hảo nhỏ hơn " + n + " là:");
        }
        boolean check = false;
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.print(i + " ");
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không có số hoàn hảo nào nhỏ hơn " + n);
        }
        sc.close();
    }
}