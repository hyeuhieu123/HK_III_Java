package ss10;
        /*
         * 
                                    * 1. kế thừa là gì? nó giúp ích gì trong lập trình hướng đối tượng?
                            định nghĩa:
                            kế thừa (inheritance) là cơ chế trong lập trình hướng đối tượng cho phép một lớp (subclass/con) kế thừa thuộc tính và phương thức từ một lớp khác (superclass/cha).
                            lợi ích:

                            tái sử dụng mã nguồn: không cần viết lại code giống nhau cho nhiều lớp.
                            tổ chức và mở rộng chương trình dễ dàng hơn.
                            tăng tính bảo trì: nếu cần sửa đổi, chỉ cần chỉnh trong lớp cha.
                            đa hình (polymorphism): giúp ghi đè phương thức để có hành vi khác nhau trong lớp con.
                                .2
                                Sự khác biệt giữa Kế thừa (Inheritance) và Đóng gói (Encapsulation):

            1. Mục đích:
            - Kế thừa: Tái sử dụng code giữa các lớp.
            - Đóng gói: Bảo vệ dữ liệu, kiểm soát truy cập.

            2. Cách hoạt động:
            - Kế thừa: Lớp con kế thừa thuộc tính/phương thức từ lớp cha.
            - Đóng gói: Dữ liệu được ẩn bằng `private`, truy cập thông qua `getter/setter`.

            3. Quan hệ giữa lớp:
            - Kế thừa: Tạo mối quan hệ "is-a" (VD: Dog **is a** Animal).
            - Đóng gói: Không liên quan đến quan hệ giữa các lớp.

            4. Tính bảo mật:
            - Kế thừa: Không đảm bảo an toàn dữ liệu nếu không kiểm soát hợp lý.
            - Đóng gói: Bảo mật tốt hơn vì dữ liệu chỉ có thể truy cập thông qua phương thức.


                3. ví dụ kế thừa với từ khóa extends
         */
        class Animal {
            String name;
        

            public Animal(String name) {
                this.name = name;
            }
        
      
            public void makeSound() {
                System.out.println("sound");
            }
        }

        class Dog extends Animal {
  
            public Dog(String name) {
                super(name); 
            }
        
   
            @Override
            public void makeSound() {
                System.out.println(name + " says: Woof! Woof!");
            }
        }
public class B2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");

  
        dog.makeSound(); 
    }
}
