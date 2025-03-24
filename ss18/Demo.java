package ss18;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("a",2);
		map.put("b",1);
		map.put("c",3);


		for(Map.Entry<String,Integer> entry : map.entrySet()){
			System.out.println(entry.getKey() + entry.getValue());

		}


		
	}
}
