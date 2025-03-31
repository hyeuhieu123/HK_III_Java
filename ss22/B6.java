package ss22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class B6 {
	public static void main(String[] args) {
		try {
			
			StringBuilder strInput= new StringBuilder(Files.readString(Paths.get("input.txt")));
			Files.writeString(Paths.get("copy.txt"), strInput.reverse());

			System.out.println(Files.readString(Paths.get("copy.txt")));;

		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
