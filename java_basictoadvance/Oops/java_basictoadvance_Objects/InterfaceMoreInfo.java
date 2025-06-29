package java_basictoadvance_Objects;

//class - class -> extends
//class - interface -> implements
//interface - interface -> extends

interface Aaa { 
	int age=25;  
	String name="Nikhil";
	void show();
	void config();
}

interface X{
	void run();
}

interface Y extends X{
	
}

class ALogicCode implements Aaa,Y{

	@Override
	public void show() {
		System.out.println("in the showf");
	}

	@Override
	public void config() {
		System.out.println("in the config");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("runnig");
	}	
	
	
}

public class InterfaceMoreInfo {
	public static void main(String[] args) {
	//	Sample onj=new Sample(); //it is an interface so we cannot 
		Aaa obj;
		obj = new ALogicCode();
		ALogicCode obj1 = new ALogicCode();
		obj.config();
		obj.show();   // interface wont have memory in heap
		System.out.println(Aaa.age+" & "+Aaa.name);
	}
}

