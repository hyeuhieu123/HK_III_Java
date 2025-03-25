package ss18;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class B5 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("tv", 1000);
		map.put("tu lanh", 15000);
		map.put("quat", 1800);
		map.put("may tinh", 800);
		map.put("laptop", 2000);
		// for(Map.Entry<String,Integer> entry : map.entrySet()){
		// 	if(entry.getValue()>= 500 && entry.getValue() <=1500){
		// 			System.out.println("ten sp: " +entry );
		// 	}
		// }
		 TreeMap<Integer, String> newMap = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 500 && entry.getValue() <= 1500){
                newMap.put(entry.getValue(), entry.getKey());
            }
        }
        for (Map.Entry<Integer, String> entry : newMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
	}
}
