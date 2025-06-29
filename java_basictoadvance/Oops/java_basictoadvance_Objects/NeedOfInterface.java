package java_basictoadvance_Objects;

interface Computer{// Abstract ----> Interface
	void code();

}

class Laptop implements Computer{// extends ----> implements
	public void code() {
		System.out.println("code, compile, run");
	}
}

class Desktop implements Computer{// extends ----> implements
	public void code() {
		System.out.println("code, compile, run: faster");
	}
}
class Developer {
	public void devapp(Computer lap) { 
		//System.out.println("coding..");
		lap.code();
	}
}

// we are making it loosely coupled
public class NeedOfInterface {
	public static void main(String[] args) {
		Computer lap=new Laptop(); // interface reference X --> // we are passing a computer reference and accepting the reference
		Computer desk=new Desktop(); // interface reference
		Developer nikhil= new Developer();
		nikhil.devapp(lap); // we passed desk
	}
	/* output: code, compile, run */
}