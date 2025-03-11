import java.util.Random;
import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 1; i <= n; i++) {
            int type = random.nextInt(3);
            char ch;
            if (type == 0) {
                ch = (char) ('A' + random.nextInt(26));
            } else if (type == 1) {
                ch = (char) ('a' + random.nextInt(26));
            } else {
                ch = (char) ('0' + random.nextInt(10));
            }
            result.append(ch);
        }
        System.out.println(result);
    }
}
