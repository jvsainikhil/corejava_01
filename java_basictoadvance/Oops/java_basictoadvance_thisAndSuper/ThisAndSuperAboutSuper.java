package java_basictoadvance_thisAndSuper;
// every class in java it will extend object 
class A extends Object{//super class
	A(){//---------------> this is executing 01 //-->03
		super();//default //In every constructor this method will be there 
		System.out.println("in A");
	}
	A(int a){ //---> if we want to call this 02 //---->04
		super();//default //In every constructor this method will be there 
		System.out.println("in A int: " + a);
	}
}

class B extends A{
	B(){
		super(9);//---->03 //---->04
		//default //In every constructor this method will be there 
		System.out.println("in B");
	}
	B(int b){//---------------> for this one 01
		//call the constructor of a /*super class*/ the default one 
		//super();//----------> for this one calling A 01 //default //In every constructor this method will be there 
		super(b);//-----------> for this one calling A(int a) 02
		System.out.println("in B int: " + b);
	}
}

public class ThisAndSuperAboutSuper {
	public static void main(String[] args) {
		//B obj = new B();
		B obj1= new B();//--->03 //--->04
		
		/*---->04
		 * This is the output: 
		 * in A 
		 * int: 9 in B
		 */
		
		/*---->03
		 * This is the output: 
		 * in A
		 * in B
		 * 
		 */
		
		/*---->02
		 * This is the output: 
		 * in A int: 5 
		 * in B int: 5
		 * 
		 */

		/*---->01
		 * This is the output: 
		 * in A 
		 * in B int: 5
		 * 
		 * 
		 */
	}
}
