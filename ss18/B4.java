package ss18;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class B4 {
	public static void main(String[] args) {
			Map<String,Integer> map = new TreeMap<>();
		map.put("NV2", 20);
		map.put("NV1", 10);
		map.put("NV5", 55);
		map.put("NV4", 40);
		map.put("NV3", 34);

		for(Map.Entry<String,Integer> entry : map.entrySet()){
			System.out.println(entry);
		}


		map.put("NV3",10);

		//
		map.remove("NV3");
		for(Map.Entry<String,Integer> entry : map.entrySet()){
			System.out.println(entry);
		}

	}
}
