package oop_practice_2.chatGpt;

import java.util.Scanner;

public class Product implements IApp {
    private String productId;
    private String productName;
    private double importPrice;
    private double exportPrice;
    private String title;
    private String description;
    private int quantity;
    private int categoryId;
    private int status;

    private static final String REGEX_TITLE = "^.{0,200}$";

    public Product() {}

    public Product(String productId, String productName, double importPrice, double exportPrice,
                   String description, String title, int quantity, int categoryId, int status) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.description = description;
        this.title = title;
        this.quantity = quantity;
        this.categoryId = categoryId;
        this.status = status;
    }

    // Getters and Setters


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    // Validation methods
    private double validateImportPrice(Scanner sc) {
        double price;
        do {
            System.out.print("Nhập giá nhập (phải > 0): ");
            price = Double.parseDouble(sc.nextLine());
            if (price > 0) return price;
            System.out.println("Lỗi: Giá nhập phải lớn hơn 0.");
        } while (true);
    }

    private double validateExportPrice(Scanner sc, double importPrice) {
        double price;
        do {
            System.out.print("Nhập giá xuất (phải > 1.1 * giá nhập): ");
            price = Double.parseDouble(sc.nextLine());
            if (price >= importPrice * INTEREST) return price;
            System.out.println("Lỗi: Giá xuất phải lớn hơn 1.1 * giá nhập.");
        } while (true);
    }

    private String validateTitle(Scanner sc) {
        String title;
        do {
            System.out.print("Nhập tiêu đề (tối đa 200 ký tự): ");
            title = sc.nextLine();
            if (title.matches(REGEX_TITLE)) return title;
            System.out.println("Lỗi: Tiêu đề không hợp lệ.");
        } while (true);
    }

    private int validateQuantity(Scanner sc) {
        int quantity;
        do {
            System.out.print("Nhập số lượng (>= 0): ");
            quantity = Integer.parseInt(sc.nextLine());
            if (quantity >= 0) return quantity;
            System.out.println("Lỗi: Số lượng phải >= 0.");
        } while (true);
    }

    // Input data
    @Override
    public void inputData(Scanner sc) {
        this.importPrice = validateImportPrice(sc);
        this.exportPrice = validateExportPrice(sc, importPrice);
        this.title = validateTitle(sc);
        System.out.print("Nhập mô tả: ");
        this.description = sc.nextLine();
        this.quantity = validateQuantity(sc);
        System.out.print("Nhập trạng thái (0: Đang hoạt động, 1: Hết hàng, 2: Không hoạt động): ");
        this.status = Integer.parseInt(sc.nextLine());
    }

    // Display information
    @Override
    public void displayInfo() {
        System.out.printf("ID: %s\nTên sản phẩm: %s\nGiá nhập: %.2f\nGiá xuất: %.2f\n" +
                        "Tiêu đề: %s\nMô tả: %s\nSố lượng: %d\nMã danh mục: %d\nTrạng thái: %s\n",
                productId, productName, importPrice, exportPrice, title,
                description, quantity, categoryId, getStatusString());
    }

    private String getStatusString() {
        return switch (status) {
            case 0 -> "Đang hoạt động";
            case 1 -> "Hết hàng";
            default -> "Không hoạt động";
        };
    }
}