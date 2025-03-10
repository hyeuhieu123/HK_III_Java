package ss5;

import java.util.Scanner;

public class B10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Mảng không hợp lệ");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0, end = 0, tempStart = 0;
        int allNegative = 1; // Giả sử tất cả phần tử đều âm

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                allNegative = 0; // Nếu có số không âm, cập nhật
            }

            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart; // Cập nhật vị trí bắt đầu dãy con tốt nhất
                end = i;           // Cập nhật vị trí kết thúc dãy con tốt nhất
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1; // Bắt đầu dãy con mới từ vị trí tiếp theo
            }
        }

        // Nếu tất cả số trong mảng là âm, tìm số lớn nhất
        if (allNegative == 1) {
            maxSum = arr[0];
            start = end = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] > maxSum) {
                    maxSum = arr[i];
                    start = end = i;
                }
            }
        }

        // In kết quả
        System.out.println("Tổng lớn nhất: " + maxSum);
        System.out.print("Dãy con có tổng lớn nhất: [");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}
