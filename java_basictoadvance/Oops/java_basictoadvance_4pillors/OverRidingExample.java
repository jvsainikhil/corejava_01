package java_basictoadvance_4pillors;

class z {
	public void show() { //method
		System.out.println("in Z show");
	}
	public void config() {
		System.out.println("in Z Config");
	}
}

class x extends z{
	@Override
	public void show() {
		System.out.println("in X show");
	}
	
	@Override
	public void config() {
		System.out.println("in X config");
	}
}

public class OverRidingExample {
	public static void main(String[] args) {
		x obj = new x();
		obj.show();
		obj.config();
	}
}
