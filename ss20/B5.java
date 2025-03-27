package ss20;

import java.util.List;
import java.util.Optional;

public class B5 {
    public static void main(String[] args) {
          List<Integer> normalList = List.of(10, 5, 8, 20, 7);
        List<Integer> singleElementList = List.of(10);
        List<Integer> allSameList = List.of(10, 10, 10);
        findSecond(normalList);
        findSecond(singleElementList);
        findSecond(allSameList);


    }
    public static void findSecond(List<Integer> list){
        Optional<Integer> second =list.stream().distinct().sorted((o1, o2) ->o2-o1 ).skip(1).findFirst();
        if(second.isPresent()){
            System.out.println(second.get());
        }else System.out.println("ko thay");
        

    }
}
