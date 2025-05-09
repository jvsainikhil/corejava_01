package java_basictoadvance;

public class TypeCasting {
	public static void main(String []args) {
		byte ty1=127;
		int end1 = ty1;
		
		// converting int to byte if range increases 
		byte a=(byte)end1; //type casting
		System.out.println(a);
		
		int ty2=257;
		//if range increases it will use modules 
		byte b=(byte)ty2; //type casting
		System.out.println(b);
		
		//implicitly
		byte qw=10;
		byte wq=30;
		int result = qw*wq;
		System.out.println(result);
	}
}
