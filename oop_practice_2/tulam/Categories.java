package oop_practice_2.tulam;
import java.util.Scanner;

public class Categories implements IApp{
    public static int count = 0;
    private int categoryId;
    private String categoryName;
    private int priority;
    private String description;
    private boolean status;

    String regexDescription = "^.{0,255}$";

    public Categories() {
        this.categoryId = ++count;
    }

    public Categories(String categoryName, int priority, String description, boolean status) {
        this.categoryId = ++count;
        this.categoryName = categoryName;
        this.priority = priority;
        this.description = description;
        this.status = status;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        Scanner sc = new Scanner(System.in);
        while (true){
            if(description.matches(regexDescription)){
                this.description = description;
                break;
            }else{
                System.out.println("Tên mô tả không được để trống!");
            }
            System.out.print("Nhập lại tên danh mục: ");
            description = sc.nextLine();
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner sc) {
        System.out.println("Nhập độ ưu tiên:");
        setPriority(Integer.parseInt(sc.nextLine()));

        System.out.println("Nhập mô tả:");
        setDescription(sc.nextLine());

        System.out.println("Nhập trạng thái:");
        setStatus(Boolean.parseBoolean(sc.nextLine()));
    }

    @Override
    public void displayInfo() {
        System.out.printf("Id: %d\n", this.categoryId);
        System.out.printf("Tên danh mục: %s\n", this.categoryName);
        System.out.printf("Độ ưu tiên: %d\n", this.priority);
        System.out.printf("Mô tả: %s\n", this.description);
        System.out.printf("Trạng thái: %s\n", this.status ? "Đang hoạt động" : "Không hoạt động");
    }
}