package ss3;

import java.util.Scanner;

public class B2 {
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int temp=a;
        if(a == b && b==c){
            System.out.println("ba so giong nhau");

        }else if (temp <b) temp =b ;

        if(temp<c) temp=c;
        System.out.println("so lon nhat " + temp);
        /// ////////
        int test = Math.max(a,Math.max(b,c));
        System.out.println(test);


    }
}
