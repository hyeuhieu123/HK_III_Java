package ss21.B10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
		List<Product> listProduct = new ArrayList<>();
		listProduct.add(new Product(1, "ban phim", 200.0));
		listProduct.add(new Product(2, "tai nghe", 100.0));
		listProduct.add(new Product(3, "chuot", 500.0));
		
		while (true) {
            System.out.println("\nChọn chức năng:");
            System.out.println("1. Xem danh sách sản phẩm");
            System.out.println("2. Thêm sản phẩm vào giỏ hàng");
            System.out.println("3. Xoá sản phẩm khỏi giỏ hàng");
            System.out.println("4. Xem giỏ hàng");
            System.out.println("5. Hiển thị tổng tiền");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Danh sách sản phẩm có sẵn:");
                    for (Product product : listProduct) {
                        System.out.println(product);
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Nhập mã sản phẩm: ");
                    
                    int productId = Integer.parseInt(sc.nextLine());
                    listProduct.stream().filter(p -> p.getId() == productId).findFirst().ifPresent(p->cart.addToCart(p));
                } catch (Exception e) {
                    System.out.println("nhap ko hop le");
                }
               
                 
                    break;
                case 3:
                    System.out.print("Nhập mã sản phẩm cần xoá: ");
                    int removeId = Integer.parseInt(sc.nextLine());
                    cart.removeFromCart(removeId);
                    break;
                case 4:
                    cart.displayCart();
                    break;
                case 5:
                    cart.checkout();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
