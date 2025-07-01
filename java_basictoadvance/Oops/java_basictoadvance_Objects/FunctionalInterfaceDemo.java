package java_basictoadvance_Objects;

@FunctionalInterface
interface use {
	void show();
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
//This is java-8 --> to reduce the lines --> Lamdaexpression
public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
//		use obj = new use() {//<------we know this
//			public void show() {//<---we know this
		use obj = () -> System.out.println("i'm using this");
		obj.show();
	}
}
