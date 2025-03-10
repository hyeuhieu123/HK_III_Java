package ss5;

import java.util.Scanner;

public class B7 {
	  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Mảng không có phần tử");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sortedArr = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sortedArr[index++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                sortedArr[index++] = arr[i];
            }
        }

        // In kết quả
        for (int i = 0; i < n; i++) {
            System.out.print(sortedArr[i] + " ");
        }

        sc.close();
    }
}
