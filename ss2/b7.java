package ss2;

public class b7 {
	public static void main(String[] args) {
		int tong =0;
		for (int i = 1; i <= 60; i++) {
			if(60 % i ==0){
				System.out.println(i);
				tong +=i;
			}
		}
		System.out.println("Tổng từ 1 đến 10 là: " + tong);

	}
}
