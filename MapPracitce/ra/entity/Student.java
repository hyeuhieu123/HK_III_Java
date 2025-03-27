package MapPracitce.ra.entity;

import java.util.Scanner;

public class Student {
	private String  studentId;
	private String name;
	private int age ;
	private double avg;

	public Student(){}

	public Student(String  studentId, String name, int age, double avg) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.avg = avg;
	}

	public String getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getAvg() {
		return avg;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void inputData(Scanner sc){
		System.out.println("nhap id");
		this.studentId = sc.nextLine();
		System.out.println("nhap ten");
		this.name= sc.nextLine();
		System.out.println("nhap tuoi");
		this.age=Integer.parseInt(sc.nextLine());
		System.out.println("nhap diem trung binh");
		this.avg=Double.parseDouble(sc.nextLine());
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + ", avg=" + avg + "]";
	}
	
	

}
