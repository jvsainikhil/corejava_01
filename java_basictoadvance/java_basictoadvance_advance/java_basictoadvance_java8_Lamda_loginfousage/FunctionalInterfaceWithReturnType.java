package java_basictoadvance_java8_Lamda_loginfousage;

@FunctionalInterface 
interface uauser {
	 int  add(int i, int j);
}

public class FunctionalInterfaceWithReturnType {
	public static void main(String[] args) {
		//Functional Interface - Lamda Expression
		uauser b= (i, j) -> i+j;
		int result = b.add(30, 40);
		System.out.println(result);
	}
}
