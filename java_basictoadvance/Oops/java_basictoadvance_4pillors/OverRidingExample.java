package java_basictoadvance_4pillors;

class Cal {
	public int add(int a, int b) { // method
		return a+b;
	}
}

class AdvCal extends Cal {
	@Override
	public int add(int a, int b) { // method
		return a+b+90;
	}
}

public class OverRidingExample {
	public static void main(String[] args) {
		AdvCal obj = new AdvCal();
		Cal obj1=new Cal();
		System.out.println("Result: "+obj.add(1,9)+"\nAnother with out Overriding: "+obj1.add(29, 12));
	}
}
