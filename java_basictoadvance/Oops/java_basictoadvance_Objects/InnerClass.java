package java_basictoadvance_Objects;

//A class inside a class 
class A {
	
	int age;
	void show() {
		System.out.println("show");
	}

	static class B { //-- static class 01
		void config() {
			System.out.println("config");
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
		A obj = new A();
		//B obj1= new B(); --> throwing erroe
		obj.show();
		obj.age = 20;
		
		//A.B obj1 = obj.new B(); // -- if it's a non static class
		A.B obj2= new A.B(); //--- > 01
		obj2.config();
	}
}
