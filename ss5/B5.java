package ss5;

import java.util.Scanner;

public class B5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Số phần tử ko hợp lệ");
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] > 0) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
                flag = true;
            }
        }
        if (flag) {
            System.out.println("phần tử lẻ nguyên dương lớn nhẩt: " + max + " phần tử lẻ nguyên dương nhỏ nhẩt: " + min);
        } else {
            System.out.println("không có phần tử lẻ trong mảng");
        }
    }
}