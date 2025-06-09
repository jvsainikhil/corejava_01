package java_basictoadvance_Strings;

public class Strings{
	public static void main(String[] args) {
		//StringBuffer
		StringBuffer a=new StringBuffer("Nikhil");
		a.length();
		a.deleteCharAt(0);
		a.setLength(20);
		System.out.println(a);
		//StringBuilder
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		System.out.println("StringBuilder result: " + sb.toString());
	}
}

