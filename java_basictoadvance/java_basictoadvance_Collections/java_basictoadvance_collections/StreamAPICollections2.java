package java_basictoadvance_collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPICollections2 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4, 8, 5, 1);// original values

		// once we use it we cannot use it again this is an interface
		// all operations can be performed here s1
		
		/* In one line we can write this */
//		Stream<Integer> s1 =nums.stream(); //we will get all the values on s1
//		Stream<Integer> s2 = s1.filter(n -> n%2==0);
//		Stream<Integer> s3 = s2.map(n -> n*2);
//		int result=s3.reduce(0,(c,e)-> c+e);
		
		int result = nums.stream()
				.filter(n -> n % 2 == 0)
				.map(n -> n * 2)
				.reduce(0, (c, e) -> c + e);
		
		System.out.println(result);
		// s3.forEach(n -> System.out.println(n));

		/*
		 * we can use only once output: 4 8 5 1 Exception in thread "main"
		 * java.lang.IllegalStateException: stream has already been operated upon or
		 * closed at java.base/java.util.stream.AbstractPipeline.sourceStageSpliterator(
		 * AbstractPipeline.java:279) at
		 * java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.
		 * java:762) at java_basictoadvance_collections.StreamAPICollections2.main(
		 * StreamAPICollections2.java:17)
		 */
	}
}
