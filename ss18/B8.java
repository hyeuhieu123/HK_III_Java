package ss18;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("nhap so");
        int num = sc.nextInt();
        if ( num > 10) {
            System.out.println("ko hop le");
            return;
        }
        Map<Integer, String> map = new LinkedHashMap<>();
      
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        // for (Map.Entry<Integer, String> entry : map.entrySet()) {
        //     System.out.println(entry);
        // }
        String result = "";
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            while (num >= entry.getKey()) { 
                result += entry.getValue();
                num -= entry.getKey();      
            }
        }

        System.out.println("result " + result);
    }
}