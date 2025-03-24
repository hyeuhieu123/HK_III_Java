import java.util.HashSet;
import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<>();
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("C++");
        languages.add("Java");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (languages.contains(input)) {
            System.out.println(input + " da ton tai");
        } else {
            System.out.println(input + " ko co");
        }

      
    }
}
