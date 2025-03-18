package oop_practice_2.chatGpt;


import java.util.Scanner;

public class ArrProducts {
    private Product[] products;
    private int sizeProduct = 0;

    private static final String REGEX_PRODUCT_ID = "^[CET].{4}$";
    private static final String REGEX_PRODUCT_NAME = "^.{10,100}$";

    public ArrProducts(int maxSize) {
        this.products = new Product[maxSize];
    }

    public void displayProducts() {
        if (sizeProduct == 0) {
            System.out.println("Không có sản phẩm nào");
            return;
        }

        for (int i = 0; i < sizeProduct; i++) {
            products[i].displayInfo();
            System.out.println("--------------------------");
        }
    }

    public void addProduct(Scanner sc, ArrCategories arrCategories) {
        Product product = new Product();

        product.setProductId(validateProductId(sc));
        product.setProductName(validateProductName(sc));
        product.inputData(sc);
        selectCategory(sc, arrCategories, product);

        products[sizeProduct++] = product;
        System.out.println("Thêm sản phẩm thành công!");
    }

    private String validateProductId(Scanner sc) {
        while (true) {
            System.out.println("Nhập id sản phẩm");
            String productId = sc.nextLine();

            if (!productId.matches(REGEX_PRODUCT_ID)) {
                System.out.println("Id không hợp lệ");
            } else if (duplicateProductId(productId)) {
                System.out.println("Id đã tồn tại");
            } else {
                return productId;
            }
        }
    }

    private String validateProductName(Scanner sc) {
        while (true) {
            System.out.println("Nhập tên sản phẩm: ");
            String productName = sc.nextLine();

            if (!productName.matches(REGEX_PRODUCT_NAME)) {
                System.out.println("Tên quá ngắn. Vui lòng nhập lại");
            } else if (duplicateProductName(productName)) {
                System.out.println("Tên đã tồn tại. Vui lòng nhập lại");
            } else {
                return productName;
            }
        }
    }

    private void selectCategory(Scanner sc, ArrCategories arrCategories, Product product) {
        Categories[] categories = arrCategories.getCategories();

        System.out.println("---------------DANH SÁCH DANH MỤC---------------");
        for (int i = 0; i < arrCategories.getSize(); i++) {
            System.out.printf("%d. %s\n", i + 1, categories[i].getCategoryName());
        }
        System.out.printf("Lựa chọn của bạn: ");

        int choice;
        while (true) {
            choice = Integer.parseInt(sc.nextLine());

            if (choice < 1 || choice > arrCategories.getSize()) {
                System.out.println("Số không hợp lệ, vui lòng chọn lại.");
                continue;
            }

            product.setCategoryId(categories[choice - 1].getCategoryId());
            break;
        }
    }

    public void updateProduct(Scanner sc, ArrCategories arrCategories) {
        System.out.println("Nhập vào id cần cập nhật:");
        String productId = sc.nextLine();

        int findIndex = findProductById(productId);

        if (findIndex == -1) {
            System.out.println("Không tìm thấy " + productId + " trong danh sách");
            return;
        }

        while (true) {
            System.out.println("------------------CẬP NHẬT SẢN PHẨM-----------------");
            System.out.println("1. Cập nhật tên danh mục");
            System.out.println("2. Cập nhật giá nhập");
            System.out.println("3. Cập nhật giá xuất");
            System.out.println("4. Cập nhật tiêu đề");
            System.out.println("5. Cập nhật mô tả");
            System.out.println("6. Cập nhật số lượng");
            System.out.println("7. Cập nhật mã danh mục");
            System.out.println("8. Cập nhật trạng thái");
            System.out.println("9. Trở về menu quản lý");
            System.out.printf("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 9) {
                break;
            }

            updateProductField(sc, findIndex, choice);
        }
    }

    private void updateProductField(Scanner sc, int findIndex, int choice) {
        switch (choice) {
            case 1:
                updateProductName(sc, findIndex);
                break;
            case 2:
                updateImportPrice(sc, findIndex);
                break;
            case 3:
                updateExportPrice(sc, findIndex);
                break;
            case 4:
                updateTitle(sc, findIndex);
                break;
            case 5:
                updateDescription(sc, findIndex);
                break;
            case 6:
                updateQuantity(sc, findIndex);
                break;
            case 7:
                updateCategoryId(sc, findIndex);
                break;
            case 8:
                updateStatus(sc, findIndex);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
                break;
        }
    }

    private void updateProductName(Scanner sc, int findIndex) {
        while (true) {
            System.out.println("Nhập tên sản phẩm mới:");
            String newName = sc.nextLine();

            if (!newName.matches(REGEX_PRODUCT_NAME)) {
                System.out.println("Tên sp không hợp lệ. Vui lòng nhập lại");
            } else if (duplicateProductName(newName)) {
                System.out.println("Tên sản phẩm đã tồn tại. Vui lòng nhập lại");
            } else {
                products[findIndex].setProductName(newName);
                System.out.println("Cập nhật tên sản phẩm thành công");
                break;
            }
        }
    }

    private void updateImportPrice(Scanner sc, int findIndex) {
        System.out.println("Nhập giá nhập mới:");
        products[findIndex].setImportPrice(Double.parseDouble(sc.nextLine()));
        System.out.println("Cập nhật giá nhập thành công");
    }

    private void updateExportPrice(Scanner sc, int findIndex) {
        System.out.println("Nhập giá xuất mới:");
        products[findIndex].setExportPrice(Double.parseDouble(sc.nextLine()));
        System.out.println("Cập nhật giá xuất thành công");
    }

