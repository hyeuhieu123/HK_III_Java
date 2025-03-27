package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

import entity.Student;

public class Demo {
	public static void main(String[] args) {
		Student std1= new Student(1,"a");
		Student std2= new Student(2,"b");
		Student std3= new Student(3,"c");
		Student std4= new Student(4,"d");
		Student std5= new Student(5,"e");

		List<Student> listStd = new ArrayList<>();
		listStd.add(std1);
		listStd.add(std2);
		listStd.add(std3);
		listStd.add(std4);
		listStd.add(std5);

		/*
		 * b1: collection --> stream
		 * b2: thao tac trung gian: xu ly data
		 * B3: thao tac dau cuoi: in hoac luu tru bien
		 */
		//1. in ra cac sinh vien co tuoi lon hon 20
		// listStd.stream().filter(std -> std.getId() >3).forEach(std -> System.out.println(std));

		//2. in thong tin cac sinh vien tu thu nhat den thu 3 
		// listStd.stream().skip(1).limit(3).forEach(std-> System.out.println(std.getId()));

		//3. in so tuoi cua cac sv x2
		// listStd.stream().map(std-> std.getId()*2).forEach(std-> System.out.println(std));

		//4. in thong tin sinh vien sap xep theo tuoi tang dan

		// listStd.stream().sorted(Comparator.comparing(Student::getId)).forEach(std-> System.out.println(std));

		//5. in thong tin sv theo giam dan

		listStd.stream().sorted(Comparator.comparing(Student::getId).reversed()).forEach(std -> System.out.println(std));

		//7. in thong tin sap xep theo tuoi tang dan, bang tuoi thi sap xep theo giam dan
		
		//8 llu thong tin cac sinh vien co tuoi lon hon 20 luu ra ds khac
		List<Student> list20 = listStd.stream().filter(std -> std.getId()>3).toList();
		// System.out.println("thong tin sv co tuoi trong list20 "+list20.stream.forEach(std-> System.out.println(std);

		//9 kiem tra trong listStd co sv ten la a
		System.out.println("ket qua tim sv a"+ listStd.stream().anyMatch(std-> std.getName().equals("a")));

		//10 tinh so luong sv co tuoi lon hon 20

		System.out.println("sl sv id lon hon 2 "+ listStd.stream().filter(std->std.getId() >2).count());

		//10 in ra tuoi lon nhat 

		listStd.stream().max(Comparator.comparing(Student::getId));

		//11 thong ke tuoi cac sv: min ,max,sum,avg
		IntSummaryStatistics ageStatistics= listStd.stream().mapToInt(Student::getId).summaryStatistics();
		System.out.println(ageStatistics.getAverage());
		System.out.println(ageStatistics.getMax());
		System.out.println(ageStatistics.getMin());
		System.out.println(ageStatistics.getSum());
		System.out.println(ageStatistics.getCount());

		//12 su dung reduce tinh tong tuoi sinh
		// System.out.println(:);
		
		
	}
}
