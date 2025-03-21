package ss16;
import java.util.ArrayList;
import java.util.List;
public class sosanhtocdochay {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        long start, end;

        // do vong lap for truyen thong
        start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("thoi gian vong lap for truyen thong: " + (end - start) + " ms");

        // do vong lap for-each
        start = System.currentTimeMillis();
        for (int x : list) {
        }
        end = System.currentTimeMillis();
        System.out.println("thoi gian vong lap for-each: " + (end - start) + " ms");

        // do vong lap iterator
        start = System.currentTimeMillis();
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            int x = iterator.next();
        }
        end = System.currentTimeMillis();
        System.out.println("thoi gian vong lap iterator: " + (end - start) + " ms");

        // do vong lap stream
        start = System.currentTimeMillis();
        list.stream().forEach(x -> {});
        end = System.currentTimeMillis();
        System.out.println("thoi gian vong lap stream: " + (end - start) + " ms");

        // do vong lap parallel stream
        start = System.currentTimeMillis();
        list.parallelStream().forEach(x -> {});
        end = System.currentTimeMillis();
        System.out.println("thoi gian vong lap parallel stream: " + (end - start) + " ms");
    }
}