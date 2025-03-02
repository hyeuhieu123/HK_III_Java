package ss2;

import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên học sinh: ");
        String studentName = scanner.nextLine();

        System.out.print("Nhập điểm môn thứ nhất: ");
        double score1 = scanner.nextDouble();

        System.out.print("Nhập điểm môn thứ hai: ");
        double score2 = scanner.nextDouble();

        System.out.print("Nhập điểm môn thứ ba: ");
        double score3 = scanner.nextDouble();

        double averageScore = calculateAverage(score1, score2, score3);
        String grade = classifyStudent(averageScore);

        System.out.println("Tên học sinh: " + studentName);
        System.out.println("Điểm trung bình: " + averageScore);
        System.out.println("Xếp loại: " + grade);
    }

    public static double calculateAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }

    public static String classifyStudent(double averageScore) {
        if (averageScore >= 8.0) {
            return "Giỏi";
        } else if (averageScore >= 6.5) {
            return "Khá";
        } else if (averageScore >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }
}
