package ss16;
import java.util.*;
public class B10 {
    class Student {
        private String id;
        private String name;
        private double gpa;

        // Constructor
        public Student(String id, String name, double gpa) {
            this.id = id;
            this.name = name;
            this.gpa = gpa;
        }

        // Getter methods
        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getGpa() {
            return gpa;
        }

        // Xác định loại sinh viên theo GPA
        public String getClassification() {
            if (gpa >= 8.5) {
                return "Xuất sắc";
            } else if (gpa >= 7.0) {
                return "Giỏi";
            } else if (gpa >= 5.5) {
                return "Khá";
            } else {
                return "Trung bình/Yếu";
            }
        }

        // Hiển thị thông tin sinh viên
        public void display() {
            System.out.printf("%-10s %-20s %-5.2f %-15s\n", id, name, gpa, getClassification());
        }
    }

    public class StudentManagement {
        private ArrayList<Student> students = new ArrayList<>();
        private Scanner scanner = new Scanner(System.in);

        // Nhập danh sách sinh viên
        public void inputStudents() {
            System.out.print("Nhập số lượng sinh viên: ");
            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
                System.out.print("Mã sinh viên: ");
                String id = scanner.nextLine();
                System.out.print("Họ và tên: ");
                String name = scanner.nextLine();
                System.out.print("Điểm trung bình: ");
                double gpa = Double.parseDouble(scanner.nextLine());

                students.add(new Student(id, name, gpa));
            }
        }

        // Hiển thị danh sách sinh viên
        public void displayStudents() {
            if (students.isEmpty()) {
                System.out.println("Danh sách sinh viên trống.");
                return;
            }

            System.out.println("\nDanh sách sinh viên:");
            System.out.printf("%-10s %-20s %-5s %-15s\n", "ID", "Họ và Tên", "GPA", "Xếp loại");
            for (Student student : students) {
                student.display();
            }
        }

        // Tìm kiếm sinh viên theo tên
        public void searchStudentByName() {
            System.out.print("Nhập tên sinh viên cần tìm: ");
            String searchName = scanner.nextLine().toLowerCase();
            boolean found = false;

            System.out.println("\nKết quả tìm kiếm:");
            for (Student student : students) {
                if (student.getName().toLowerCase().contains(searchName)) {
                    student.display();
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Không tìm thấy sinh viên có tên: " + searchName);
            }
        }

        // Phân loại sinh viên theo GPA và hiển thị
        public void classifyAndDisplay() {
            if (students.isEmpty()) {
                System.out.println("Danh sách sinh viên trống.");
                return;
            }

            System.out.println("\nDanh sách sinh viên sau khi phân loại:");
            System.out.printf("%-10s %-20s %-5s %-15s\n", "ID", "Họ và Tên", "GPA", "Xếp loại");

            // Hiển thị theo từng nhóm
            for (String type : Arrays.asList("Xuất sắc", "Giỏi", "Khá", "Trung bình/Yếu")) {
                for (Student student : students) {
                    if (student.getClassification().equals(type)) {
                        student.display();
                    }
                }
            }
        }

        // Menu điều khiển
        public void menu() {
            int choice;
            do {
                System.out.println("\n==== QUẢN LÝ SINH VIÊN ====");
                System.out.println("1. Nhập danh sách sinh viên");
                System.out.println("2. Hiển thị danh sách sinh viên");
                System.out.println("3. Tìm kiếm sinh viên theo tên");
                System.out.println("4. Phân loại và hiển thị sinh viên theo GPA");
                System.out.println("5. Thoát");
                System.out.print("Chọn chức năng: ");

                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        inputStudents();
                        break;
                    case 2:
                        displayStudents();
                        break;
                    case 3:
                        searchStudentByName();
                        break;
                    case 4:
                        classifyAndDisplay();
                        break;
                    case 5:
                        System.out.println("Thoát chương trình!");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
                }
            } while (choice != 5);
        }

        public static void main(String[] args) {

        }
    }