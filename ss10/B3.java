
package ss10;

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        setYear(year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = 2025;
        if (year > currentYear) {
            System.out.println("Năm sản xuất không hợp lệ. Đặt về năm hiện tại.");
            this.year = currentYear;
        } else {
            this.year = year;
        }
    }
}

public class B3 {
    public static void main(String[] args) {
        Car car = new Car("toyota", "corolla", 2022);
        System.out.println("Hãng xe: " + car.getMake());
        System.out.println("Mẫu xe: " + car.getModel());
        System.out.println("Năm sản xuất: " + car.getYear());
        car.setYear(2030);
        System.out.println("Năm sản xuất sau khi cập nhật: " + car.getYear());
    }
}