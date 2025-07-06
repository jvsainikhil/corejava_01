package java_basictoadvance_collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamAPICollections2ExplainMap {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4, 8, 5, 1);
		
		Function<Integer, Integer> fun= new Function<Integer, Integer>() {
			
			public Integer apply(Integer n) {
				
				return n*2;
			}
		};
		
		int result = nums.stream()
				.filter(n -> n % 2 == 0) 
				.map(fun/* n -> n * 2 */)
				.reduce(0, (c, e) -> c + e);
		
		System.out.println(result);
	}
}
