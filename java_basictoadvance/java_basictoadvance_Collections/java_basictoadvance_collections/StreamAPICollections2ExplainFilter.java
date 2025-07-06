package java_basictoadvance_collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPICollections2ExplainFilter {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4, 8, 5, 1);
		
		Predicate<Integer> p= n -> n%2==0; //--FINAL_01
		;
		
		int result = nums.stream()
				.filter(n -> n % 2 == 0) //--FINAL_01
				.map(n -> n * 2)
				.reduce(0, (c, e) -> c + e);
		
		System.out.println(result);
	}
}
