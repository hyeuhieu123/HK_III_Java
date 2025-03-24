package ss18;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class B3 {
	public static void main(String[] args) {
		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("tv", 1);
		map.put("tu lanh", 2);
		map.put("may tinh", 4);
		map.put("quat", 3);
		map.put("laptop", 5);

		for(Map.Entry<String,Integer> entry : map.entrySet()){
			System.out.println(entry);
		}


		//
		map.put("laptop", 10);
		map.remove("quat");

			for(Map.Entry<String,Integer> entry : map.entrySet()){
			System.out.println(entry);
		}


	}
}
