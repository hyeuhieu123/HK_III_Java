package ss18;

import java.util.HashMap;
import java.util.Map;

public interface B2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("ip",10);
		map.put("Laptop",14);
		map.put("desk",100);
		
		for(Map.Entry<String,Integer> entry : map.entrySet()){
			if(map.containsKey("Laptop")){
				System.out.println("co laptop");
				break;
			}
		}

		boolean isFound = false;
		for(Map.Entry<String,Integer> entry : map.entrySet()){
				if(entry.getValue()==1000){
					isFound=true;
					break;
				}
		}
		if(isFound) System.out.println("co san pham bang 1000");
		else System.out.println("ko co san pham bang 1000");
		
	}
	
}
