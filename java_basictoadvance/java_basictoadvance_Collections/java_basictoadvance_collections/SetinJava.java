package java_basictoadvance_collections;

import java.util.Collection;
import java.util.Iterator;
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
		
		Iterator<Integer> values = nums.iterator();
		while(values.hasNext())
		System.out.println(values.next());
		//nums.iterator(values);
		//output: 1 2 3 4  
		//No multiple values, we will not have get,
		//In soreted way we will be getting the values
//		for (int i : nums) {
//			System.out.print(i);
//		}
	}
}
