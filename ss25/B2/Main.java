package ss25.B2;

import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		// dung factory khi chua biet chinh xac doi tuong can tao(de lop con quyet dinh)
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap cho hoac meo");
		Animal animal = AnimalFactory.getAnimal(sc.nextLine());
		animal.speak();
	
	}
}
