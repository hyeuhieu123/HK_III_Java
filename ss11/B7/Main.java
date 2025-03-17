package B7;


public class Main {
    public static void main(String[] args) {

        PartTimeEmployee partTimeEmp = new PartTimeEmployee("tien", 20, 5);
        System.out.println("nv part time: " + partTimeEmp.getName());
        System.out.println("luong: " + partTimeEmp.calculateSalary());

        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("tien21", 25);
        System.out.println("nv full time: " + fullTimeEmp.getName());
        System.out.println("luong: " + fullTimeEmp.calculateSalary());
    }
}