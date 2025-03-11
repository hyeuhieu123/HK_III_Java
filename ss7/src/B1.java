import java.util.Scanner;

public class B1 {
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("str1: ");
            String str1 = sc.nextLine();
            System.out.print("str2: ");
            String str2 = sc.nextLine();
            System.out.print("str3: ");
            String str3 = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            sb.append(str1);
            sb.append(" ").append(str2);
            sb.append(" ").append(str3);
            System.out.println(sb.toString().toUpperCase());
        }
}