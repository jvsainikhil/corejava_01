package java_basictoadvance_Objects;

//AbstractAnonymousClass we can use for abstract-anon
abstract class Xx {
	abstract void show();
	abstract void game();
}

//class Cc extends Xx{
//	void show() {
//		// TODO Auto-generated method stub
//		System.out.println("Cc show");
//	}
//}

public class AbstractAnonymousClass {
	public static void main(String[] args) {
		Xx obj = new Xx() {

			@Override
			void show() {
				System.out.println("only once");
			}

			@Override
			void game() {
				// TODO Auto-generated method stub
				System.out.println("0 game");
			}
		};
		obj.show(); 
	}
}
