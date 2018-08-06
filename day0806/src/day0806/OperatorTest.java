package day0806;

import java.util.function.IntBinaryOperator;

public class OperatorTest {

	public static void main(String[] args) {
		int[] arr = {20, 60, 40, 100, 10};
		IntBinaryOperator ibo = (int su1, int su2)->(su1>su2)? su1:su2;
		
		int result = arr[0];
		for(int i:arr)
		{
			result = ibo.applyAsInt(result, i);
		}
		System.out.println(result);
	}

}
