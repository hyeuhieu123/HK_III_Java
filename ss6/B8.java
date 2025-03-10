package ss6;

import java.util.regex.Pattern;

public class B8 {
	public static void main(String[] args) {
        String[] phoneNumbers = {"0987654321", "0123.456.789", "+84987654321", "123456", "090-123-4567"};
        String regex = "^(0[0-9]{9}|\\+84[0-9]{9})$";
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Danh sách số điện thoại hợp lệ:");
        for (String phone : phoneNumbers) {
            String normalizedPhone = phone.replaceAll("[^0-9+]", "");
            if (pattern.matcher(normalizedPhone).matches()) {
                if (normalizedPhone.charAt(0) == '0') {
                    String finalPhone = "+84" + normalizedPhone.substring(1);
                    System.out.println(finalPhone);
                }
            }
        }
    }
}