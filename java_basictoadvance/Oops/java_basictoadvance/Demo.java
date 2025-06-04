package java_basictoadvance;

//static variable
class Mobile {
	String brand; //instance variable created out side 
	// when we create a variable inside a method is local variable
	int price;//Here every object will have a different object a
	String name;//Here every object will have a different object a

	public void show() {
		System.out.println("brand=" + brand + ",\t price=" + price + ",\t name=" + name); 
	}


}
public class Demo{
	public static void main(String[] args) {
		Mobile obj1=new Mobile();
		obj1.brand = "Apple";
		obj1.price= 1500;
		obj1.name= "SmartPhone";
		
		Mobile obj0=new Mobile();
		obj0.brand = "Samsung";
		obj0.price= 1700;
		obj0.name= "SmartPhone";
		
		Mobile obj2=new Mobile();
		obj2.brand = "nokia";
		obj2.price= 100;
		obj2.name= "SmartPhone";
		
		obj1.show();
		obj2.show();
		obj0.show();
		}
}