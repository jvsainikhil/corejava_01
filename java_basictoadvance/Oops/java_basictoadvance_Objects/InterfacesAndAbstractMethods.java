package java_basictoadvance_Objects;

interface Sample { 
	int age=25;   // variables in interface are always "Final and Static"
	String name="Nikhil";
	// we can create abstract and nonabstract methods
	//we can design some thing
	//we created hyreachy
	/* public abstract By default*/ void show();
	/* public abstract By default*/ void config();
}

class LogicCode implements Sample{

	@Override
	public void show() {
		System.out.println("in the showf");
	}

	@Override
	public void config() {
		System.out.println("in the config");
		
	}
	
}

public class InterfacesAndAbstractMethods {
	public static void main(String[] args) {
	//	Sample onj=new Sample(); //it is an interface so we cannot 
		Sample obj;
		obj = new LogicCode();
		LogicCode obj1 = new LogicCode();
		obj.config();
		obj.show();   // interface wont have memory in heap
		System.out.println(Sample.age+" & "+Sample.name);
	}
}
