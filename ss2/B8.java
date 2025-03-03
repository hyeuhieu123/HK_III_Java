package ss2;
import java.util.Scanner;

public class B8 {
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String maSinhVien, hoTen, ngaySinh, soDienThoai;
        int gioiTinh;
        double toan, vatLy, hoaHoc, sinhHoc, ngoaiNgu, diemTrungBinh;

        System.out.print("Nhập mã sinh viên: ");
        maSinhVien = scanner.nextLine();

        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();

        System.out.print("Nhập số điện thoại: ");
        soDienThoai = scanner.nextLine();

        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        ngaySinh = scanner.nextLine();

        System.out.print("Nhập giới tính sinh viên (1: Nam, 0: Nữ): ");
        gioiTinh = scanner.nextInt();

        System.out.print("Nhập điểm Toán: ");
        toan = scanner.nextDouble();

        System.out.print("Nhập điểm Vật lý: ");
        vatLy = scanner.nextDouble();

        System.out.print("Nhập điểm Hóa học: ");
        hoaHoc = scanner.nextDouble();

        System.out.print("Nhập điểm Sinh học: ");
        sinhHoc = scanner.nextDouble();

        System.out.print("Nhập điểm Ngoại ngữ: ");
        ngoaiNgu = scanner.nextDouble();

        diemTrungBinh = (toan + vatLy + hoaHoc + sinhHoc + ngoaiNgu) / 5;

        System.out.println("\n===== THÔNG TIN SINH VIÊN =====");
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Số điện thoại: " + soDienThoai);

        System.out.println("\n===== BẢNG ĐIỂM =====");
        System.out.println("Toán: " + toan);
        System.out.println("Vật lý: " + vatLy);
        System.out.println("Hóa học: " + hoaHoc);
        System.out.println("Sinh học: " + sinhHoc);
        System.out.println("Ngoại ngữ: " + ngoaiNgu);
        System.out.printf("Điểm trung bình: %.2f\n", diemTrungBinh);
        scanner.close();
    }
}
