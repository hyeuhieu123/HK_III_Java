package ss5;

import java.util.Scanner;

public class B6 {
	public static void main(String[] args) {
        int[] markingArray = new int[1000];
        int[] originalArray = {10, 20, 30, 40, 50, 10, 20, 60, 70, 80, 90, 100, 10, 20, 30, 40, 50, 60, 70, 80};

        for (int i = 0; i < originalArray.length; i++) {
            int value = originalArray[i];
            markingArray[value - 1]++;
        }

        int maxFrequency = 0;
        for (int i = 0; i < markingArray.length; i++) {
            if (markingArray[i] > maxFrequency) {
                maxFrequency = markingArray[i];
            }
        }

        for (int i = 0; i < markingArray.length; i++) {
            if (markingArray[i] == maxFrequency) {
                System.out.println("Phần tử: " + (i + 1) + ", Số lần xuất hiện: " + maxFrequency);
            }
        }
    }
}