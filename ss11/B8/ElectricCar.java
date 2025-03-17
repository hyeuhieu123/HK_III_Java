package B8;


public class ElectricCar extends Car implements Refuelable {
    public ElectricCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    String start() {
        return "xe dien" + model + " nam sx: " + year + ", gia tien: $" + price + ") da khoi dong khong tieng on";
    }

    @Override
    String stop() {
        return "xe dien" + model + " nam sx: " + year + ", gia tien: $" + price + ") da dung va ngat ket noi dong co";
    }

    @Override
    public String refuel() {
        return "xe dien" + model + " nam sx: " + year + ", gia tien: $" + price + ") dang sac dien";
    }
}