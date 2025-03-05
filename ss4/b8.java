package ss4;
import java.util.Scanner;

public class b8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            n = sc.nextInt();
            if (n > 0) {
                break;
            } else {
                System.out.println("Số nhập vào không hợp lệ. Vui lòng nhập lại!");
            }
        }
        System.out.println("Các số Armstrong từ 1 đến " + n + " là:");
        for (int i = 1; i < n; i++) {
            int original = i; // Lưu lại số ban đầu
            int count = 0, temp = original;

            // Đếm số chữ số của i (k)
            while (temp > 0) {
                count++;
                temp /= 10;
            }

            // Tính tổng lũy thừa bậc k của từng chữ số
            int sum = 0;
            temp = original;
            while (temp > 0) {
                int digit = temp % 10; // Lấy chữ số cuối
                int power = 1;

                // Tính digit^count
                for (int j = 0; j < count; j++) {
                    power *= digit;
                }

                sum += power;
                temp /= 10;
            }
            if (sum == original) {
                System.out.print(original + " ");
            }
        }
        sc.close();
    }
}