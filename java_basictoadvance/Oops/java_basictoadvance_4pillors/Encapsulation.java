package java_basictoadvance_4pillors;

//By using getters and setters get and set
class Human{
	private int age; // Accessible only in the same class
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int b) {
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
		a.setAge(25);
		a.setName("Nikhil");
		System.out.println(a.getAge()+a.getName());
	}
}
