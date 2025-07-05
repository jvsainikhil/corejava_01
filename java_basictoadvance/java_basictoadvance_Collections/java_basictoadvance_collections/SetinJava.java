package java_basictoadvance_collections;

import java.util.Collection;
import java.util.TreeSet;

public class SetinJava {

	public static void main(String[] args) {
		Collection<Integer> nums = new TreeSet<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(4);
		nums.add(3);
		nums.add(4);
		nums.add(1);
//o/p:1 2 3 4  --> no multiple values, we will not have get,
		//in soreted way we will be getting the values
		for (int i : nums) {
			System.out.print(i);
		}
	}
}
