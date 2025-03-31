package ss21;

public class B3 {
	public static void main(String[] args) {
			checkAge(19);



	}
	public static void checkAge(int age)  {
		if(age<18){
			throw new IllegalArgumentException("Bạn chưa đủ 18 tuổi!");
		}else System.out.println("chao mung ban");
	}
}
