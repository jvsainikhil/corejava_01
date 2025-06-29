package java_basictoadvance_Objects;

abstract class Computer{
	public abstract void code();
}

class Laptop extends Computer{
	public void code() {
		System.out.println("code, compile, run");
	}
}

class Desktop extends Computer{
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
		Computer lap=new Laptop(); // we are passing a computer reference and accepting the reference
		Computer desk=new Desktop();
		Developer nikhil= new Developer();
		nikhil.devapp(desk); // we passed desk
	}
	/* output: code, compile, run */
}