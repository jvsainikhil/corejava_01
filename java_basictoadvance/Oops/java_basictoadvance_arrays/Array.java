package java_basictoadvance_arrays;

public class Array {
	 public static void main(String[] args) {
		 //int i=3,j=6,k=4; // if we want to store bunch of values we use array
		 //int num[] = {1,3,3,2,21};
		 int nums[] = new int[4];
		// int b=num.length;
		 //if we are not assigning any thing the default value is 0
		 nums[0]=4;
		 nums[1]=6;
		 nums[2]=5;
		 nums[3]=1;
//		 System.out.println(nums[0]);
//		 System.out.println(nums[1]);
//		 System.out.println(nums[2]);
//		 System.out.println(nums[3]);
		 System.out.println("Original Order:");
	        for (int i = 0; i < nums.length; i++) {
	            System.out.print(nums[i] + " ");
	        }

	        System.out.println("\nReversed Order:");
	        for (int i = /*nums.length*/4 - 1; i >= 0; i--) {
	            System.out.print(nums[i] + " ");
	        }
//	        for (initialization; condition; update) {
//	            // body
//	        }
	 }
}
