package ss10;
class Person {
    private String name;
    private int age;

   /*
                    1. tính đóng gói là gì? tại sao tính đóng gói lại quan trọng trong lập trình đối tượng?
                định nghĩa:
                tính đóng gói (encapsulation) là nguyên tắc trong lập trình hướng đối tượng (oop), giúp bảo vệ dữ liệu bên trong đối tượng và chỉ cho phép truy cập thông qua các phương thức cụ thể.
                tầm quan trọng:

                bảo vệ dữ liệu: ngăn chặn việc thay đổi dữ liệu trực tiếp từ bên ngoài.
                kiểm soát truy cập: chỉ cho phép các thao tác hợp lệ thông qua getter và setter.
                tăng tính bảo trì: giúp thay đổi nội bộ lớp mà không ảnh hưởng đến code bên ngoài.
                đóng gói logic: giới hạn phạm vi truy cập, giúp quản lý dễ dàng hơn.
                2. làm thế nào để áp dụng tính đóng gói trong java?
                sử dụng từ khóa private để ẩn dữ liệu của lớp.
                cung cấp phương thức getter để lấy dữ liệu.
                cung cấp phương thức setter để thay đổi dữ liệu, có thể thêm kiểm tra hợp lệ.
                getter & setter hoạt động như thế nào?

                getter: chỉ trả về giá trị thuộc tính, không cho phép thay đổi.
                setter: kiểm tra điều kiện trước khi gán giá trị mới.
                4. lợi ích của tính đóng gói
                bảo vệ dữ liệu: tránh sửa đổi trực tiếp từ bên ngoài.
                kiểm soát quyền truy cập: chỉ cho phép thay đổi dữ liệu theo cách hợp lệ.
                dễ dàng bảo trì: thay đổi logic bên trong mà không ảnh hưởng đến bên ngoài.
                tăng tính an toàn: tránh lỗi do truy cập không hợp lệ.

    */
    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Tuổi không hợp lệ!");
        }
    }
}
public class B1 {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
