package java_basictoadvance_AccessModifiers;

public class AccessModifiers {
	public static void main(String[] args) {
		Abc a=new Abc();
		System.out.println(a.getMarks());
		/*
		 * public 
		 * private 
		 * protected 
		 * default
		 * 
		 */
		Bcd b=new Bcd();
		System.out.println(b.getMarks());
		int p= b.setMarks(6);
		System.out.println(p);
		
	}
}
