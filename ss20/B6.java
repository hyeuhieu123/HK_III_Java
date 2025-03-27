package ss20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B6 {
    public static void main(String[] args) {
         List<String> items = List.of("apple", "banana", "apple", "orange", "banana", "apple");

         Map<String,Integer> maps = new HashMap<>();
         
        for(String str : items){
            if(maps.containsKey(str)){
                maps.put(str,maps.get(str)+1);
            }else{
                maps.put(str, 1);
            }
        }
        System.out.println("thoi diem xu ly "+LocalDateTime.now());
      for(Map.Entry<String,Integer> entry : maps.entrySet()){
        System.out.println(entry);
      }
    
    }
}
