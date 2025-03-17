class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getDiscount() {
        return 0.0;
    }

    public double getFinalPrice() {
        return price - (price * getDiscount() / 100);
    }

    // Overloading phương thức tính chiết khấu dựa trên số lượng mua
    public double getDiscount(int quantity) {
        if (quantity > 100) {
            return 5.0;
        }
        return getDiscount();
    }

    // Overloading phương thức tính giá sau chiết khấu khi mua với số lượng lớn
    public double getFinalPrice(int quantity) {
        double discountRate = getDiscount(quantity);
        double discountedPrice = price - (price * discountRate / 100);
        return discountedPrice * quantity;
    }

    public void showInfo() {
        System.out.println("Sản phẩm: " + name);
        System.out.println("Giá gốc: " + price);
        System.out.println("Chiết khấu: " + getDiscount() + "%");
        System.out.println("Giá sau chiết khấu: " + getFinalPrice());
    }
}

class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return 10.0;
    }
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return 20.0;
    }
}

class Food extends Product {
    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return 5.0;
    }
}


public class Bai8 {
    public static void main(String[] args) {
        Product p1 = new Electronics("Laptop", 1500);
        Product p2 = new Clothing("Áo thun", 500);
        Product p3 = new Food("Bánh mì", 50);

        System.out.println("=== Thông tin sản phẩm ===");
        p1.showInfo();
        System.out.println("--------------------------");
        p2.showInfo();
        System.out.println("--------------------------");
        p3.showInfo();
        System.out.println("==========================");

        int quantity = 120;
        System.out.println("\n=== Giá khi mua số lượng lớn (" + quantity + " sản phẩm) ===");
        System.out.println("Laptop - Tổng giá sau chiết khấu: " + p1.getFinalPrice(quantity));
        System.out.println("Áo thun - Tổng giá sau chiết khấu: " + p2.getFinalPrice(quantity));
        System.out.println("Bánh mì - Tổng giá sau chiết khấu: " + p3.getFinalPrice(quantity));
    }
}
