import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("str: ");
        String str = sc.nextLine().trim();
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0 ; i--) {
            result.append(words[i]).append(" ");
        }
        System.out.println("result \n" + result.toString().trim());
        sc.close();
    }
}