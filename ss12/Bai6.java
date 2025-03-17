class Employee {
    protected String name;
    protected int age;
    protected double basicSalary;

    public Employee(String name, int age, double basicSalary) {
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public void showInfo() {
        System.out.println("Tên: " + name + ", Tuổi: " + age + ", Lương cơ bản: " + String.format("%.2f", basicSalary));
    }
}

class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String name, int age, double basicSalary, double bonus) {
        super(name, age, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Thưởng: " + String.format("%.2f", bonus) + ", Tổng lương: " + String.format("%.2f", calculateSalary()));
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;

    public PartTimeEmployee(String name, int age, double basicSalary, int hoursWorked) {
        super(name, age, basicSalary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return basicSalary * hoursWorked;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Số giờ làm: " + hoursWorked + ", Tổng lương: " + String.format("%.2f", calculateSalary()));
    }
}

class Intern extends Employee {
    public Intern(String name, int age, double basicSalary) {
        super(name, age, basicSalary);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Thực tập sinh không có thưởng hoặc tính lương theo giờ.");
    }
}


public class Bai6 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new FullTimeEmployee("Nguyễn Văn A", 30, 1000, 200);
        employees[1] = new PartTimeEmployee("Trần Thị B", 25, 10, 50);
        employees[2] = new Intern("Lê Văn C", 22, 500);

        for (int i = 0; i < employees.length; i++) {
            employees[i].showInfo();
            System.out.println("-------------------------");
        }
    }
}
