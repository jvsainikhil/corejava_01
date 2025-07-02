package java_basictoadvance_exception;

public class ExceptionsExplained {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;// before the value is 0 so the output comes as 0
		try {
			b = 18 / a;
		} catch (Exception e) {
			System.out.println("Something went wromg");
		}
		System.out.println(b);// before the value is 0 so the output comes as 0
		System.out.println("bye");
	}
}