    private void updateTitle(Scanner sc, int findIndex) {
        System.out.println("Cập nhật tiêu đề:");
        products[findIndex].setTitle(sc.nextLine());
        System.out.println("Cập nhật tiêu đề thành công");
    }

    private void updateDescription(Scanner sc, int findIndex) {
        System.out.println("Nhập mô tả mới:");
        products[findIndex].setDescription(sc.nextLine());
        System.out.println("Cập nhật mô tả thành công");
    }

    private void updateQuantity(Scanner sc, int findIndex) {
        System.out.println("Cập nhật số lượng");
        products[findIndex].setQuantity(Integer.parseInt(sc.nextLine()));
        System.out.println("Cập nhật số lượng thành công");
    }

    private void updateCategoryId(Scanner sc, int findIndex) {
        System.out.println("Cập nhật mã danh mục:");
        products[findIndex].setCategoryId(Integer.parseInt(sc.nextLine()));
        System.out.println("Cập nhật mã danh mục thành công");
    }

    private void updateStatus(Scanner sc, int findIndex) {
        System.out.println("Cập nhật trạng thái:");
        products[findIndex].setStatus(Integer.parseInt(sc.nextLine()));
        System.out.println("Cập nhật trạng thái thành công");
    }

    public void deleteProduct(Scanner sc) {
        System.out.println("Nhập id cần xóa:");
        String id = sc.nextLine();

        int idxDelete = findProductById(id);
        if (idxDelete == -1) {
            System.out.println("Không tìm thấy " + id + " trong danh sách");
            return;
        }

        for (int i = idxDelete; i < sizeProduct - 1; i++) {
            products[i] = products[i + 1];
        }
        products[sizeProduct - 1] = null;
        sizeProduct--;

        System.out.println("Xóa sản phẩm thành công");
    }

    public void searchProduct(Scanner sc) {
        System.out.println("Nhập vào tên sp hoặc tiêu đề cần tìm kiếm:");
        String productName = sc.nextLine();

        boolean isFound = false;

        for (int i = 0; i < sizeProduct; i++) {
            if (products[i].getProductName().equals(productName) || products[i].getTitle().equals(productName)) {
                products[i].displayInfo();
                System.out.println("---------------------");
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("Không tìm thấy tên hoặc tiêu đề");
        }
    }

    public void searchProductByPrice(Scanner sc) {
        System.out.println("Nhập vào 2 khoảng giá:");
        int minPrice = Integer.parseInt(sc.nextLine());
        int maxPrice = Integer.parseInt(sc.nextLine());

        boolean isFound = false;
        for (int i = 0; i < sizeProduct; i++) {
            if (products[i].getExportPrice() >= minPrice && products[i].getExportPrice() <= maxPrice) {
                products[i].displayInfo();
                System.out.println("---------------------");
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Không có sản phẩm nằm trong khoảng giá này");
        }
    }

    public void sortProduct() {
        for (int i = 0; i < sizeProduct - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < sizeProduct - i - 1; j++) {
                if (products[j].getExportPrice() > products[j + 1].getExportPrice()) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        System.out.println("Đã sắp xếp!");
    }

    public void sellProduct(Scanner sc) {
        System.out.println("Nhập vào id sản phẩm:");
        String productId = sc.nextLine();

        int findIndex = findProductById(productId);
        if (findIndex == -1) {
            System.out.println("Không tìm thấy sản phẩm");
            return;
        }

        System.out.println("Nhập số lượng bán:");
        int quantityToSell = Integer.parseInt(sc.nextLine());

        if (quantityToSell > products[findIndex].getQuantity()) {
            System.out.println("Không đủ số lượng để bán. Số lượng còn lại: " + products[findIndex].getQuantity());
        } else if (products[findIndex].getStatus() == 2) {
            System.out.println("Sản phẩm không hoạt động. Vui lòng chọn sp khác");
        } else {
            products[findIndex].setQuantity(products[findIndex].getQuantity() - quantityToSell);
            System.out.println("Bán thành công! Số lượng còn lại: " + products[findIndex].getQuantity());
            if (products[findIndex].getQuantity() == 0) {
                products[findIndex].setStatus(1);
            }else{
                products[findIndex].setStatus(0);
            }
        }
    }

    public void statisticProductInCategory(ArrCategories arrCategories) {
        Categories[] categories = arrCategories.getCategories();
        int[] numberProducts = new int[arrCategories.getSize()];

        for (int i = 0; i < sizeProduct; i++) {
            int categoryId = products[i].getCategoryId();

            for (int j = 0; j < arrCategories.getSize(); j++) {
                if (categories[j].getCategoryId() == categoryId) {
                    numberProducts[j]++;
                    break;
                }
            }
        }

        System.out.println("Thống kê số lượng sản phẩm theo danh mục:");
        for (int i = 0; i < arrCategories.getSize(); i++) {
            System.out.printf("Danh mục: %s - Số sản phẩm: %d\n", categories[i].getCategoryName(), numberProducts[i]);
        }
    }

    private boolean duplicateProductId(String productId) {
        for (int i = 0; i < sizeProduct; i++) {
            if (products[i].getProductId().equals(productId)) {
                return true;
            }
        }
        return false;
    }

    private boolean duplicateProductName(String productName) {
        for (int i = 0; i < sizeProduct; i++) {
            if (products[i].getProductName().equals(productName)) {
                return true;
            }
        }
        return false;
    }

    private int findProductById(String productId) {
        for (int i = 0; i < sizeProduct; i++) {
            if (products[i].getProductId().equals(productId)) {
                return i;
            }
        }
        return -1;
    }
}