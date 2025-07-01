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

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		use obj = new use() {//<----- no ;
			public void show() {
				System.out.println("i'm using this");
			}
		};//<----- here we need to keep
		obj.show();
	}
}
