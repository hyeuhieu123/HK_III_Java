package ss16.generic;

import java.util.List;

public class GenericDemo {

	public static void main(String[] args) {
		// System.out.println("demo class generic");
		// ClassGeneric<String,String> objStd= new ClassGeneric<>("sv001","nguyen van a");
		// System.out.println("thong tin sv "+ objStd.toString());
		// ClassGeneric<Integer,String> objBook= new ClassGeneric<>(1,"nguyen van a");

		System.out.println("demo method arr");
		String[] str = {"hieu","nguyen"};
		MethodGeneric.printArr(str);


		List<String> listString =List.of("hello","asdf");
		// public static void printData(List<?> listData){
		// 	// ? la bat cu kieu du lieu nao
		// 	for(Obj obj : listData){
		// 		System.out.println(obj);

		// 	}
		// }
		int[] arr = {1,2,3,4};
		for(int e  : arr){
			System.err.println(e);
		}
	}
}
