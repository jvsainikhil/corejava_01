package java_basictoadvance_collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsAndList {

	public static void main(String[] args) {
		//Array List is a class which Implements List
		//Collection is just to fetch values 
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(10); //0
		// object types 
		nums.add(20); //1
		nums.add(30); //2
		nums.add(40); //3
		
		System.out.println(nums.get(2));
		System.out.println(nums.indexOf(40)); //-->gets the index value
		
//		for (int n:nums) {
//			System.out.println(n);
//		}
	}
}




