package ss10.inheritance;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private String address;
	private boolean sex;

	public  Person(){};

	public Person(String name, int age, String address, boolean sex) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.sex = sex;
	};
	

	public void inputData(Scanner sc){
		System.out.println("nhap vao ten");
		this.name = sc.nextLine();
		System.out.println("nhap vao tuoi");
		this.age = Integer.parseInt(sc.nextLine());
		System.out.println("nhap vao dia chi");
		this.sex= Boolean.parseBoolean(sc.nextLine());

	}
	public void displayData(){
		
	}

}
