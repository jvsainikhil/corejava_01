package java_basictoadvance_thisAndSuper;
//this 
class q extends Object{
	q(){//3st execution 
		super();
		System.out.println("in Q");
	}
	q(int n){ 
		super();
		System.out.println("in Q int: " + n);
	}
}
// want to execute constructor of W
class w extends q{
	w(){
		super();//2st execution //3st execution 
		System.out.println("in W");
	}
	w(int m){ //1st execution //4st execution 
		//super(m);
		this(); // this will execute the constructor of the same class
		//refers to the current class object 
		System.out.println("in W int: " + m);
	}
}

public class ThisAndSuperAboutThis {
	public static void main(String[] args) {
		//B obj = new B();
		w obj1= new w(5);
		/*
		 * output 
		 * in Q 
		 * in W 
		 * in W int: 5
		 */

	}
}
