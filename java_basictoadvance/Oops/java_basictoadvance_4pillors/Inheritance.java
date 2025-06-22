package java_basictoadvance_4pillors;

class A{
	
	public  A() { // default constructor
		System.out.println("is a default constructor");
	}
	public void show() { // method is going to have a return type 
		System.out.println("in A show");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		new A();// This is anonymous object
		// we have created an object 
		/* int marks; marks = 100;
		 * 
		 * A obj; // reference obj= new A(); 
		 * // create the object obj.show();
		 */
		new A().show();
		/*
		 * is a default constructor 
		 * in A show
		 */
		new A().show();	
		/*
		 * is a default constructor 
		 * in A show
		 */
		//-------------------------------------
		/*
		 * output: 
		 * is a default constructor 
		 * is a default constructor 
		 * in A show is a
		 * default constructor in A show
		 */

	}
}
