package java_basictoadvance_Objects;

//A class inside a class 
class Aa {
	void show() {
		System.out.println("in Aa");
	}
}

//class Bb extends Aa{  //if this is "using only" once then
//	void show() {
//		System.out.println("in Bb");
//	}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Aa obj = new Aa()// if this is "using only once" then
		{ // with out creating a new class
			@Override
			void show() {
				System.out.println("in new Bb");
			}
		};
		obj.show(); // calls the override one
	}
}
