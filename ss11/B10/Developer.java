package ex10;

public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    String work() {
        return "ltp " + name + "(luong:  $" + salary + ") dang viet code";
    }

    @Override
    String takeVacation() {
        return "ltp " + name + "(luong:  $" + salary + ") dang di nghi phep";
    }
}