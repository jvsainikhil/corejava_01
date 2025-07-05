package java_basictoadvance_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SetinJava {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(1);

		for (Object i : nums) {
			System.out.print(i + " ");
		}
	}
}
