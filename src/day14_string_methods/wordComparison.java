package day14_string_methods;

import java.util.*;

public class wordComparison {
	public static void main(String[] args) {
		System.out.println("Enter 2 words");
		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();

		if (word1.length() > word2.length()) {
			System.out.println(word1 + " is longer!");
		}
		if (word2.length() > word1.length()) {
			System.out.println(word2 + " is longer!");
		} else {
			System.out.println(word1 + " and " + word2 + " are the same length");
		}

	}

}
