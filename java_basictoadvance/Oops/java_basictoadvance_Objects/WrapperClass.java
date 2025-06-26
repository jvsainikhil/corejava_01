package java_basictoadvance_Objects;

public class WrapperClass {
	public static void main(String[] args) {
		
		int num = 7;//primitive
		//Integer num1 = new Integer(num);// boxing  we are taking int //reference variable 
		Integer num1 = num; //AutoBoxking - this will convert to object so we call as AutoBoxking
		/* it is saying we have a better alternative 
		 * Multiple markers at this line 
		 * - The constructor Integer(int) has been
		 * deprecated since version 9 and marked for removal 
		 * - The value of the local
		 * variable num1 is not used
		 */
		int num2 = num1.intValue(); //autounboxing the primitive value 
		System.out.println(num2);
	
		//Integer provides this 
		String str = "12";
		int num3= Integer.parseInt(str);
		System.out.println(num3*2);
	}
}
