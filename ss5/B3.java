package ss5;

import java.util.Scanner;

public class B3 {
	public static void main(String [] args){
				Scanner sc = new Scanner(System.in);
		System.out.println("nhập độ dài mảng");
		int n = sc.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int count =0;
		for (int i = 0; i < n; i++) {
			if(arr[i]%2==0){
				count++;
			}
		}
		System.out.println("so luong so chan :"+count);
	}
}
