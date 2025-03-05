package ss4;
import java.util.Scanner;
public class b7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int slow = i, fast = i;
            do {
                int sum1 = 0, temp = slow;
                while (temp > 0) {
                    int digit = temp % 10;
                    sum1 += digit * digit;
                    temp /= 10;
                }
                slow = sum1;

                int sum2 = 0;
                temp = fast;
                while (temp > 0) {
                    int digit = temp % 10;
                    sum2 += digit * digit;
                    temp /= 10;
                }
                fast = sum2;

                sum2 = 0;
                temp = fast;
                while (temp > 0) {
                    int digit = temp % 10;
                    sum2 += digit * digit;
                    temp /= 10;
                }
                fast = sum2;

            } while (fast != 1 && slow != fast);
            if (fast == 1) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}