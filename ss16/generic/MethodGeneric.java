package ss16.generic;

public class MethodGeneric {
	public  static <T> void printArr(T[] arr){
		for(T element : arr){
			System.out.println("hello " +element );
		}
	}
}
