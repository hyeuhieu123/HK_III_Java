package ss3;

import java.util.Scanner;

public class B4 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int date =sc.nextInt();

        switch (date){
            case 1 -> System.out.println("cn");
            case 2 -> System.out.println("t2");
            case 3 -> System.out.println("t3");
            case 4 -> System.out.println("t4");
            case 5 -> System.out.println("t5");
            case 6 -> System.out.println("t6");
            case 7 -> System.out.println("t7");
            default -> System.out.println("ko hop le");


        }
    }
}
