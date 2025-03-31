package ss22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Product  implements Serializable{
		private int id;
		private String name;
		private double price;
		public Product(int id, String name, double price) {
			this.id = id;
			this.name = name;
			this.price = price;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
		}
		
	
}
public class B8 {
	public static void main(String[] args) {
			File file = new File("product.dat");
			List<Product> list = new ArrayList<>();
			list.add(new Product(1, "laptop", 100));
			list.add(new Product(2, "tai nghe", 150));
			list.add(new Product(3, "ban phim", 200));
			try {
				file.createNewFile();
				FileOutputStream fos = new FileOutputStream("product.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(list);
				//
				FileInputStream fis = new FileInputStream("product.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);	
				List<Product> loadedList = (List<Product>) ois.readObject();
				
				System.out.println("test" + loadedList);
				// In từng sản phẩm ra màn hình
				for (Product p : loadedList) {
					System.out.println(p);
				}
	
			} catch (Exception e) {
				// TODO: handle exception
			}
	}
}
