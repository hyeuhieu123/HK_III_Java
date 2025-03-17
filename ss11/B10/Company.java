package B10;


public class Company {
    private Employee[] employees;
    private int index;
    private static final int MAX = 3;

    public Company() {
        employees = new Employee[MAX];
        index = 0;
    }

    public void addEmployee(Employee employee) {
        if (index < MAX) {
            employees[index] = employee;
            index++;
        }
    }

    public void manageEmployees() {
        for (int i = 0; i < index; i++) {
            System.out.println("Nha vien " + (i + 1) + ":");
            System.out.println(employees[i].work());
            System.out.println(employees[i].takeVacation());
            if (employees[i] instanceof AttendMeeting) {
                System.out.println(((AttendMeeting)employees[i]).attendMeeting());
            }
            System.out.println("----------------");
        }
    }
}