package java_basictoadvance_advance_valueFromuser;

import java.io.IOException;
import java.util.Scanner;

public class ScannersFunctions {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// it is printing an assici value
		// public class PrintStream extends FilterOutputStream
		System.out.println("Enter a number");
		// Difficult way
		// InputStreamReader in = new InputStreamReader(System.in);
		// BufferedReader bf = new BufferedReader(in);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num); // ASCII
		//bf.close();
	}
}
