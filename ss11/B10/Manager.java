package ex10;

public class Manager extends Employee implements AttendMeeting {
    public Manager(String name, double salary) {
        super(name, salary);
    }
    @Override
    String work() {
        return "quanly " + name + "(luong: $" + salary + ") dang giam sat du an";
    }
    @Override
    String takeVacation() {
        return "quan ly " + name + "(luong: $" + salary + ") dang di nghi tai Phap";
    }
    @Override
    public String attendMeeting() {
        return "quan ly " + name + " luongg: $" + salary + ") dang tham gia cuoc hop";
    }
}