package java_basictoadvance_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompatorvsComparable {
	public static void main(String[] args) {

		// This is for last number this is an interface
		// For passing logic
		Comparator<Integer> com = new Comparator<>() {
			@Override
			public int compare(Integer i, Integer j) {
				if (i % 10 > j % 10)
					return 1;
				else
					return -1;
			}
		};

		List<Integer> nums = new ArrayList<>();
		nums.add(21);
		nums.add(25);
		nums.add(92);
		nums.add(44);
		nums.add(13);
		// Collections.sort(nums);// Sorting on entire digit
		// This is for last number
		Collections.sort(nums, com);// pass object
		System.out.println(nums);

		int a = 2, b = 8;
		System.err.println(a % b);
		System.err.println(b % a);
		System.err.println(b / a);
		System.err.println(a / b);
	}
}
