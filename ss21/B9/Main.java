package ss21.B9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("nhap tk 1 ");
      BankAccount B1 =  new BankAccount(sc.nextLine(), Double.parseDouble(sc.nextLine()));
	  System.out.println("nhap tk 2 ");
      BankAccount B2= new BankAccount(sc.nextLine(), Double.parseDouble(sc.nextLine()));
        try {
			System.out.println("gui tien ");
            B1.Deposit(Double.parseDouble(sc.nextLine()));
			System.out.println("so tien rut ");
            B1.Withdraw(Double.parseDouble(sc.nextLine()));
			System.out.println("chuyen tk 2 ");
            B1.Transfer(B2, Double.parseDouble(sc.nextLine()));
        } catch (ValidAmount e) {
            System.out.println(e.getMessage());
        } finally{
			System.out.println(B1);
			System.out.println(B2);
		}
		
    }
}
