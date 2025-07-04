package java_basictoadvance_advance_valueFromuser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannersFunctions {
	public static void main(String[] args) throws IOException {
		//it is printing an assici value
		//public class PrintStream extends FilterOutputStream
		System.out.println("Enter a number");
		
		InputStreamReader in =new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
		
		int num = Integer.parseInt(bf.readLine());
		System.out.println(num); //ASCII
		bf.close();
	}
}



