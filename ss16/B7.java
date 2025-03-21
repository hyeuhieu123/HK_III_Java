package ss16;
import java.util.*;
public class B7 {
    public static void main(String[] args) {
        // Tạo danh sách ArrayList chứa các số nguyên
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1, 9, 10, 10, 5));

        // Sử dụng HashMap để đếm số lần xuất hiện của mỗi phần tử
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Danh sách phần tử xuất hiện đúng một lần
        System.out.println("Các phần tử xuất hiện đúng một lần:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }

        System.out.println("\n\nCác phần tử bị trùng lặp và số lần xuất hiện:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Số " + entry.getKey() + " xuất hiện " + entry.getValue() + " lần");
            }
        }
    }
}