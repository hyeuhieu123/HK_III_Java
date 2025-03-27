package ss19;

import java.util.List;

class Employee {
        private String name;
        private int age;
        private String department;
        private int salary;
        public Employee() {
        }
        public Employee(String name, int age, String department, int salary) {
            this.name = name;
            this.age = age;
            this.department = department;
            this.salary = salary;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public String getDepartment() {
            return department;
        }
        public int getSalary() {
            return salary;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setDepartment(String department) {
            this.department = department;
        }
        public void setSalary(int salary) {
            this.salary = salary;
        }
        @Override
        public String toString() {
            return "Employee [name=" + name + ", age=" + age + ", department=" + department + ", salary=" + salary
                    + "]";
        }
      

       
       

        
    
}
public class B7 {
public static void main(String[] args) {
    List<Employee> employees = List.of(

            new Employee("Quý", 26, "IT", 2500),

            new Employee("Lan", 24, "IT", 2100),

            new Employee("Minh", 30, "HR", 3000),

            new Employee("Huyền", 28, "IT", 2000),

            new Employee("Long", 32, "IT", 3100),

            new Employee("Trang", 25, "Marketing", 2200),

            new Employee("Việt", 27, "IT", 2500)

        );

        employees.stream().filter(e -> e.getSalary() >2000 && e.getAge() >25 && e.getDepartment().equals("IT")).sorted((o1, o2) -> o2.getSalary() -o1.getSalary()).forEach(e -> System.out.println(e));
}
    
}
