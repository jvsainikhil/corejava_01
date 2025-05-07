package java_basictoadvance;

import java.util.ArrayList;

public class datatypes {
	static int num=9;
	static byte b=127;
	short sh=558;
	long l=5812l;
	float f=5.32f;
	double d1=5.8;
	String c="nikhil";
	char d='A';
	boolean b3=true;
	//--------------------------------------------------------------------- Separate class
	 public static void main(String[] args) {
		    //creating new object which converts as bean 
		 // Create object to access instance variables
	        datatypes obj = new datatypes(); 
	        

	        //with integer
	        ArrayList<Integer> b = new ArrayList<>();
	        b.add(datatypes.num);
	        
	        //with string
	        ArrayList<String> a = new ArrayList<>();
	        a.add("b=" + datatypes.b);
	        a.add("sh=" + obj.sh);
	        a.add("l=" + obj.l);
	        a.add("f=" + obj.f);
	        a.add("d1=" + obj.d1);
	        a.add("c=" + obj.c);
	        a.add("d=" + obj.d);
	        a.add("b3=" + obj.b3);
	        System.out.println(a);
	        
	        //for the static method
	        System.out.println(num);
	    }
}
