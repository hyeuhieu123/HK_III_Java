package ss12;
abstract class VehicleBai9 {
    private String name;
    private int speed;

    public VehicleBai9(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public abstract void move();
    public abstract void sound();

    // Overloading tính khoảng cách di chuyển theo thời gian
    public int move(int time) {
        return speed * time;
    }

    // Overloading tính khoảng cách dựa trên tốc độ cụ thể
    public int move(int time, int customSpeed) {
        return customSpeed * time;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}

class CarBai9 extends VehicleBai9 {
    public CarBai9(int speed) {
        super("Car", speed);
    }

    @Override
    public void move() {
        System.out.println(getName() + " đang di chuyển nhanh trên đường.");
    }

    @Override
    public void sound() {
        System.out.println(getName() + " phát ra âm thanh: Vroom!");
    }
}

class BikeBai9 extends VehicleBai9 {
    public BikeBai9(int speed) {
        super("Bike", speed);
    }

    @Override
    public void move() {
        System.out.println(getName() + " đang di chuyển nhanh trên đường.");
    }

    @Override
    public void sound() {
        System.out.println(getName() + " phát ra âm thanh: Ring Ring!");
    }
}

class BusBai9 extends VehicleBai9 {
    private int seats;

    public BusBai9(int speed, int seats) {
        super("Bus", speed);
        this.seats = seats;
    }

    @Override
    public void move() {
        System.out.println(getName() + " đang di chuyển với tốc độ trung bình trên đường.");
    }

    @Override
    public void sound() {
        System.out.println(getName() + " phát ra âm thanh: Honk!");
    }

    public int getSeats() {
        return seats;
    }
}

class Airplane extends VehicleBai9 {
    private int altitude; // độ cao (mét)

    public Airplane(int speed, int altitude) {
        super("Airplane", speed);
        this.altitude = altitude;
    }

    @Override
    public void move() {
        System.out.println(getName() + " đang bay trên bầu trời.");
    }

    @Override
    public void sound() {
        System.out.println(getName() + " phát ra âm thanh: Whoosh!");
    }

    public int getAltitude() {
        return altitude;
    }
}



public class B9 {
    public static void main(String[] args) {
        VehicleBai9[] vehicles = {
                new CarBai9(100),
                new BikeBai9(20),
                new BusBai9(60, 40),
                new Airplane(800, 10000)
        };
        System.out.println("=== Hành động của phương tiện ===");
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
            vehicles[i].sound();
            System.out.println("Quãng đường di chuyển trong 2 giờ: " + vehicles[i].move(2) + " km\n");
        }
        int customSpeed = 150;
        System.out.println("=== Tính quãng đường với tốc độ tùy chỉnh ===");
        System.out.println(vehicles[0].getName() + " đã di chuyển được " + vehicles[0].move(2, customSpeed) + " km với tốc độ " + customSpeed + " km/h.");
    }
}