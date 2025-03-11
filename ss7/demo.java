package ss7;

public class demo {
	public static void main(String[] args) {
		// khai bao chuoi rikkei academy la string builder
		StringBuilder raBuilder=new StringBuilder("rikkei academy");
		raBuilder.append(" - Học viện đào tạo công nghệ thông tin");
		System.out.println(raBuilder);
		raBuilder.insert(7,"education");
		System.out.println(raBuilder);
	}
}
