package ss20;

import java.util.Arrays;

public class B2 {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,6,7,8,9};
    ;
    System.out.println(Arrays.stream(arr).filter(e -> e %2 !=0).reduce(0,(a, b) ->a+b ));
    }
}
