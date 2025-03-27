    package ss20;

    import java.time.LocalDate;
    import java.util.List;
    import java.util.Optional;

    class User {
        private int id;
        private String name;
        private Optional<String> email;
        public User(int id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = Optional.ofNullable(email);
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public Optional<String> getEmail() {
            return email;
        }
        
        
    }
    class Task{
        private int id;
        private String title;
        private User assignedTo;
        private LocalDate dueDate;
        private boolean compeleted;
        public Task(int id, String title, User assignedTo, LocalDate dueDate, boolean compeleted) {
            this.id = id;
            this.title = title;
            this.assignedTo = assignedTo;
            this.dueDate = dueDate;
            this.compeleted = compeleted;
        }
        public int getId() {
            return id;
        }
        public String getTitle() {
            return title;
        }
        public User getAssignedTo() {
            return assignedTo;
        }
        public LocalDate getDueDate() {
            return dueDate;
        }
        public boolean isCompeleted() {
            return compeleted;
        }
        
    }

    public class B10 {
        public static void main(String[] args) {
            User u1 = new User(1, "Quý", "quy@example.com");

    User u2 = new User(2, "Lan", null);

    User u3 = new User(3, "Huyền", "huyen@example.com");

    List<Task> tasks = List.of(

                    new Task(1, "Viết báo cáo", u1, LocalDate.of(2025, 3, 20), false),

                    new Task(2, "Thiết kế slide", u1, LocalDate.of(2025, 3, 25), true),

                    new Task(3, "Họp nhóm", u2, LocalDate.of(2025, 3, 18), false),

                    new Task(4, "Nộp tài liệu", u3, LocalDate.of(2025, 3, 22), true),

                    new Task(5, "Chuẩn bị thuyết trình", u2, LocalDate.of(2025, 3, 19), true));

            System.out.println("cv qua han chua hoan thanh");
            tasks.stream().filter(task -> task.isCompeleted() == false && task.getDueDate().isBefore(LocalDate.of(2025,03,23))).forEach(task -> System.out.println(task.getTitle() +" giao cho: " + task.getAssignedTo().getName() +" han chot " + task.getDueDate() ));
            System.out.println("so cv hoan thanh");
           System.out.println( tasks.stream().filter(task -> task.isCompeleted() == true).count());

        //    tasks.forEach(u ->{
        //     String name = u.getAssignedTo().getName();
        //     int totalCount=0;
        //     int overDue=0;
            
            
            
        //    });

            

        List<User> user = List.of(u1, u2, u3);
        user.forEach(user1 -> {
            long assigned = tasks.stream().filter(task -> task.getAssignedTo().equals(user1)).count();
            long overdue =  tasks.stream().filter(task -> task.getAssignedTo().equals(user1))
                    .filter(task -> !task.isCompeleted() && task.getDueDate().isBefore(LocalDate.of(2025,03,23)))
                    .count();
            System.out.println(user1 + ", Tổng số công việc được giao: " + assigned + ", Số công việc quá hạn: " + overdue);
        });
    }
}