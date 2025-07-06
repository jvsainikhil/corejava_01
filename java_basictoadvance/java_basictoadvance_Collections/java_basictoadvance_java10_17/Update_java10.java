package java_basictoadvance_java10_17;


// LVIT - Local variable type inference
//These var is only applicable for local variable
public class Update_java10 {
	public static void main(String[] args) {
		int i=20; 
		var j=30; //Assigned at compiler time 
		int c;
		System.out.println(i+j);
	}
}
