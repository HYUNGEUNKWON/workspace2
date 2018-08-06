package day0806;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class LamdaTest3 {

	public static void main(String[] args) {
		Supplier<String> s = ()->"hello";
		String name = s.get();
		System.out.println(name);
		
		IntSupplier is = ()->100;
		int age = is.getAsInt();
		System.out.println(age);
	}

}
