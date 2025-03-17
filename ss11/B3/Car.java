package B3;


public class Car extends Vehicle {

    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("xe " + name + ", toc do: " + speed + " km/h");
    }

}
