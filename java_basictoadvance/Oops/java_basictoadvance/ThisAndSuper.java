package java_basictoadvance;

class A{//super class
	A(){
		super();//default //In every constructor this method will be there 
		System.out.println("in A");
	}
	A(int a){
		super();//default //In every constructor this method will be there 
		System.out.println("in A int: " + a);
	}
}

class B extends A{
	B(){
		super();//default //In every constructor this method will be there 
		System.out.println("in B");
	}
	B(int b){
		//call the constructor of a /*super class*/ the default one 
		super();//default //In every constructor this method will be there 
		System.out.println("in B int: " + b);
	}
}


public class ThisAndSuper {
	public static void main(String[] args) {
		//B obj = new B();
		B obj1= new B(5);
		/*
		 * output: 
		 * in A 
		 * in B int: 5
		 * 
		 */
	}
}
