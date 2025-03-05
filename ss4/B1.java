package ss4;
import java.util.Scanner;
public class B1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=0){
			System.out.println("ko hop le");
			return;
		}
		int tong=0;
		for(int i = 1;i<=n;i++){
			tong+=i;
		}
		System.out.println("tổng: "+ tong);


	}
	
}
