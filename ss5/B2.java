package ss5;
import java.util.Scanner;
public class B2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập độ dài mảng");
		int n = sc.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int sum =0;
		for(int i=0;i<n;i++){
			sum +=arr[i];
		}
		System.out.println("sum "+sum);
		
	}
}
