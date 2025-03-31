package ss21;

import java.util.Scanner;

public class B2 {
	public static void main(String[] args) {
		try {
			int [] arr={1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.println(arr[sc.nextInt()]);
		
		} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println(ex.getMessage());
		}
	}
}
