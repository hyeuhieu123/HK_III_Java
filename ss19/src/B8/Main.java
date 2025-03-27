package B8;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 3);

        ListProcessor newList = new ListProcessorImpl();
        System.out.println("cac so le ");
        newList.printList(list);
        int sum = newList.sumOddNumbers(list);
        System.out.println(+ sum);

    }
}