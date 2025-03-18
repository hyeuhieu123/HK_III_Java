package oop_practice_2.tulam;
import java.util.Scanner;

public class Product implements IApp{
    private String productId;
    private String productName;
    private double importPrice;
    private double exportPrice;
    private String title;
    private String description;
    private int quantity;
    private int categoryId;
    private int status;

    String regexTitle = "^.{0,200}$";

    public Product() {
    }

    public Product(String productId, String productName, double importPrice, double exportPrice, String description, String title, int quantity, int categoryId, int status) {
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
        Scanner sc = new Scanner(System.in);
        while (true){
            if(importPrice > 0){
                this.importPrice = importPrice;
                break;
            }else{
                System.out.println("Giá nhập phải lớn hơn 0. Vui lòng nhập lại");
            }
            importPrice = Double.parseDouble(sc.nextLine());
        }
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        Scanner sc = new Scanner(System.in);
        while (true){
            if(exportPrice < getImportPrice() * INTEREST){
                System.out.println("Giá xuất phải lớn hơn 1.1% giá nhập. Vui lòng nhập lại");
            }else{
                this.exportPrice = exportPrice;
                break;
            }
            exportPrice = Double.parseDouble(sc.nextLine());
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        Scanner sc = new Scanner(System.in);
        while (true){
            if(title.matches(regexTitle)){
                this.title = title;
                break;
            }else{
                System.out.println("Tên tiêu đề không hợp lệ. Vui lòng nhập lại");
            }
            title = sc.nextLine();
        }
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
        Scanner sc = new Scanner(System.in);
        while (true){
            if(quantity >= 0) {
                this.quantity = quantity;
                break;
            }else{
                System.out.println("So lượng phải lớn hơn 0");
            }
            quantity = Integer.parseInt(sc.nextLine());
        }
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

    @Override
    public void inputData(Scanner sc) {
        System.out.println("Nhập giá vào:");
        setImportPrice(Double.parseDouble(sc.nextLine()));

        System.out.println("Nhập giá xuất:");
        setExportPrice(Double.parseDouble(sc.nextLine()));

        System.out.println("Nhập tiêu đề:");
        setTitle(sc.nextLine());

        System.out.println("Nhập mô tả:");
        setDescription(sc.nextLine());

        System.out.println("Nhập số lượng");
        setQuantity(Integer.parseInt(sc.nextLine()));

        System.out.println("Nhập trạng thái:");
        setStatus(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public void displayInfo() {
        System.out.printf("Id: %s\n", productId);
        System.out.printf("Product Name: %s\n", productName);
        System.out.printf("Import Price: %.2f\n", importPrice);
        System.out.printf("Export Price: %.2f\n", exportPrice);
        System.out.printf("Title: %s\n", title);
        System.out.printf("Description: %s\n", description);
        System.out.printf("Quantity: %d\n", quantity);
        System.out.printf("Category Id: %d\n", categoryId);
        System.out.printf("Status: %s\n", status == 0 ? "Đang hoạt động" : status == 1 ? "Hết hàng" : "Không hoạt động");
    }
}