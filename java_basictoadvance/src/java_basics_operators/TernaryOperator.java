package java_basics_operators;

import java.text.NumberFormat;
import java.util.Locale;

public class TernaryOperator {
	public static void main(String args[]) {
		int num = 20;
		String out = (num > 9)?"true":"false";
		System.out.println(out);
		
		int age = 18;
		String result = (age >= 18) ? "Eligible to vote" : "Not eligible";
		System.out.println(result);
		
		String output = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
		System.out.println(output);
		
		
		System.out.println(12*5);
		
		//out of//--------------------------------------------------------------------------------
		int number = 3000000; // 30,00,000
        String numStr = String.valueOf(number);
        StringBuilder formatted = new StringBuilder();

        char[] digits = numStr.toCharArray();
        int len = digits.length;
        int count = 0;

        // Traverse from end
        for (int i = len - 1; i >= 0; i--) {
            formatted.insert(0, digits[i]);
            count++;

            // Insert comma after 3 digits, then every 2 digits
            if ((count == 3 && i != 0) || (count > 3 && (count - 3) % 2 == 0 && i != 0)) {
                formatted.insert(0, ',');
            }
        }

        System.out.println(formatted); // Output: 30,00,000
    }
}
