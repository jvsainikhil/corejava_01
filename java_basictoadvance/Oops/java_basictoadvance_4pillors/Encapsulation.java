package java_basictoadvance_4pillors;

//By using getters
class Human{
	private int age = 25; // Accessible only in the same class
	private String name = "Nikhil";
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}

public class Encapsulation {
	public static void main (String [] args) {
		Human a= new Human();
//		a.age=25;
//		a.name="Nikhil";
		System.out.println(a.getAge()+a.getName());
	}
}
