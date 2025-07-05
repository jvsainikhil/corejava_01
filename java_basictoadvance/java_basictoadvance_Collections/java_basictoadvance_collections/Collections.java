package java_basictoadvance_collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {

	public static void main(String[] args) {
		//Array List is a class which Implements List
		//Collection is just to fetch values 
		Collection<Integer> nums = new ArrayList<Integer>();
		nums.add(10); // object types
		nums.add(20);
		nums.add(30);
		nums.add(40);
		//nums.add("nki");
		
		for (int n:nums) {
			System.out.println(n);
		}
	}
}




