package java_basictoadvance_exception;

class A {
	public void show() throws ClassNotFoundException {
		//try {
			Class.forName("ExceptionThrowsUsage");
	//	} catch (ClassNotFoundException e) {
			System.out.println("Not able to find the class");
	//	}
	}
}

public class ExceptionThrowsUsage {
	
	static {
		System.out.println("Class Loaded");
	}
	
	public static void main(String[] args) {
		A obj= new A();
		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			Class.forName("Calc");
//		} catch (ClassNotFoundException e) {
//			System.out.println("Not able to find the class" + e);
//		}
	}
}