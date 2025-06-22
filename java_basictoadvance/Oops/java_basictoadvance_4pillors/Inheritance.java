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
		int marks;
		marks = 100;
		
		A obj; // reference 
		obj= new A(); // create the object 
		obj.show();
	}
}
