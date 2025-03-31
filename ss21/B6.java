package ss21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n");
		int n =Integer.parseInt(sc.nextLine());
		String[] arr = new String[n];
		int countValid=0;
		int countInvalid=0;
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextLine();
		}
		
			List<Integer> arrN = new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
				try {
					int o=Integer.parseInt(arr[i]);
					arrN.add(o); 
					countValid++;
				} catch (NumberFormatException e) {
					countInvalid++; 
	
				}
			}
	
		System.out.println("hop le "+countValid);
		System.out.println("ko hop le "+countInvalid);
		for (Integer num : arrN) {
				System.out.println(num);
		}

	}
	
}
