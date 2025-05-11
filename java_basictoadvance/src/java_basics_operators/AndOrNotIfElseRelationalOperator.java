package java_basics_operators;

public class AndOrNotIfElseRelationalOperator{
	public static void main(String args[]) {
		int a = 10, b = 20;
		System.out.println("a == b: " + (a == b)); //equals 
		System.out.println("a != b: " + (a != b)); //not equal
		System.out.println("a > b: " + (a > b)); //greater than
		System.out.println("a < b: " + (a < b)); //less than
		System.out.println("a >= b: " + (a >= b)); //greater than or equal to
		System.out.println("a <= b: " + (a <= b)); //less than or equal to

		int xa = 10;
		// Short-circuit AND: second condition is NOT checked
		if (xa < 5 && ++xa > 10) {
			System.out.println("Condition met");
		} else {
			System.out.println("Condition NOT met");
		}

		System.out.println("x = " + xa); // x remains 10 (no ++x)

		//logic
		boolean w = true;
		boolean s = false;

		System.out.println("a && b: " + (w && s)); // false
		System.out.println("a || b: " + (w || s)); // true
		System.out.println("!a: " + (!w));         // false

		// Real-world example
		int age = 25;
		boolean hasLicense = true;

		if (age > 18 && hasLicense) {
			System.out.println("Eligible to drive");
		} else {
			System.out.println("Not eligible to drive");
		}

		int sample1 =10;
		int sample2 =10;
		if (sample1<=sample2 && sample2>=sample1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

		int x=8;
		int y=7;
		int z=9;
		if (z>y && x>z)
			System.out.println("x");
		else if (y>x && y>z)
			System.out.println("y");
		else
			System.out.println("z");


		if (true) {
			System.out.println("when true this is called");
		}

		//Dead code

		if(false){
			System.out.println("when false this is called");
		}

		int xi = 10;

		if (xi > 5) {
			System.out.println("x is greater than 5");
			return;  // After this line, the method exits
		}

		System.out.println("This line is dead code"); // ❌ Dead code — never reached
	}
	
}

