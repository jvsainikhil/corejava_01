package java_basictoadvance_practice;

import java.util.HashMap;

public class All_Code {
	public static void main(String[] args) {
		// ✅ Count Vowels and Consonants
		String str = "hello world";
		int vowels = 0, consonants = 0;

		str = str.toLowerCase(); // convert to lowercase to handle capital letters

		for (char ch : str.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') { // check if character is a letter
				if ("aeiou".indexOf(ch) != -1) {
					vowels++; // it's a vowel
				} else {
					consonants++; // it's a consonant
				}
			}
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);

		System.out.println("---------------------------");
		// ✅ Remove Duplicate Characters
		String input = "programming";
		StringBuilder result = new StringBuilder();

		for (char ch : input.toCharArray()) {// get each character
			if (result.indexOf(String.valueOf(ch)) == -1) {// if not already in result
				result.append(ch);
			}
		}
		System.out.println("After removing duplicates: " + result);

		System.out.println("---------------------------");
		// ✅ All Non-Repeating Characters
		String inputA = "programming";
		HashMap<Character, Integer> freqMapB = new HashMap<>();

		// Count frequency of each character
		for (char ch : inputA.toCharArray()) {
			freqMapB.put(ch, freqMapB.getOrDefault(ch, 0) + 1);
		}

		// Print all characters with frequency = 1
		boolean found = false;
		System.out.print("Non-repeating characters: ");
		for (char ch : inputA.toCharArray()) {
			if (freqMapB.get(ch) == 1) {
				System.out.print(ch);
				found = true;
			}
		}

		if (found) {
			System.out.println(); // move to new line
		} else {
			System.out.println("None");
		}

		System.out.println("---------------------------");
		// ✅ NumberOfLetters
		String strC = "hello";
		// Step 1: Count frequency of each character
		HashMap<Character, Integer> freqMapA = new HashMap<>();

		for (char ch : strC.toCharArray()) {
			freqMapA.put(ch, freqMapA.getOrDefault(ch, 0) + 1);
		}

		// Step 2: Print frequency for each unique character (in input order)
		for (char ch : strC.toCharArray()) {
			if (freqMapA.containsKey(ch)) {
				System.out.println(ch + " : " + freqMapA.get(ch));
				freqMapA.remove(ch); // ensures each character is printed only once
			}
		}

		System.out.println("---------------------------");
		// ✅ Check if String Contains Only Digits ✅ Check if string contains only
		String strB = "12345", strA = "abcXYZ";
		boolean isDigitsOnly = true;
		boolean isLettersOnly = true;

		for (char ch : strB.toCharArray()) {
			if (!Character.isDigit(ch)) {
				isDigitsOnly = false;
				break;
			}

			for (char cha : strA.toCharArray()) {
				if (!Character.isLetter(cha)) {
					isLettersOnly = false;
					break;
				}
			}
		}
		System.out.println("Only digits? " + isDigitsOnly);
		System.out.println("Only digits? " + isLettersOnly);

		System.out.println("---------------------------");
		// ✅ Reverse a String
		String sentence = "apple";
		StringBuilder reversed = new StringBuilder(sentence);
		System.out.println("Reversed: " + reversed.reverse());

	}
}
