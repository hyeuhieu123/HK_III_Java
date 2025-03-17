package ss10.inheritance;

public class Student extends Person {
	/// cac feilds rieng 
	private String studentId;
	private float avfGrade;
	// cac construcor rieng 
	public Student(){}
	public Student(String name, int age, String address, boolean sex, String studentId, float avfGrade) {
		super(name, age, address, sex);
		this.studentId = studentId;
	
		this.avfGrade = avfGrade;
		
	}

	 
	

	
}
