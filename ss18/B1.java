package ss18;

import java.util.HashMap;
import java.util.Map;

public class B1 {
	public static void main(String[] args) {
		String find="a";
		Map<String,Integer> map = new HashMap<>();
		map.put("a", 4);
		map.put("e", 10);
		map.put("b", 5);
		map.put("c", 7);
		map.put("d", 8);

		for(Map.Entry<String,Integer> entry : map.entrySet()){
			System.out.println( "key " + entry.getKey()+" diem "+ entry.getValue() );
		}
		for(Map.Entry<String,Integer> entry : map.entrySet()){
					if (entry.getKey() == find) {
						System.out.println("tim ");
						System.out.println( "key " + entry.getKey()+" diem "+ entry.getValue() );
					}
		}
		
	}
	
}
