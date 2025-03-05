package ss4;
import java.util.Scanner;
public class B10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        do {
            System.out.println("========MENU========");
            System.out.println("1. Kiểm tra một số có phải là số nguyên tố không.");
            System.out.println("2. Kiểm tra một số có phải là số hoàn hảo không.");
            System.out.println("3. Tìm và tính tổng tất cả các ước của một số.");
            System.out.println("4. Thoát chương trình.");
            System.out.println("Nhập lựa chon: ");
            int choice = sc.nextInt();
            int n;
            switch (choice) {
                case 1:
                    System.out.println("Nhập số cần kiểm tra:");
                    n = sc.nextInt();
                    if (n < 2) {
                        System.out.println("Không phải số nguyên tố");
                    } else {
                        boolean check = false;
                        for (int i = 2; i <= Math.sqrt(n); i++) {
                            if (n % i == 0) {
                                check = true;
                                break;
                            }
                        }
                        if (check) {
                            System.out.println(n + " không phải là số nguyên tố");
                        } else {
                            System.out.println(n + " là số nguyên tố");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhập số cần kiểm tra:");
                    n = sc.nextInt();
                    int sum = 0;
                    for (int i = 1; i < n; i++) {
                        if (n % i == 0) {
                            sum += i;
                        }
                    }
                    if (sum == n) {
                        System.out.println(n + " là số hoàn hảo");
                    } else {
                        System.out.println(n + " không phải là số hoàn hảo");
                    }
                    break;
                case 3:
                    System.out.println("Nhập n: ");
                    n = sc.nextInt();
                    int sumDivisors = 0;
                    System.out.print("Các ước của " + n + " là: ");
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0) {
                            System.out.print(i + " ");
                            sumDivisors += i;
                        }
                    }
                    System.out.println("\nTổng các ước của " + n + " là: " + sumDivisors);
                    break;
                case 4:
                    System.out.println("Đã thoát chương trình");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập số từ 1 đến 4");
            }
        } while (true);
    }
}