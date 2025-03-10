package ss5;

import java.util.Scanner;

public class B1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("nhập độ dài mảng");
			int n =sc.nextInt();
			int [] numbers = new int [n];
			for(int i = 0 ; i<n;i++){
				numbers[i]=sc.nextInt();
			}
			int max=numbers[0];
			for(int i = 0;i<n;i++){
				if(max<numbers[i]){
					max=numbers[i];
				}
			}
			System.out.println("max "+max);


		}
}
