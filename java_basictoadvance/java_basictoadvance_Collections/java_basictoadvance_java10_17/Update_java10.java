package java_basictoadvance_java10_17;

// LVIT - Local variable type inference
//These var is only applicable for local variable
public class Update_java10 {
	//var c = 20;// not works
	/*
	 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
	 * at java_basictoadvance_java10_17.Update_java10.main(Update_java10.java:8)
	 */

	public static void main(String[] args) {
		int i = 20;
		var j = 30; // Assigned at compiler time
		var name="Nikhil";
		//int c;
		// var d;// not works
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * Cannot use 'var' on variable without initializer at
		 * java_basictoadvance_java10_17.Update_java10.main(Update_java10.java:11)
		 */
		System.out.println(i + j+"\n"+name);
		
		int nums[] = new int[10];
		
		var nums1 = new int[10];
	}
}
