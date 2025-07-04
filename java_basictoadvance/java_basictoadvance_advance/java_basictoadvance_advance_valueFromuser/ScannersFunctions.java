package java_basictoadvance_advance_valueFromuser;

import java.io.FilterOutputStream;
import java.io.IOException;

public class ScannersFunctions {
	public static void main(String[] args) throws IOException {
		//it is printing an assici value
		//public class PrintStream extends FilterOutputStream
		System.out.println("Enter a number");
		int num = System.in.read();
		System.out.println(num); //ASCII
	}
}



