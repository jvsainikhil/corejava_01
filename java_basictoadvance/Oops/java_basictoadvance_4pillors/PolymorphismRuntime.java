package java_basictoadvance_4pillors;


class As { // parent
	public void show() {
		System.out.println("In As method1");
	}
}

class Bs extends As { // child_01
	@Override
	public void show() {
		System.out.println("In Bs method1");
	}
}

//class C extends As{ //child_02
//	
//}

public class PolymorphismRuntime {
	public static void main(String[] args) {
		As obj = new As();
		obj.show();
		
		obj = new Bs();
		obj.show();
		
		
	}
}

/*
 * Polymorphism: Many Behaviour
 * 
 */
