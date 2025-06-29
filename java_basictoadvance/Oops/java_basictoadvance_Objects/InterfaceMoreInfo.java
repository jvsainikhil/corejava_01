package java_basictoadvance_Objects;

//class - class -> extends
//class - interface -> implements
//interface - interface -> extends

interface Aaa { 
//	int age=25;  
//	String name="Nikhil";
	void show();
	void config();
}

interface X{
	void run();
}

interface Y extends X{
	
}

class B implements Aaa,Y{

	@Override
	public void show() {
		System.out.println("in the show");
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
		obj = new B();
		obj.config();
		obj.show();   // interface wont have memory in heap
		X obj1 =new B();
		obj1.run();
	}
}

