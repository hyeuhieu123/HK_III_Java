class Employee{
	int id;
	String name;
	String department;
	double salary;

	public Employee(int id,String name,String department,double salary){
		this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
	}
	public void displayInfo() {
        System.out.println("ID: " + id + ", Tên: " + name + ", phòng ban: " + department + ", lương: " + salary);
    }
	public double getSalary() {
        return salary;
    } public void setSalary(double salary) {
        this.salary = salary;
    }public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        }
    }

}


public class B2 {
	public static void main(String[] args) {
        Employee emp = new Employee(1, "hieu", "it", 3000000);
        emp.displayInfo();
        emp.increaseSalary(10);
        System.out.println("Sau khi tăng lương:");
        emp.displayInfo();
    }
}