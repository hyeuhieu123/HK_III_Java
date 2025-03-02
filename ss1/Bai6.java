public class Bai6 {
    /*
* 1. Vai trò
* * JDK:bộ công cụ dành cho lập trình viên Java. Nó bao gồm tất cả những gì cần thiết để phát triển ứng dụng Java,
*   như trình biên dịch (javac), các thư viện chuẩn, công cụ gỡ lỗi và các tiện ích khác.
    Vai trò: Cung cấp môi trường và công cụ phát triển cho các lập trình viên.
* * JRE: môi trường chạy ứng dụng Java, chứa tất cả các thư viện cần thiết và các thành phần hỗ trợ để chạy ứng dụng Java.
    Vai trò: Cung cấp môi trường thực thi cho các ứng dụng Java đã được biên dịch, không bao gồm các công cụ phát triển như trình biên dịch.
* * JVM: một thành phần cốt lõi của JRE, JVM có nhiệm vụ biên dịch bytecode thành mã máy của hệ thống chạy ứng dụng đó giúp Java có thể chạy độc lập với phần cứng cụ thể.
    Vai trò: Thực thi bytecode Java trên nền tảng cụ thể.
* * Mối quan hệ: JDK bao gồm JRE, và JRE chứa JVM. Khi lập trình, bạn cần JDK để phát triển ứng dụng; khi chạy ứng dụng, bạn chỉ cần JRE (và do đó, JVM) để thực thi bytecode.
* 2. Khái niệm
* * Write once, run anywhere" (WORA) là triết lý thiết kế của Java, cho phép:
    Viết mã một lần: Lập trình viên chỉ cần viết mã nguồn Java một lần.
    Chạy ở bất kỳ đâu: Sau khi được biên dịch thành bytecode, chương trình có thể chạy trên bất kỳ nền tảng nào có cài đặt JVM, mà không cần thay đổi hoặc biên dịch lại.
* * Cơ chế hỗ trợ:
    Khi biên dịch, mã nguồn Java được chuyển thành bytecode, một dạng ngôn ngữ trung gian không phụ thuộc vào nền tảng.
    JVM trên mỗi nền tảng sẽ chịu trách nhiệm chuyển đổi bytecode thành mã máy tương ứng với hệ điều hành và kiến trúc phần cứng cụ thể.
    Điều này giúp đảm bảo tính di động và khả năng chạy đồng nhất trên nhiều hệ điều hành khác nhau.
* 3. Cách cài đặt
* Cài đặt IntelliJ IDEA và JDK
    Tải và cài đặt IntelliJ IDEA
    Cài đặt JDK
* Tạo một dự án Java mới
    Mở IntelliJ IDEA và chọn "New Project".
    Chọn "Java" trong danh sách các loại dự án.
    Chọn phiên bản JDK đã cài đặt.
    Đặt tên và chọn vị trí lưu cho dự án.
* Tạo một class chứa phương thức main
* Chạy chương trình
* Kiểm tra và debug
* 4. Các phiên bản java
    bao gồm: Java SE, Java EE và Java ME
* Java SE (Standard Edition):
    Mục đích: Dành cho các ứng dụng desktop, ứng dụng console và các ứng dụng cơ bản.
    Đối tượng hướng đến: Lập trình viên phát triển ứng dụng cơ bản, các ứng dụng server nhỏ và các ứng dụng độc lập.
    Nội dung: Bao gồm các thư viện lõi, API cơ bản của Java và công cụ phát triển.
* Java EE (Enterprise Edition):
    Mục đích: Hỗ trợ phát triển các ứng dụng doanh nghiệp, ứng dụng web quy mô lớn, và các hệ thống phân tán.
    Đối tượng hướng đến: Các nhà phát triển ứng dụng doanh nghiệp, tập trung vào các giải pháp server, web service, giao dịch và bảo mật.
    Nội dung: Bao gồm các API và công nghệ mở rộng như Servlets, JSP, EJB, JPA, và nhiều thành phần khác hỗ trợ xử lý giao dịch, bảo mật và kết nối dữ liệu.
* Java ME (Micro Edition):
    Mục đích: Được thiết kế cho các thiết bị có tài nguyên hạn chế như điện thoại di động, thiết bị nhúng, TV thông minh…
    Đối tượng hướng đến: Các nhà phát triển ứng dụng dành cho các thiết bị di động hoặc nhúng, nơi bộ nhớ, CPU và tài nguyên hệ thống có giới hạn.
    Nội dung: Một bộ API nhỏ gọn, tối ưu hóa cho các thiết bị di động và nhúng với hạn chế về tài nguyên.

*/
}
