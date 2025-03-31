package ss22;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class B2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten tep");
		File newFile = new File(sc.nextLine());
		try {
			if(newFile.exists()){
				System.out.println("tep da ton ai");
				
			}else{
				newFile.createNewFile();
			} 

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
