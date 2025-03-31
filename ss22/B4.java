package ss22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 class Student implements Serializable {
	private String name;
	private int age;
	private double score;
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
}
public class B4 {
	public static void main(String[] args) {
			Student std1= new Student("hieu", 20, 10);
			Student std2= new Student("hieu", 20, 10);
			try {
				FileOutputStream fos = new FileOutputStream("student.dat");
				ObjectOutputStream ooj = new ObjectOutputStream(fos);
				ooj.writeObject(std1);
				ooj.writeObject(std2);
				System.out.println("da ghi vao file ");
				FileInputStream fis = new FileInputStream("student.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
				System.out.println("da doc file ");

				Student count;

				System.out.println(ois.readObject());
				System.out.println(ois.readObject());
				System.out.println(ois.readObject());
			



			} catch (Exception e) {
				// TODO: handle exception
			}

	}
}
