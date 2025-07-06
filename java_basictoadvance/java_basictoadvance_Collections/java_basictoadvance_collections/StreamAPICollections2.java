package java_basictoadvance_collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPICollections2 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4, 8, 5, 1);
		nums.forEach(n->System.err.println(n));
		
		Consumer<Integer> com = n -> System.out.println(n);
		nums.forEach(com);
		
//		for(int  i=0;i<nums.size();i++) {
//			System.out.println(nums);
//		}
		
//		for(int n:nums) {
//			System.out.println(n);
//		}
		
//		int sum=0;0
//		for(int n:nums) {
//			if(n%2==0) {
//				n=n*2;
//				sum=sum+n;
//			}
//		}
//		System.out.println(sum);
		
	}
}
