package ss4;
import java.util.Scanner;
public class B4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		int tong =0;
		
		while(true){
				n=sc.nextInt();
				tong +=n;
				if(n==0)break;

		}
		System.out.println(tong);
		
	}
	
}
