package ss5;

import java.util.Scanner;

public class b9 {
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= 0; j--) {
                System.out.printf(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
