package ss22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class B3 {
		public static void main(String[] args) {
			try {
			String input =	Files.readString(Paths.get("input.txt"));
			// System.out.println(input);
			 Files.writeString(Paths.get("copy.txt"), input);

			 System.out.println(Files.readString(Paths.get("copy.txt")));
			} catch (IOException e) {
				// TODO: handle exception
			}
		}
}
