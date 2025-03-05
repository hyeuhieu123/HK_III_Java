package ss4;
import java.util.Scanner;
public class B6 {
	public static void main(String [] args){
		int n=0,m=0,tong=0;	
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		while(n>0){
			m=n%10;
			tong += m;
			n = n/10;
		}
		System.out.println(tong);
	}
}
