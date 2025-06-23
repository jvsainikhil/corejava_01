package java_basictoadvance;

class A{//super class
	A(){//---------------> this is executing 01
		super();//default //In every constructor this method will be there 
		System.out.println("in A");
	}
	A(int a){ //---> if we want to call this 02
		super();//default //In every constructor this method will be there 
		System.out.println("in A int: " + a);
	}
}

class B extends A{
	B(){
		super();//default //In every constructor this method will be there 
		System.out.println("in B");
	}
	B(int b){//--------------- for this one 01
		//call the constructor of a /*super class*/ the default one 
		//super();//---------- for this one calling A 01 //default //In every constructor this method will be there 
		super(b);//--------------- for this one calling A(int a) 02
		System.out.println("in B int: " + b);
	}
}


public class ThisAndSuper {
	public static void main(String[] args) {
		//B obj = new B();
		B obj1= new B(5);
		/*
		 * This is the output: 
		 * in A 
		 * in B int: 5
		 * 
		 * 
		 */
	}
}
