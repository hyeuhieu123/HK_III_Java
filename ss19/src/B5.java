import java.util.Scanner;
import java.util.function.Predicate;
public class B5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n");
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        Predicate<String> condition = s -> s.charAt(0)== 'A'  && s.length() >= 5;
        int count = 0;
        for (String str : arr) {
            if (condition.test(str)) {
                count++;
            }
        }
        System.out.println(count);

    }
}