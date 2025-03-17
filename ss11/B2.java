

public class B2 {
	/*
    Định nghĩa
Tính trừu tượng trong lập trình hướng đối tượng là kỹ thuật ẩn giấu các chi tiết triển khai bên trong và chỉ cung cấp những thông tin cần thiết cho người dùng. Điều này giúp đơn giản hóa việc sử dụng các đối tượng và giảm sự phụ thuộc vào cách chúng được thực hiện. Trong Java, tính trừu tượng có thể được thực hiện thông qua **lớp trừu tượng (abstract class)** và **giao diện (interface)**. Mục tiêu chính của tính trừu tượng là làm cho hệ thống dễ hiểu, bảo trì và mở rộng hơn.

Phân tích

1. Tại sao cần tính trừu tượng trong phần mềm phức tạp?
   Trong các phần mềm lớn, tính trừu tượng giúp chia hệ thống thành các phần nhỏ dễ quản lý hơn. Nó giúp lập trình viên tập trung vào chức năng chính của một đối tượng mà không cần quan tâm đến cách nó hoạt động bên trong. Điều này làm tăng khả năng tái sử dụng mã nguồn, giảm sự phụ thuộc giữa các thành phần và giúp phần mềm dễ bảo trì hơn.

2. Sự khác biệt giữa lớp trừu tượng và giao diện trong Java?
   - Lớp trừu tượng (abstract class): Có thể chứa cả phương thức có triển khai và phương thức trừu tượng. Cho phép sử dụng các thuộc tính (biến thành viên) và có thể có constructor.
   - Giao diện (interface): Chỉ chứa các phương thức trừu tượng (từ Java 8 có thể có phương thức mặc định và tĩnh). Không thể có thuộc tính trừu tượng (chỉ có hằng số). Một lớp có thể triển khai nhiều giao diện nhưng chỉ có thể kế thừa một lớp trừu tượng.

Liên hệ thực tế
Một ví dụ điển hình của tính trừu tượng là máy ATM. Người dùng chỉ cần biết cách thực hiện các thao tác như rút tiền, chuyển khoản mà không cần hiểu chi tiết cách ngân hàng xử lý giao dịch bên trong. Tương tự, **điều khiển TV** cho phép người dùng thay đổi kênh, điều chỉnh âm lượng mà không cần biết về mạch điện tử bên trong TV.

     */
}
