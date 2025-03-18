package oop_practice_2.tulam;

import java.util.Scanner;

public class ArrCategories {
    private Categories[] categories;
    private int size = 0;

    String regexName = "^.{6,50}$";

    public ArrCategories(int maxSize) {
        this.categories = new Categories[maxSize];
    }

    public int getSize() {
        return size;
    }

    public Categories[] getCategories() {
        return categories;
    }

    // Hàm thêm danh mục
    public void addCategory(Scanner sc) {
        Categories category = new Categories();

        while (true) {
            System.out.println("Nhập tên danh mục:");
            category.setCategoryName(sc.nextLine());
            if (!category.getCategoryName().matches(regexName)) {
                System.out.println("Ten quá ngắn!");
            } else if (containsCategoryName(category.getCategoryName())) {
                System.out.println("Tên đã tồn tại!");
            } else {
                break;
            }
        }

        category.inputData(sc);
        categories[size++] = category;
        System.out.println("Thêm danh mục thành công");
    }

    // Hàm hiển thị danh sách danh mục
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

    // Kiểm tra ten tồn tại
    public boolean containsCategoryName(String name) {
        for (int i = 0; i < size; i++) {
            if (categories[i].getCategoryName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // Hàm cập nhật danh mục
    public void updateCategory(Scanner sc) {
        System.out.println("Nhập vào id cần cập nhật:");
        int id = Integer.parseInt(sc.nextLine());

        int findIndex = findCategoryById(id);

        if (findIndex == -1) {
            System.out.println("Không tìm thấy " + id + " trong danh sách");
        } else {
            while (true) {
                System.out.println("----------------CẬP NHẬT DANH MỤC--------------");
                System.out.println("1. Cập nhật tên danh mục");
                System.out.println("2. Cập nhật độ ưu tiên");
                System.out.println("3. Cập nhâ mô tả");
                System.out.println("4. Cập nhật trạng thái");
                System.out.println("5. Trở về menu quản lý");
                System.out.printf("Lưa chọn của bạn: ");

                int choice = Integer.parseInt(sc.nextLine());

                if (choice == 5) {
                    break;
                }

                switch (choice) {
                    case 1:
                        while (true){
                            System.out.println("Nhập tên danh mục cập nhật");
                            categories[findIndex].setCategoryName(sc.nextLine());

                            if (!categories[findIndex].getCategoryName().matches(regexName)) {
                                System.out.println("Ten quá ngắn!");
                            } else if (containsCategoryName(categories[findIndex].getCategoryName())) {
                                System.out.println("Tên đã tồn tại!");
                            } else {
                                break;
                            }
                        }
                        System.out.println("Cập nhật thành công ten danh mục");
                        break;
                    case 2:
                        System.out.println("Nhập độ ưu tiên cập nhật:");
                        categories[findIndex].setPriority(Integer.parseInt(sc.nextLine()));
                        System.out.println("Cập nhat độ ưu tiên thành công");
                        break;
                    case 3:
                        System.out.println("Nhập mô tả cập nhật");
                        categories[findIndex].setDescription(sc.nextLine());
                        System.out.println("Cập nhật mô tả thành công");
                        break;
                    case 4:
                        System.out.println("Nhap trang thai cập nhật");
                        categories[findIndex].setStatus(Boolean.parseBoolean(sc.nextLine()));
                        break;
                }
            }
        }
    }

    // Hàm xóa danh mục
    public void deleteCategory(Scanner sc) {
        System.out.println("Nhập vào id cần xóa:");
        int id = Integer.parseInt(sc.nextLine());

        int findIndex = findCategoryById(id);

        if (findIndex == -1) {
            System.out.println("Không tìm thấy " + id + " trong danh sách");
        }else{
            for(int i = findIndex; i < size - 1; i++) {
                categories[i] = categories[i+1];
            }
            categories[size - 1] = null;
            size--;

            System.out.println("Xóa danh mục thành công");
        }
    }

    // Hàm tìm kiếm danh mục
    public void searchCategory(Scanner sc) {
        System.out.println("Nhập tên danh mục cần tìm kiếm:");
        String categoryName = sc.nextLine();

        boolean isFound = false;

        for(int i = 0; i < size; i++) {
            if(categories[i].getCategoryName().equals(categoryName)) {
                categories[i].displayInfo();
                System.out.println("---------------------");
                isFound = true;
            }
        }

        if(!isFound) {
            System.out.println("Không tìm thấy tên danh mục");
        }

    }

    // Hàm tìm id danh mục
    public int findCategoryById(int id) {
        for (int i = 0; i < size; i++) {
            if (categories[i].getCategoryId() == id) {
                return i;
            }
        }
        return -1;
    }
}