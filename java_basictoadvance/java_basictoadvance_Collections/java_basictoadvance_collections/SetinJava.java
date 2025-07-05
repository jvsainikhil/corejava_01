package java_basictoadvance_collections;

import java.util.HashSet;
import java.util.Set;

public class SetinJava {

	public static void main(String[] args) {
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(4);
		nums.add(3);
		nums.add(4);
		nums.add(1);
//o/p:1 2 3 4  --> no multiple values, we will not have get
		for (int i : nums) {
			System.out.print(i);
		}
	}
}
