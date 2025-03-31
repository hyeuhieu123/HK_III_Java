package ss22;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
 class Country {
	private int id;
	private String code;
	private String name;
public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + code + " - " + name;
    }
}
public class B7 {
	public static void main(String[] args) {
		File file = new File("text.txt");
		try {
			file.createNewFile();
		List<String> list= Files.readAllLines(Paths.get("text.txt"));
		List<Country> country = new ArrayList<>();
		// System.out.println(list);
			for (String e : list) {
				// System.out.println(e);
			String part[] = e.split(",");
				if(part.length ==3){
						country.add(new Country(Integer.parseInt(part[0]),part[1],part[2]));
				}
		}
		for (Country c : country ) {
				System.out.println(c);
		}
			

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
