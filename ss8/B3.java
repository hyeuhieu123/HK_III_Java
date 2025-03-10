package ss8;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class B3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Nhập vào 1 email: ");
            String email = sc.nextLine();

            System.out.println("Nhap vào mật khẩu: ");
            String password = sc.nextLine();

            String regexEmail = "^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-zA-Z0-9.-]+\\.(com|vn|org)$";
            String regexPassword = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%!&*]).{8,}$";

            Pattern patternEmail = Pattern.compile(regexEmail);
            Matcher matcherEmail = patternEmail.matcher(email);

            Pattern patternPassword = Pattern.compile(regexPassword);
            Matcher matcherPassword = patternPassword.matcher(password);

            if(matcherEmail.matches() && matcherPassword.matches()){
                System.out.println("Email và mật khẩu hợp lệ");
                break;
            } else if (matcherEmail.matches() == false && matcherPassword.matches()) {
                System.out.println("Email khong hop lệ. Vui lòng nhập lại");
            }else{
                System.out.println("Mật khẩu không hợp lệ. Vui lòng nhập lại");
            }
        }
    }
}