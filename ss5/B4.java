package ss5;

import java.util.Scanner;
import java.util.Arrays;
public class B4 {
	public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
		System.out.println("nhập độ dài mảng");
		int n = sc.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("mảng ban đầu");
		System.out.println(Arrays.toString(arr));

		for(int i =0;i<n/2;i++){
			int temp = arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1] = temp;

		}
		System.out.println("mảng sau khi đảo ngược");
		System.out.println(Arrays.toString(arr));

	}
}
