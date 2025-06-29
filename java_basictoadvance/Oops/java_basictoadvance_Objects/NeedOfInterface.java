package java_basictoadvance_Objects;

abstract class Computer{
	public abstract void code();
}

class Laptop extends Computer{
	public void code() {
		System.out.println("code, compile, run");
	}
}

//need a laptop
class Desktop extends Computer{
	public void devApp(Computer lap) {
		lap.code();
		//System.out.println("coding");
	}
}

public class NeedOfInterface {
	public static void main(String[] args) {
		Computer lap =new Laptop();
		Laptop desk=new Laptop(); //calling // tight coupling
		Desktop nikhil=new Desktop();
		nikhil.devApp(lap); //calling // tight coupling
	}
	/* output: code, compile, run */
}
