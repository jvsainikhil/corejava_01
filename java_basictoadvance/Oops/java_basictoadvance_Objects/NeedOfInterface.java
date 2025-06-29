package java_basictoadvance_Objects;

class Laptop{
	public void code() {//--0
		System.out.println("code, compile, run");
	}
}

class Desktop{
	public void code() {
		System.out.println("code, compile, run: faster");
	}
}
class Developer {
	public void devapp(Laptop lap) { //issue
		//System.out.println("coding..");
		lap.code();//--0
	}
}

public class NeedOfInterface {
	public static void main(String[] args) {
		Laptop lap=new Laptop();//--0
		Desktop desk=new Desktop();
		Developer nikhil= new Developer();
		nikhil.devapp(desk);//--0 //issue
	}
	/* output: code, compile, run */
}