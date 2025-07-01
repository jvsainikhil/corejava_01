package java_basictoadvance_Objects;

@FunctionalInterface
interface use {
	void show(int i);
}
//class nikhil implements use --> --------> {
//
//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		System.out.println("i'm using this");
//	}
//	
//} <------------- <------------ <-------- <--
//This is java-8
public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		// no need to do (int i) aslo
		use obj = i -> System.out.println("i'm using this");
		obj.show(5);
	}
}
