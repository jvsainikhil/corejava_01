package java_basictoadvance_Objects;

class Computer{
	public void code() {
		
	}
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

public class NeedOfInterface {
	public static void main(String[] args) {
		Computer lap=new Laptop();
		Computer desk=new Desktop();
		Developer nikhil= new Developer();
		nikhil.devapp(desk); // we passed desk
	}
	/* output: code, compile, run */
}