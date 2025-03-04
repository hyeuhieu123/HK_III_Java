package ss3;

import java.util.Scanner;

public class B1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = 0 ;
        do {
            n = sc.nextInt();
            if(n==0){
                System.out.println("ko phai chan le");
            }else if(n%2 ==0) System.out.println("chan");
            else System.out.println("le");
        }while (n!=0);

    }
}
