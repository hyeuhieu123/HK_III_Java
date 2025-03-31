package ss22;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class B1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap chuoi ");
			File file = new File("output.txt");
			try {
				file.createNewFile();
				Files.writeString(Paths.get("output.txt"), sc.nextLine());
				System.out.println(Files.readString(Paths.get("output.txt")));

			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		}
}
