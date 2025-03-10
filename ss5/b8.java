package ss5;

import java.util.Scanner;

public class b8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Mảng không hợp lệ");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                arr[uniqueCount++] = arr[i];
            }
        }

        if (uniqueCount == 0) {
            System.out.println("Không có phần tử nào duy nhất trong mảng");
        } else {
            System.out.println("Mảng sau khi loại bỏ các phần tử trùng lặp:");
            for (int i = 0; i < uniqueCount; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}