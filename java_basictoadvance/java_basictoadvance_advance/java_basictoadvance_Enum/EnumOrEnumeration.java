package java_basictoadvance_Enum;


enum Status{ //prebuild
	Running, Failed, Pending, Success; // all this are objects //named constants
   //  0   |    1   |   2   |     3   |
}

public class EnumOrEnumeration {
	// send a request --> in waht ways it is accepting the request 200,404...etc
	public static void main(String[] args) {
		int i=5;
		 Status[] ss = Status.values();
		for(Status s: ss) {
			System.out.println(s+" : "+s.ordinal());
		}
		 // System.out.println(s.ordinal());
		 
		/*
		 * Status s = Status.Running; Status s1 = Status.Failed; Status s2 =
		 * Status.Pending; Status s3 = Status.Success; System.out.println(s);
		 * System.out.println(s1); System.out.println(s2); System.out.println(s3);
		 */
	}
}
