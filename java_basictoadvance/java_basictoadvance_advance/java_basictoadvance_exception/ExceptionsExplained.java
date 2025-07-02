package java_basictoadvance_exception;

public class ExceptionsExplained {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;// before the value is 0 so the output comes as 0
		int num[] = new int[5];
		try {
			b = 18 / a;
			System.out.println(num[1]);
			System.out.println(num[5]);
			
		} catch (ArithmeticException e)  {
			//we are printing exception as well
			System.out.println("Cannot divide by 0");
		} catch (ArrayIndexOutOfBoundsException e)  {
			//we are printing exception as well
			System.out.println("Stay in the num");
		}
		System.out.println(b);// before the value is 0 so the output comes as 0
		System.out.println("bye");
	}
}