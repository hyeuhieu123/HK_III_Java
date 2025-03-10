package ss8;

import java.util.Scanner;

public class B2 {
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

        int sum = 0;
        int count = 0;

        System.out.println("Danh sách các phần tử trong mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("num[%d] = %d\n", i, numbers[i]);
            if(numbers[i] % 3 == 0){
                sum += numbers[i];
                count++;
            }
        }

        if(count == 0){
            System.out.println("Không có số nào chia hết cho 3");
        }else{
            System.out.println("Tổng các phần tử chia hết cho 3 trong mảng là: " + sum);
        }
    }
}