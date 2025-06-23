package java_basictoadvance_4pillors;
//file_01
class Calculator{
	public int add(int n1,int n2) {
		return n1+n2;
	}
	
	public int sub(int n1,int n2) {
		return n1-n2;
	}

}

//file_03
class AdvanceCalculator extends Calculator{
	public int multi(int n1,int n2) {
		return n1*n2;
	}
	
	public int div(int n1,int n2) {
		return n1/n2;
	}
}

//file_02
public class Inheritance { // General way 
	public static void main(String[] args) {
    AdvanceCalculator obj=new AdvanceCalculator();
    //Cal obj=new Cal();
    int r1 =obj.add(4,5); // error
    int r2 =obj.sub(4,5); // error 
    System.out.println(r1+", "+r2);
    int r3 =obj.div(4,5);
    int r4 =obj.multi(4,5);
    System.out.println(r3+", "+r4);
		
	}
}
