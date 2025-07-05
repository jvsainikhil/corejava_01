package java_basictoadvance_collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {

	public static void main(String[] args) {
		Collection<Integer> nums = new ArrayList<Integer>();
		nums.add(10); // object types
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		for (int n :nums) {
			System.out.println(n);
		}
		
		
	}

}
