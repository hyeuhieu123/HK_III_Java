package ss16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class B8 {
    public static void main(String[] args) {
        // Tạo danh sách ArrayList chứa các chuỗi ký tự
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(
                "apple", "banana", "kiwi", "cherry", "grape", "fig", "date", "mango", "apricot"
        ));

        // Hiển thị danh sách ban đầu
        System.out.println("Danh sách ban đầu:");
        for (String s : strings) {
            System.out.println(s);
        }

        // Sắp xếp danh sách theo độ dài tăng dần, nếu bằng nhau thì theo thứ tự từ điển
        strings.sort(Comparator.comparingInt(String::length).thenComparing(String::compareTo));

        // Hiển thị danh sách sau khi sắp xếp
        System.out.println("\nDanh sách sau khi sắp xếp:");
        for (String s : strings) {
            System.out.println(s);
        }
    }
}