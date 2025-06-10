package java_basictoadvance_4pillors;

//By using getters and setters get and set, Encapsulation
//This from source --> getters and setters shortcut
//Every method will have it's own stack 
class Human{
	private int age; // Accessible only in the same class
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age,Human a) {// local and instance is same 
		Human obj1=a;
		obj1.age = age;// assigning value to it self 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;// new key word this 
	}
}

public class Encapsulation {
	public static void main (String [] args) {
		Human a= new Human();
		a.setAge(25,a);// passing the object 2-times 
		// by default it will give you as this
		a.setName("Nikhil");
		System.out.println(a.getAge()+a.getName());
		//output: 0Nikhil
	}
}
