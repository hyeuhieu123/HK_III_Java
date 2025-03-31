package ss22;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;



public class B5 {
	public static void main(String[] args) {
		try {
			File file = new File("input5.txt");
		file.createNewFile();
			
			String longestName = Files.readAllLines(Paths.get("input5.txt")).get(0);
			for (String string : args) {
				if(string.length()>longestName.length()){
						longestName=string;
				}
			}
			System.out.println(longestName);
			System.out.println(longestName.length());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
