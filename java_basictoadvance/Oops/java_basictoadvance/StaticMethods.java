package java_basictoadvance;

class Mobile {
	String brand; //instance variable created out side 
	// when we create a variable inside a method is local variable
	int price;//Here every object will have a different object a
	static String name;//Here every object will have a different object a
	//if we want name variable common to all to all the objects 
	//ex: phone ---> in shared we cannot change a particular object 

	public void show() {
		System.out.println("brand=" + brand + ",\t price=" + price + ",\t name=" + name); 

	}
	//new added - Ref old
	public static void show1() {
		System.out.println("in static method"+ name + price);
		//Cannot make a static reference to the non-static field price
	}
}

public class StaticMethods {
	public static void main(String[] args) {
		Mobile obj1=new Mobile();
		obj1.brand = "Apple";
		obj1.price= 1500;
		Mobile.name= "Smartphone";// effect all obj 
		
		Mobile obj0=new Mobile();
		obj0.brand = "Samsung";
		obj0.price= 1700;
		Mobile.name= "SmartPhone";// effect all obj
		
		Mobile obj2=new Mobile();
		obj2.brand = "nokia";
		obj2.price= 100;
		Mobile.name= "SmartPhone";// effect all obj
		
		Mobile.name ="phone";// effect all obj 
		//Mobile.show(); ---> Cannot make a static reference to the non-static method show() from the type Mobile
		Mobile.show1();
		
		
		obj1.show();
		obj2.show();
		obj0.show();
		
		
	}
}
