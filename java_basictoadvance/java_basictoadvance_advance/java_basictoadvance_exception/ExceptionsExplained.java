package java_basictoadvance_exception;

public class ExceptionsExplained {

	public static void main(String[] args) {
		int a = 20;
		int b = 0;// before the value is 0 so the output comes as 0

		try {
			b = 18 / a;
		} catch (ArithmeticException e)  {
			b = 18/1;
			System.out.println("That's the default output");
		} catch (Exception e) {
			System.out.println("Some thing went wrong" + e);
		}
		System.out.println(b);// before the value is 0 so the output comes as 0
		System.out.println("bye");
	}
}