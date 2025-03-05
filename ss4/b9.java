package ss4;
import java.util.Scanner;
public class b9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) {
            System.exit(0);
        } else {
            System.out.println("Các số Palindrome từ 1 đến " + n + " là:");
            for (int i = 1; i <= n; i++) {
                int original = i; 
                int reversed = 0; 
                int temp = original;

               
                while (temp > 0) {
                    int digit = temp % 10;
                    reversed = reversed * 10 + digit;
                    temp /= 10;
                }
                if (original == reversed) {
                    System.out.print(original + " ");
                }
            }
        }
        sc.close();
    }
}