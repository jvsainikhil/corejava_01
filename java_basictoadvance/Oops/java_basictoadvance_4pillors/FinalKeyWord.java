package java_basictoadvance_4pillors;

// final with variable:

/*//final variable
//✅ Once assigned, its value cannot be changed
final int x = 10;

//final method
//✅ Cannot be overridden by subclasses
final void display() {
 System.out.println("Hello");
}

//final class
//✅ Cannot be extended (no subclass allowed)
final class MyClass {
 // class content
}
*/
final class calc {
	public void show() {

	}
}

class advancecalc extends Calc {// we will gwt error due to final

}

public class FinalKeyWord {
	public static void main(String[] args) {

	}
}
