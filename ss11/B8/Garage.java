package ex8;

public class Garage {
    private Car[] cars;
    private int index;
    public Garage() {
        cars = new Car[2];
        index = 0;
    }
    public void addCar(Car car) {
        if (index < 2) {
            cars[index] = car;
            index++;
        }
    }
    public void manageCars() {
        for (int i = 0; i < index; i++) {
            System.out.println("Car " + (i + 1) + ":");
            System.out.println(cars[i].start());
            System.out.println(cars[i].stop());
            if (cars[i] instanceof Refuelable) {
                System.out.println(((Refuelable)cars[i]).refuel());
            }
            System.out.println("----------------");
        }
    }
}