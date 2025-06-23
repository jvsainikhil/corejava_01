package java_basictoadvance_AccessModifiers;

public class AccessModifiers {
	public static void main(String[] args) {
		Abc a=new Abc();
		System.out.println(a.Marks());
		/*
		 * public 
		 * private 
		 * protected 
		 * default
		 * 
		 */
		Bcd b=new Bcd();
		System.out.println(b.Marks());//private 
		//adds getters and setters 
	}
}
