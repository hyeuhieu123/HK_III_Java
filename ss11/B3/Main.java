package B3;

public class Main {
    public static void main(String[] args) {
        Vehicle newCar = new Car("vf", 60);
        Vehicle newBike = new Bike("sh", 40);

        newCar.displayInfo();
        newCar.start();
        newBike.displayInfo();
        newBike.start();
    }

}