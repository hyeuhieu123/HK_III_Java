package B8;

public class GasCar extends Car implements Refuelable {
        public GasCar(String model, int year, double price) {
            super(model, year, price);
        }

        @Override
        String start() {
            return "xe chay xang " + model + " nam san xuat: " + year + ", gia tien: $" + price + ") da khoi dong voi tieng dong co";
        }

        @Override
        String stop() {
            return "xe chay xang " + model + " nam san xuat: " + year + ", gia tien: $" + price + ") da dung ";
        }

        @Override
        public String refuel() {
            return "xe chay xang " + model + " nam san xuat: " + year + ", gia tien: $" + price + ") dang do xang";
        }
}