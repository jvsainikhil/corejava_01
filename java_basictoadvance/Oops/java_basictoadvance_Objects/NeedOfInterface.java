package java_basictoadvance_Objects;


class nikhilsLaptop{
	public void code() {
		System.out.println("code, compile, run");
	}
}

//need a laptop
class Developer{
	public void devApp(nikhilsLaptop lap) {
		lap.code();
		//System.out.println("coding");
	}
}

public class NeedOfInterface {
	public static void main(String[] args) {
		nikhilsLaptop a=new nikhilsLaptop(); //calling
		Developer nikhil=new Developer();
		nikhil.devApp(a); //calling 
	}
	/* output: code, compile, run */
}
