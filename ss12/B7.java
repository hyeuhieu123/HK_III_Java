package ss12;
class Vehicle {
    public String move() {
        return "Vehicle moving";
    }

    public String sound() {
        return "Vehicle sound";
    }
}

class Car extends Vehicle {
    @Override
    public String move() {
        return "Di chuyển nhanh";
    }

    @Override
    public String sound() {
        return "Vroom";
    }
}

class Bike extends Vehicle {
    @Override
    public String move() {
        return "Di chuyển chậm";
    }

    @Override
    public String sound() {
        return "Ring Ring";
    }
}

class Bus extends Vehicle {
    @Override
    public String move() {
        return "Di chuyển với tốc độ trung bình";
    }

    @Override
    public String sound() {
        return "Honk Honk";
    }
}

public class B7 {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Bike();
        vehicles[2] = new Bus();

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Phương tiện " + (i + 1) + ":");
            System.out.println("Di chuyển: " + vehicles[i].move());
            System.out.println("Âm thanh: " + vehicles[i].sound());
            System.out.println("-------------------------");
        }
    }
}
