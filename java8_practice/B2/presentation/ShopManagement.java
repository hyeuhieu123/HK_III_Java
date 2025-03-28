package presentation;

import entity.Customer;
import entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import business.CustomerBusiness;
import business.OrderBusiness;

public class ShopManagement {
    public static final List<Customer> listCustomers = new ArrayList<Customer>();
    public static final List<Order> listOrders = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("------------------------MENU------------------------");
            System.out.println("1. Quản lí khách hàng");
            System.out.println("2. Quản lí đơn hàng");
            System.out.println("3. Thoát");
            System.out.printf("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("***********************CUSTOMER MENU******************");
                        System.out.println("1. Danh sách khách hàng");
                        System.out.println("2. Thêm mới khách hàng");
                        System.out.println("3. Thoát");
                        System.out.printf("Lựa chọn cua bạn: ");

                        int choice2 = Integer.parseInt(sc.nextLine());

                        if(choice2 == 3){
                            break;
                        }

                        switch (choice2) {
                            case 1:
                                CustomerBusiness.displayCustomers();
                                break;
                            case 2:
                                CustomerBusiness.addCustomer(sc);
                                break;
                            default:
                                System.err.println("Vui lòng chọn lại từ 1 - 3");
                        }
                    }
                    break;
                case 2:
                    OrderBusiness orderBusiness = new OrderBusiness();
                    while (true) {
                        System.out.println("***********************ORDER MENU**********************");
                        System.out.println("1. Danh sách đơn hàng");
                        System.out.println("2. Thêm mới đơn hàng");
                        System.out.println("3. Cập nhật trạng thái đơn hàng");
                        System.out.println("4. Danh sách đơn hàng quá hạn");
                        System.out.println("5. Thống kê số lượng đơn hàng đã giao (Trạng thái true)");
                        System.out.println("6. Tính tổng doanh thu các đơn hàng đã giao");
                        System.out.println("7. Thoát");
                        System.out.printf("Lựa chọn của bạn: ");

                        int choice3 = Integer.parseInt(sc.nextLine());

                        if(choice3 == 7) {
                            break;
                        }

                        switch (choice3) {
                            case 1:
                                orderBusiness.displayOrders();
                                break;
                            case 2:
                                orderBusiness.addOrder(sc);
                                break;
                            case 3:
                                orderBusiness.updateOrderStatus(sc);
                                break;
                            case 4:
                                orderBusiness.getOrderOverdue();
                                break;
                            case 5:
                                orderBusiness.getOrderDelivied();
                                break;
                            case 6:
                                break;
                            default:
                                System.err.println("Vui lòng chọn lại ừ 1 - 7");
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn lại từ 1 - 3");
            }
        } while (true);
    }
}
