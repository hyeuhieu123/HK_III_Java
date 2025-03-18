package oop_practice_2.chatGpt;

import java.util.Scanner;

public class ArrCategories {
    private Categories[] categories;
    private int size = 0;
    private static final String REGEX_NAME = "^.{6,50}$";

    public ArrCategories(int maxSize) {
        this.categories = new Categories[maxSize];
    }

    public int getSize() {
        return size;
    }

    public Categories[] getCategories() {
        return categories;
    }

    public void addCategory(Scanner sc) {
        Categories category = new Categories();

        category.setCategoryName(getValidCategoryName(sc));
        category.inputData(sc);
        categories[size++] = category;
        System.out.println("Thêm danh mục thành công");
    }

    public void displayCategories() {
        if (size == 0) {
            System.out.println("Không có danh mục nào!");
            return;
        }

        for (int i = 0; i < size; i++) {
            categories[i].displayInfo();
            System.out.println("---------------------------");
        }
    }

    public void updateCategory(Scanner sc) {
        System.out.print("Nhập vào ID cần cập nhật: ");
        int id = Integer.parseInt(sc.nextLine());
        int index = findCategoryById(id);

        if (index == -1) {
            System.out.println("Không tìm thấy danh mục có ID " + id);
            return;
        }

        while (true) {
            System.out.println("--- CẬP NHẬT DANH MỤC ---");
            System.out.println("1. Cập nhật tên danh mục");
            System.out.println("2. Cập nhật độ ưu tiên");
            System.out.println("3. Cập nhật mô tả");
            System.out.println("4. Cập nhật trạng thái");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());
            if (choice == 5) break;

            switch (choice) {
                case 1:
                    categories[index].setCategoryName(getValidCategoryName(sc));
                    System.out.println("Cập nhật tên danh mục thành công");
                    break;
                case 2:
                    System.out.print("Nhập độ ưu tiên mới: ");
                    categories[index].setPriority(Integer.parseInt(sc.nextLine()));
                    System.out.println("Cập nhật độ ưu tiên thành công");
                    break;
                case 3:
                    System.out.print("Nhập mô tả mới: ");
                    categories[index].setDescription(sc.nextLine());
                    System.out.println("Cập nhật mô tả thành công");
                    break;
                case 4:
                    System.out.print("Nhập trạng thái mới (true/false): ");
                    categories[index].setStatus(Boolean.parseBoolean(sc.nextLine()));
                    System.out.println("Cập nhật trạng thái thành công");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    public void deleteCategory(Scanner sc) {
        System.out.print("Nhập ID danh mục cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        int index = findCategoryById(id);

        if (index == -1) {
            System.out.println("Không tìm thấy danh mục có ID " + id);
            return;
        }

        for (int i = index; i < size - 1; i++) {
            categories[i] = categories[i + 1];
        }
        categories[--size] = null;
        System.out.println("Xóa danh mục thành công");
    }

    public void searchCategory(Scanner sc) {
        System.out.print("Nhập tên danh mục cần tìm: ");
        String name = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (categories[i].getCategoryName().equalsIgnoreCase(name)) {
                categories[i].displayInfo();
                System.out.println("---------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy danh mục có tên " + name);
        }
    }

    private int findCategoryById(int id) {
        for (int i = 0; i < size; i++) {
            if (categories[i].getCategoryId() == id) {
                return i;
            }
        }
        return -1;
    }

    private boolean containsCategoryName(String name) {
        for (int i = 0; i < size; i++) {
            if (categories[i].getCategoryName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    private String getValidCategoryName(Scanner sc) {
        String name;
        while (true) {
            System.out.print("Nhập tên danh mục: ");
            name = sc.nextLine();

            if (!name.matches(REGEX_NAME)) {
                System.out.println("Tên danh mục phải có từ 6 đến 50 ký tự.");
            } else if (containsCategoryName(name)) {
                System.out.println("Tên danh mục đã tồn tại.");
            } else {
                break;
            }
        }
        return name;
    }
}