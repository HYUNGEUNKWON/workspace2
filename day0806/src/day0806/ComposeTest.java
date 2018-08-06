package day0806;

import java.util.function.Function;

public class ComposeTest {

	public static void main(String[] args) {
		Function<Integer, String> f1 = (Integer data)->Integer.toBinaryString(data);
		
		Function<String, Integer> f2 = (String a)->Integer.parseInt(a);
		
		Function<Integer, Integer> f3 = f2.compose(f1);
		int result = f3.apply(10);
		System.out.println(result + 1);
		
		
	}

}
