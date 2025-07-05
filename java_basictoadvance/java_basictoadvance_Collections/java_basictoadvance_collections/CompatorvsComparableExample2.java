package java_basictoadvance_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompatorvsComparableExample2 {
	public static void main(String[] args) {
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
		Collections.sort(nums, com);// pass object
	}
}
