package ss21;

import java.util.Scanner;

class InvalidPhoneNumberLengthException extends Exception {
	public InvalidPhoneNumberLengthException(String message){
		super(message);
		
	}
	
	public static  void validatePhoneNumber(String phone) throws InvalidPhoneNumberLengthException{
				if(phone.length() <10){
					throw new InvalidPhoneNumberLengthException(phone +" phai dung 10 so");
				}
				// try {
				// 	int demo = Integer.parseInt(phone);
				// } catch (NumberFormatException e) {
				// 		throw new InvalidPhoneNumberLengthException(phone +" so dien thoai ko hop le");
				// }

	}
}

class B8{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String[] arr = sc.nextLine().split(",");

			for(String phone : arr){
				try {
					InvalidPhoneNumberLengthException.validatePhoneNumber(phone);
					System.out.println(phone + " hop le ");
				} catch (InvalidPhoneNumberLengthException ex) {
					System.out.println(ex.getMessage());;
				}
			}
	}
}