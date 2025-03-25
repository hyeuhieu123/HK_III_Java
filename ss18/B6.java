package ss18;

import java.util.HashMap;
import java.util.Map;

public class B6 {
    public static void main(String[] args) {
        Map<String, Double> students = new HashMap<>();

        students.put("A", 8.5);
        students.put("B", 4.5);
        students.put("C", 6.0);
        students.put("D", 9.0);
        students.put("T", 3.5);
        students.put("H", 7.0);
        students.put("I", 5.0);
        students.put("E", 2.5);
        students.put("U", 6.5);
        students.put("Z", 8.0);

    
        System.out.println("ds ban  dau");
        for (String name : students.keySet()) {
            System.out.println("ten " + name + "  diem" + students.get(name));
        }
        double totalScore = 0;
        for (double score : students.values()) {
            totalScore += score;
        }
        double averageScore = totalScore / students.size();
        System.out.println("diem tb tat ca hs "+averageScore);
        Map<String, Double> newStudents = new HashMap<>();
        for (String name : students.keySet()) {
            if (students.get(name) >= 5.0) {
                newStudents.put(name, students.get(name));
            }
        }
        System.out.println("ds sau khi loc");
        for (String name : newStudents.keySet()) {
            System.out.println("ten " + name + "  diem" + students.get(name));
        }
    }


    }
