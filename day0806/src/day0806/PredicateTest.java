package day0806;

import java.util.function.IntPredicate;

public class PredicateTest {

	public static void main(String[] args) {
		IntPredicate ipd = (int su)-> su>=50? true:false;
		
		boolean result = ipd.test(80);
		System.out.println(result);
	}

}
