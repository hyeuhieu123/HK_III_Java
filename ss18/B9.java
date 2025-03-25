package ss18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private int price;
    private int quantity;
    
    public Product(){

    }
    public Product(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void inputData(Scanner sc) {
        System.out.print("nhap id ");
        this.id = Integer.parseInt(sc.nextLine());
       

        System.out.print("nhap ten sp");
        this.name = sc.nextLine();

        do {
            System.out.print("nhap gia");
            this.price =  Integer.parseInt(sc.nextLine());
            if (this.price < 0) System.out.println("nhap lai");
        } while (this.price < 0);

        do {
            System.out.print("nhap so luong sp");
            this.quantity =  Integer.parseInt(sc.nextLine());
            if (this.quantity < 0) System.out.println("nhap lai");
        } while (this.quantity < 0);
    }


    public void displayInfo() {
        System.out.println("id " + id + " ten " + name + " gia " + price + " so luong " + quantity);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    
}

public class B9 {
    static  Map<Integer, Product> productMap = new HashMap<>();
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        
            do {
                    System.out.println("-------------------");
                    System.out.println("1.them sp");
                    System.out.println("2.danh sach");
                    System.out.println("3.xoa sp");
                    System.out.println("4.update sp");
                    System.out.println("5.tinh tong sp");
                    int choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            addProduct();
                            break;
                        case 2:
                           displayProducts();
                           
                            break;
                        case 3:
                            deleteProduct();
                            break;
                        case 4:
                        updateProduct();
                            break;
                        case 5:
                            calculateTotalValue();
                            break;
                        case 6:
                            System.exit(0);
                        default:
                          System.out.println("nhap lai");
                    }
            } while (true);

   
    //     for(Map.Entry<Integer, Product> entry : productMap.entrySet()){
    //         System.out.println(entry.getValue().getId());
    //     }
    // ;
    
    }

    private static void displayProducts() {
        for (Product product : productMap.values()) {
            product.displayInfo();
        }
    }
    private static void addProduct() {
        Product product = new Product();
        product.inputData(sc);
        int id = product.getId();

        if (productMap.containsKey(id)) {
            System.out.println("trung id");
            return;
        }
        productMap.put(id, product);
    }

    
    private static void updateProduct() {
        System.out.print("nhap id");
        int id = Integer.parseInt(sc.nextLine());

        if (productMap.containsKey(id) == false) {
            System.out.println("ko thay");
            return;
        }

        Product product = productMap.get(id);
        System.out.println("thong tin hien tai");
        product.displayInfo();

        System.out.println("1 cap nhat gia");
        System.out.println("2 cap nhat so l uong");
        int option = Integer.parseInt(sc.nextLine());
        switch (option) {
            case 1:
                int newPrice;
                do {
                    System.out.print("gia moi ");
                    newPrice = Integer.parseInt(sc.nextLine());
                    if (newPrice < 0) System.out.println("nhap lai");
                } while (newPrice < 0);
                product.setPrice(newPrice);

                break;
    
            case 2:
                int newQuantity;
                do {
                    System.out.print("nhap so luong moi");
                    newQuantity = Integer.parseInt(sc.nextLine());
                    if (newQuantity < 0) System.out.println("nhap lai");
                } while (newQuantity < 0);
                product.setQuantity(newQuantity);
                break;

        }
        
    }
    private static void deleteProduct() {
        System.out.print("nhap id ");
        int id = Integer.parseInt(sc.nextLine());
        productMap.remove(id);
        
    }
    private static void calculateTotalValue() {
        int totalValue = 0;
        for (Product product : productMap.values()) {
            totalValue += product.getPrice() * product.getQuantity();
        }
        System.out.println("total " + totalValue);
    }

}
 