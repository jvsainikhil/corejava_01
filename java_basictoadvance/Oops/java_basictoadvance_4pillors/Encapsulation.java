package java_basictoadvance_4pillors;

//General way we call data like this 
class Human{
	int age;
	String name;
}

public class Encapsulation {
	public static void main (String [] args) {
		Human a= new Human();
		a.age=25;
		a.name="Nikhil";
		System.out.println(a.age+a.name);
	}
}
