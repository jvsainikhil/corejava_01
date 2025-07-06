package java_basictoadvance_collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPICollections2ExplainReduce {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4, 8, 5, 1);
		
				
		Stream<Integer> sortvalues = nums.stream()
				.filter(n -> n % 2 == 0) 
				.sorted();
		sortvalues.forEach(n-> System.err.println(n));
				//.map(n -> n * 2)
				//if we want to add value 0+4,
				//carry element
				//.reduce(0, (c, e) -> c + e);
		
		//System.out.println(result);
		
	}
}


