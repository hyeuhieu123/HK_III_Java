package ss10;
 class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double incrementSalary(double amount) {
        return this.salary + amount;
    }

    public String toString() {
        return "Id: " + this.id + "\nName: " + this.name + "\nSalary: " + this.salary;
    }
}

 class Manager extends Employee {
    private double bonus;

    public Manager(int id, String name, double salary) {
        super(id, name, salary);
    }

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return super.toString() + " \nManager (bonus): " + this.bonus;
    }
}
class Developer extends Employee {
    private String programmingLanguage;

    public Developer() {
        super();
        this.programmingLanguage = "Unknown";
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    public Developer(int id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNgôn ngữ lập trình: " + this.programmingLanguage;
    }
}
public class B9 {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "hieu", 5000000);
        Manager manager = new Manager(2, "trung", 10000000, 2000000);
        Developer developer = new Developer(3, "nguyen", 4000000, "ReactJS");

        System.out.println("Thông tin chi tiết về nhân viên:");
        System.out.println(emp.toString());
        System.out.println(manager.toString());
        System.out.println(developer.toString());

        emp.setSalary(emp.incrementSalary(2000000));
        System.out.println("Thông tin nhân viên sau khi tăng lương:");
        System.out.println(emp.toString());
    }
}