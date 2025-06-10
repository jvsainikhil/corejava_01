package java_basictoadvance_4pillors;

//By using getters and setters get and set, Encapsulation
class Human{
	private int age; // Accessible only in the same class
	private String name;
	
	public int xyz() {// it should define the intension
		return age;
	}
	public void abc(int b) {// it should define the intension
		 age = b;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String c) {
		name=c;
	}
}

public class Encapsulation {
	public static void main (String [] args) {
		Human a= new Human();
		a.abc(25);// it should define the intension
		a.setName("Nikhil");
		System.out.println(a.xyz()/* it should define the intension*/+a.getName());
	}
}
