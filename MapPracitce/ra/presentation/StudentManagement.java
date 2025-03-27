package MapPracitce.ra.presentation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import MapPracitce.ra.entity.Student;

public class StudentManagement {
	static Map<String,Student> mapStudent = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		do {
			System.out.println("1. danh sach cac sv");
			System.out.println("2. them moi sv");
			System.out.println("3. xoa sv");
			System.out.println("4. tinh diem trung binh tat ca sv");
			System.out.println("5. in thong tin sinh vien co diem trung binh lon nhat ");
			System.out.println("6. in thong tin sinh vien co tuoi nho nhat ");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
				case 1:
				printMapStudent();
					break;
				case 2 :
				addStudent(sc);
				break;
				case 3:
				deleteStudent(sc);
				break;
				case 4:
				sumAvg();
				default:
					break;
			}
		} while (true);
	}
	public static void addStudent(Scanner sc ){
			Student newStudent = new Student();
			newStudent.inputData(sc);
			String newStudentId= newStudent.getStudentId();
			mapStudent.put(newStudentId, newStudent);
			
	}
	public static void printMapStudent(){
		
		for(Map.Entry<String,Student> entry : mapStudent.entrySet()){
			System.out.println(entry.getValue());
		}
	}

	public static void deleteStudent(Scanner sc){
		System.out.println("nhap ma sv muon xoa ");
		String deleteId = sc.nextLine();
		
		mapStudent.remove(deleteId);
		System.out.println(mapStudent.remove(deleteId));

	}
	public static void sumAvg(){
		double sum=0;
		for(Map.Entry<String,Student> entry : mapStudent.entrySet()){
					sum+=entry.getValue().getAvg();
		}
		double avg = sum/mapStudent.size();
		System.out.println("dtb "+avg);
	}
	public static void highestAvgStudent(){
			List<Student> listStudent = new ArrayList<>();
			// listStudent.sort((o1, o2) ->o1.getAvg()>o2.getAvg());

		
	}



}
