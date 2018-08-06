package day0806;

import java.util.function.Consumer;
import java.util.function.Function;

public class AndThenTest {

	public static void main(String[] args) {
		/*Consumer<String> s1 = (String name)->System.out.println(name);
		Consumer<String> s2 = (String addr)->System.out.println("aaa");
		
		
		s1.accept("hello");
		s2.accept("hello2");
		
		s1.andThen(s2);*/
		
		Function<Integer, String> f1 = (Integer data)-> Integer.toBinaryString(data);
		Function<String, Integer> f2 = (String data) -> Integer.parseInt(data);
		
		Function<Integer, Integer> f3 = f1.andThen(f2);
		int su = f3.apply(10);
		System.out.println(su+1);
		
		
		
		
		
	}

}
