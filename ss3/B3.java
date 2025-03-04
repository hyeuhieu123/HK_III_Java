package ss3;
import java.util.Scanner;
public class B3 {
    public static void main(String [] args){
        double dtb = 0;
        Scanner sc = new Scanner(System.in);

        do{
            dtb=sc.nextDouble();
            if(dtb <0 || dtb >10){
                System.out.println("ko hop le");
                break;
            }

            if (dtb>8.5) System.out.println("gioi");
            else if(dtb >6.5) System.out.println("kha");
            else if(dtb >5) System.out.println("tb");
            else System.out.println("yeu");

        }while(true);

    }
}
