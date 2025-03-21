package ss16;

import java.util.ArrayList;
import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Danh sách để lưu các nhóm số
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        // Nhập danh sách số nguyên từ người dùng
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        System.out.println("Nhập các số nguyên:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (isPrime(num)) {
                primeNumbers.add(num); // Số nguyên tố
            } else if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }

        // Hiển thị kết quả
        System.out.println("\nSố nguyên tố: " + primeNumbers);
        System.out.println("Số chẵn (không phải số nguyên tố): " + evenNumbers);
        System.out.println("Số lẻ (không phải số nguyên tố): " + oddNumbers);

        scanner.close();
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}