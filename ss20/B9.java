package ss20;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

class Order{
    private int id;
    private String customerName;
    private LocalDate createdDate;
    private Optional<LocalDate> deliveryDate;

    public Order(){}

    public Order(int id, String customerName, LocalDate createdDate, LocalDate deliveryDate) {
        this.id = id;
        this.customerName = customerName;
        this.createdDate = createdDate;
        this.deliveryDate = Optional.ofNullable(deliveryDate); 
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public Optional<LocalDate> getDeliveryDate() {
        return deliveryDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public void setDeliveryDate(Optional<LocalDate> deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", customerName=" + customerName + ", createdDate=" + createdDate + ", deliveryDate="
                + deliveryDate.map(LocalDate::toString).orElse("chua giao") + "]";
    }
    
}
public class B9 {
    public static void main(String[] args) {
        List<Order> orders = List.of(

        new Order(1, "Quý", LocalDate.of(2025, 3, 20), LocalDate.of(2025, 3, 25)),
    
        new Order(2, "Lan", LocalDate.of(2025, 3, 21), null),
    
        new Order(3, "Minh", LocalDate.of(2025, 3, 22), LocalDate.of(2025, 3, 23)),
    
        new Order(4, "Huyền", LocalDate.of(2025, 3, 23), null),
    
        new Order(5, "Việt", LocalDate.of(2025, 3, 23), LocalDate.of(2025, 3, 30))
    
    );
    System.out.println("== Danh sách đơn hàng đã giao ==");
orders.stream().filter(o ->o.getDeliveryDate().isPresent()).forEach(   o -> System.out.println(o));

        System.out.println("== Danh sách đơn hàng chưa giao ==");
orders.stream().filter(o ->o.getDeliveryDate().isEmpty()).forEach(   o -> System.out.println(o));

System.out.println("== Số đơn hàng đã giao từ ngày 2025-03-17 đến 2025-03-23 ==");
        
        long count = orders.stream()
        .filter(o -> {
            if (o.getDeliveryDate().isPresent()) {
                return o.getDeliveryDate().get().isAfter(LocalDate.of(2025, 3, 17)) &&
                    o.getDeliveryDate().get().isBefore(LocalDate.of(2025, 3, 23));
            }
            return false; 
        })
        .count();
            

        System.out.println(count);
    }
    
}
