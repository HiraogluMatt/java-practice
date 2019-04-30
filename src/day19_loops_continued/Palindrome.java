package day19_loops_continued;

import java.util.*;

public class Palindrome {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to check if palindrome:");
		String word = scan.nextLine();
		String word2 = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			word2 += word.charAt(i);
		}
		if (word.equalsIgnoreCase(word2)) {
			System.out.println("Palindrome!");
		} else {
			System.out.println("Not Palindrome!");
		}
		scan.close();
		return;

	}

}
