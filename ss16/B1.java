package ss16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class B1 {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>(Arrays.asList("hieu", "trung", "nguyen"));
        System.out.println("Vòng lặp for:");
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i));
        }
        System.out.println("Vòng lặp foreach:");
        for(String student : studentNames) {
            System.out.println(student);
        }
        System.out.println("Iterator:");
        Iterator<String> iterator = studentNames.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}