import java.util.Scanner;

public class b7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giờ, phút, giây ban đầu: ");
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();

        System.out.print("Nhập số giờ, phút, giây cần cộng thêm: ");
        int addHour = sc.nextInt();
        int addMinute = sc.nextInt();
        int addSecond = sc.nextInt();

        int newSecond = second + addSecond;
        int newMinute = minute + addMinute + (newSecond >= 60 ? newSecond / 60 : 0);
        newSecond = newSecond % 60;

        int newHour = hour + addHour + (newMinute >= 60 ? newMinute / 60 : 0);
        newMinute = newMinute % 60;

        System.out.printf("Thời gian sau khi cộng: %02d:%02d:%02d\n", newHour, newMinute, newSecond);
    }
}
