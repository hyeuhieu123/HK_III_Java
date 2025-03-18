package oop_practice_2.tulam;



import java.util.Scanner;

public class ShopManagerment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrCategories categoriesList = new ArrCategories(100);
        ArrProducts productsList = new ArrProducts(100);
        do {
            System.out.println("-------------------SHOP MENU----------------");
            System.out.println("1. Quản lí danh mục");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.printf("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("-----------------CATEGORIES MANAGEMENT---------------");
                        System.out.println("1. Danh sách danh mục");
                        System.out.println("2. Thêm mới danh mục");
                        System.out.println("3. Cập nhật danh mục");
                        System.out.println("4. Xóa danh mục");
                        System.out.println("5. Tìm kiếm danh mục theo tên");
                        System.out.println("6. Trở về menu chính");
                        System.out.printf("Lua chọn của bạn: ");

                        int choice2 = Integer.parseInt(sc.nextLine());

                        if (choice2 == 6) {
                            break;
                        }

                        switch (choice2) {
                            case 1:
                                categoriesList.displayCategories();
                                break;
                            case 2:
                                categoriesList.addCategory(sc);
                                break;
                            case 3:
                                categoriesList.updateCategory(sc);
                                break;
                            case 4:
                                categoriesList.deleteCategory(sc);
                                break;
                            case 5:
                                categoriesList.searchCategory(sc);
                                break;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("---------------PRODUCTS MANAGEMENT--------------");
                        System.out.println("1. Danh sách sản phẩm");
                        System.out.println("2. Thêm mới sản phẩm");
                        System.out.println("3. Cập nhật sản phẩm");
                        System.out.println("4. Xóa sản phẩm");
                        System.out.println("5. Tìm kiếm sản phẩm theo tên hoặc tiêu đề");
                        System.out.println("6. Tìm kiếm sản phẩm theo khoảng giá bán");
                        System.out.println("7. Sắp xếp sản phẩm theo giá bán tăng dần");
                        System.out.println("8. Bán sản phẩm");
                        System.out.println("9. Thống kê số lượng sản phẩm theo danh mục");
                        System.out.println("10. Trở về menu chính");
                        System.out.printf("Lựa chọn của bạn: ");

                        int choice3 = Integer.parseInt(sc.nextLine());

                        if (choice3 == 10) {
                            break;
                        }

                        switch (choice3) {
                            case 1:
                                productsList.displayProducts();
                                break;
                            case 2:
                                productsList.addProduct(sc, categoriesList);
                                break;
                            case 3:
                                productsList.updateProduct(sc, categoriesList);
                                break;
                            case 4:
                                productsList.deleteProduct(sc);
                                break;
                            case 5:
                                productsList.searchProduct(sc);
                                break;
                            case 6:
                                productsList.searchProductByPrice(sc);
                                break;
                            case 7:
                                productsList.sortProduct();
                                break;
                            case 8:
                                productsList.sellProduct(sc);
                                break;
                            case 9:
                                productsList.statisticProductInCategory(categoriesList);
                                break;
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại từ 1 đến 3");
            }
        } while (true);
    }
}