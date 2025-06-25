package java_basictoadvance_4pillors;

//DynamicMethodDispatch
class AComputer{
	public void show() {
		System.out.println("in A show");
	}
}
class Laptop extends AComputer{
	public void show() {
		System.out.println("in B show");
	}
}
class Desktop extends AComputer{
	public void show() {
		System.out.println("in C show");
	}
}

public class RuntimePolymorphism_DynamicMethodDispatch {
	public static void main(String[] args) {
		AComputer obj = new AComputer(); // object as a computer //only when we have this it will work
		obj.show();
		
		obj = new Laptop();
		obj.show();
		
		
		obj = new Desktop();
		obj.show();
		/*
		 * output: 
		 * in A show 
		 * in B show
		 * in c show
		 * 
		 */
	}
}
