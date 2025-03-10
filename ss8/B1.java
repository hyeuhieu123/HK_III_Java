package ss8;

import java.util.Scanner;

public class B1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        if(n < 0){
            System.out.println("Kích thước không hợp lệ");
            return;
        }

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("num[%d] = ", i);
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        System.out.println("Danh sách các phần tử trong mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("num[%d] = %d\n", i, numbers[i]);
            if(max < numbers[i]){
                max = numbers[i];
            }
            if(min > numbers[i]){
                min = numbers[i];
            }
        }

        System.out.println("Số lớn nhất trong mảng là: " + max);
        System.out.println("Số nhỏ nhất trong mảng là: " + min);
    }
}