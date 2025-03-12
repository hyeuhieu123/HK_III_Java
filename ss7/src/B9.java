import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("str: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        int count = 1;


        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        
        System.out.println("nen: " + sb);
        /// đếm phần tử trước đó str.charat(i) == str.charat(i-1) ==> ++
        /// nếu ko bằng thì in char(i-1) kèm theo count 
    }
}