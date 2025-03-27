package ss19;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student{
    private String name;
    private String major;
    private double score;
    public Student(String name, String major, double score) {
        this.name = name;
        this.major = major;
        this.score = score;
    }
    public String getMajor() {
        return major;
    }
    
    
}
public class B8 {
    public static void main(String[] args) {
        List<Student> students = List.of(

            new Student("Quý", "IT", 8.5),

            new Student("Lan", "Business", 7.2),

            new Student("Minh", "IT", 9.0),

            new Student("Huyền", "Design", 6.8),

            new Student("Long", "IT", 7.9),

            new Student("Trang", "Business", 8.1),

            new Student("Việt", "IT", 8.0),

            new Student("Tú", "Design", 7.5),

            new Student("Phúc", "Business", 6.9),

            new Student("An", "AI", 9.5)

           
        ); 
        Map<String,Long> maps = new HashMap<>();

        for(Student std : students){
            String major = std.getMajor();
            if(maps.containsKey(major)){
                maps.put(major, maps.get(major)+1);
            }else
            maps.put(major, 1L);
        }
        
        for(Map.Entry<String,Long> entry : maps.entrySet()){
            System.out.println(entry);
          }
    }
}
