package optional;

import java.util.Optional;

public class Demo {
	public static void main(String[] args) {
		//1 khoi tao optional
		Optional<String> optionalStr = Optional.of("k223b");
		Optional<String> optionalStr2 = Optional.empty();
		Optional<String> optionalStr3 = Optional.ofNullable(null);
		System.out.println(optionalStr.get());
		System.out.println(optionalStr2.isPresent());
		System.out.println(optionalStr3.isPresent());
	}	
}
