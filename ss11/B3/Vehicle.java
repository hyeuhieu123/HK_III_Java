package B3;


public abstract class Vehicle {
    protected String name;
    protected int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void displayInfo(){}
    void start(){
        System.out.println("Vehicle is starting...");
    }
}