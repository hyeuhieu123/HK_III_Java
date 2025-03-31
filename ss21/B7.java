package ss21;

import java.util.Scanner;

class CustomerException extends Exception {
    public CustomerException(String message) { 
        super(message);
    }
}

public class B7 {
    public static void main(String[] args) throws CustomerException {
        double balance = 1000000;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien can rut");

		try{
			double amount = Double.parseDouble(sc.nextLine());
			if(balance - amount <50000){
				throw new CustomerException("ko duoc rut nho hon 50000");
			}
			if(amount > balance){
				throw new CustomerException("so tien vuot qua so du");
			}
				System.out.println(balance - amount);
		}catch(NumberFormatException ex ){
				System.out.println("nhap so hop le ");
				throw new CustomerException("so tien vuot qua so du");
		}

		catch(Exception ex){
			ex.printStackTrace();
		}

    
    }
}
