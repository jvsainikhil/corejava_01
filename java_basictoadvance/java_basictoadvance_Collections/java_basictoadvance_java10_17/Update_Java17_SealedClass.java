package java_basictoadvance_java10_17;

//Only B&C able to inherit A
//to perimt do like this
sealed class A permits B,C{
	
}

sealed class B extends A permits D{
	
}

final class C extends A{
	
}

final /*non-sealed*/ class D extends B{
	
}

public class Update_Java17_SealedClass {
	public static void main(String[] args) {
		//Abstract Class - Is ment to be Inherited 
		//Final Class    - No class can Inherit
		//If we cant Inheritance but in every class can do it "Restricting"
		//can mention which are the subclass, which are the interfaces which can inherit from this particular class and Interface 
		//Keyword: SEALED
		
	}
}
