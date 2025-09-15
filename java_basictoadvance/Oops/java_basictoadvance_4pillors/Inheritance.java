package java_basictoadvance_4pillors;
//Malti Level Inheritance
//file_01
class Calculator{//Parent class
	public int add(int n1,int n2) {
		return n1+n2;
	}
	
	public int sub(int n1,int n2) {
		return n1-n2;
	}

}

//file_03
class AdvanceCalculator /* Child class */ extends Calculator /* Parent class */{ 
	//extends is a key word this Is A relation ship
	public int multi(int n1,int n2) {
		return n1*n2;
	}
	
	public int div(int n1,int n2) {
		return n1/n2;
	}
}

//file_04
class VeryAdvCal extends AdvanceCalculator{
	public double power(int n1, int n2) {
		return Math.pow(n1, n2);
	}
}

//file_02
public class Inheritance { // General way 
	public static void main(String[] args) {
    VeryAdvCal obj=new VeryAdvCal();
    int r1 =obj.add(4,5); // error
    int r2 =obj.sub(4,5); // error 
    int r3 =obj.div(4,5);
    int r4 =obj.multi(4,5);
    double r5= obj.power(4,5);
    System.out.println(r3+", "+r4+", "+r1+", "+r2+", "+r4+", "+r5);
	}
}
