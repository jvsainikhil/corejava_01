package java_basictoadvance_Objects;
class Laptop{
	public void code() {//--0
		System.out.println("code, compile, run");
	}
}
class Developer {
	public void devapp(Laptop lap) {
		//System.out.println("coding..");
		lap.code();//--0
	}
}

public class NeedOfInterface {
	public static void main(String[] args) {
		Laptop lap=new Laptop();//--0
		Developer nikhil= new Developer();
		nikhil.devapp(lap);//--0
	}
	/* output: code, compile, run */
}