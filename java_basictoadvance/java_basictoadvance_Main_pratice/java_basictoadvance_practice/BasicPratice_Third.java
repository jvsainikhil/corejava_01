package java_basictoadvance_practice;

//Interface with add and sub methods
interface Calculator {
	int add(int a, int b);
	int sub(int a, int b);
}

//Class implementing the interface
class NikhilServiceA implements Calculator {
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}
}

//Main class
public class BasicPratice_Third {
	public static void main(String[] args) {
		NikhilServiceA service = new NikhilServiceA();

		int x = 20;
		int y = 10;

		System.out.println("Addition: " + service.add(x, y));      // Output: 30
		System.out.println("Subtraction: " + service.sub(x, y));   // Output: 10
	}
}
