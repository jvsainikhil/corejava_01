package java_basictoadvance_exception;

class NikhilException extends Exception
{
	public NikhilException(String string) {
		
	}
}

public class ExceptionsExplained {

	public static void main(String[] args) {
		int a = 20;
		int b = 0;// before the value is 0 so the output comes as 0

		try {
			b = 18 / a;
			if(b==0) // used to throw the exception 
				//throw new ArithmeticException("I dont want to print 0");
				throw new NikhilException(" dont want to print 0");
		} catch (NikhilException e)  {
			b = 18/1;
			System.out.println("That's the default output" + e);
		} catch (Exception e) {
			System.out.println("Some thing went wrong" + e);
		}
		System.out.println(b);// before the value is 0 so the output comes as 0
		System.out.println("bye");
	}
}