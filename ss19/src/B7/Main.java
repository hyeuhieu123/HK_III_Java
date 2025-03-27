package B7;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(-1,-2 ,-3 ,1, 2);
        ListProcessor checkNumber = new ListProcessorImpl();
        if(checkNumber.containsNegative(arrayList)) {
            System.out.println("danh sach  so am");
        }else {
            System.out.println("danh sach so duong");
        }
    }
}