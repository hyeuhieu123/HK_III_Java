package B8;


public abstract class Car {
     String model;
     int year;
     double price;

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    abstract String start();
    abstract String stop();
}
