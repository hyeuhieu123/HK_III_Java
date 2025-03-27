package ss18;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Employee {
    private static int autoId = 1; // Tự động tăng ID
    private int id;
    private String name;
    private double salary;

    public Employee() {}

    public Employee(String name, double salary) {
        this.id = autoId++;
        this.name = name;
        this.salary = salary;
    }

    public void inputData(Scanner sc) {
        this.id = autoId++;
        System.out.print("nhap ten ");
        this.name = sc.nextLine();

        do {
            System.out.print("nhap luong");
            this.salary = Double.parseDouble(sc.nextLine());
            if (this.salary < 0) System.out.println("nhap lai");
        } while (this.salary < 0);
    }

    public void displayInfo() {
        System.out.println("id " + id + " ten " + name +  " luong " + salary);
    }

    public int getId() { 
        return id;
    }
    public double getSalary() { 
        return salary;
     }
}

public class B10 {
    static Map<Integer, Employee> employeeMap = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("-------------------");
            System.out.println("1. them nv");
            System.out.println("2. in danh sach");
            System.out.println("3. tinh tong  ");
            System.out.println("4. luong trung binh");
            System.out.println("5. nv luong cao nhat  ");
            System.out.println("6. nv luong thap nhat");
            System.out.println("7. thoat");
        
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    TotalSalary();
                    break;
                case 4:
                    AverageSalary();
                    break;
                case 5:
                   HighestSalaryEmployee();
                    break;
                case 6:
                LowestMinSalaryEmployee();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("nhap lai");
            }
        } while (true);
    }

    private static void addEmployee() {
        Employee employee = new Employee();
        employee.inputData(sc);
        employeeMap.put(employee.getId(), employee);
    
    }

    private static void displayEmployees() {
        for (Employee employee : employeeMap.values()) {
            employee.displayInfo();
        }
    }

    private static void TotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employeeMap.values()) {
            totalSalary += employee.getSalary();
        }
        System.out.println("total " + totalSalary);
    }

    private static void AverageSalary() {
      
        double totalSalary = 0;
        for (Employee employee : employeeMap.values()) {
            totalSalary += employee.getSalary();
        }
        double avg = totalSalary / employeeMap.size();
        System.out.println("luong trung binh "+ avg);
    }

    public static void HighestSalaryEmployee() {
        Employee maxSalaryEmployee = null;
        for (Employee emp : employeeMap.values()) {
            if (  emp.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = emp;
            }
        }
        System.out.println(maxSalaryEmployee);
     
    }
    
    public static void LowestMinSalaryEmployee() {
        Employee minSalaryEmployee = null;
        for (Employee emp : employeeMap.values()) {
            if ( emp.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = emp;
            }
        }
        System.out.println(minSalaryEmployee);
        
    }
}
