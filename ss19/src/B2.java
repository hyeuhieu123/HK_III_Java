import java.util.function.Function;

public class B2 {
    public static void main(String[] args) {
        Function<Integer,Integer> caculator = x -> x*x + 3*x + 2;
        int f1 = caculator.apply(2);
        int f2 = caculator.apply(1);
        int f3 = caculator.apply(3);

        System.out.println("f1 "+f1);
        System.out.println("f2 " +f2);
        System.out.println("f3 "+f3);
    }
}