package oop_practice_2.chatGpt;



import java.util.Scanner;

public class Categories implements IApp{
    private static int count = 0;
    private int categoryId;
    private String categoryName;
    private int priority;
    private String description;
    private boolean status;

    private static final String REGEX_DESCRIPTION = "^.{0,255}$";

    // Constructor mặc định
    public Categories() {
        this.categoryId = ++count;
    }

    // Constructor có tham số
    public Categories(String categoryName, int priority, String description, boolean status) {
        this.categoryId = ++count;
        this.categoryName = categoryName;
        this.priority = priority;
        this.description = validateDescription(description);
        this.status = status;
    }

    // Getter và Setter
    public int getCategoryId() {
        return categoryId;
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
        this.description = validateDescription(description);
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Nhập dữ liệu danh mục từ người dùng.
     */
    @Override
    public void inputData(Scanner sc) {
        System.out.print("Nhập độ ưu tiên: ");
        this.priority = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập mô tả: ");
        this.description = validateDescription(sc.nextLine());

        System.out.print("Nhập trạng thái (true: Đang hoạt động / false: Không hoạt động): ");
        this.status = Boolean.parseBoolean(sc.nextLine());
    }

    /**
     * Hiển thị thông tin danh mục.
     */
    @Override
    public void displayInfo() {
        System.out.println("\n===== THÔNG TIN DANH MỤC =====");
        System.out.println("ID: " + categoryId);
        System.out.println("Tên danh mục: " + categoryName);
        System.out.println("Độ ưu tiên: " + priority);
        System.out.println("Mô tả: " + description);
        System.out.println("Trạng thái: " + (status ? "Đang hoạt động" : "Không hoạt động"));
        System.out.println("==============================\n");
    }

    /**
     * Kiểm tra và chuẩn hóa mô tả danh mục.
     */
    private String validateDescription(String description) {
        return (description.matches(REGEX_DESCRIPTION)) ? description : "Không có mô tả";
    }
}