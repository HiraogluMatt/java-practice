package day21_loopspractice;

import java.util.*;

public class GetUniqueChars {
	public static void main(String[] args) {
		System.out.println("Returns unique characters: \nEnter a word or sentence:");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String word2 = "";
		char letter;

		for (int i = 0; i < word.length(); i++) {
			letter = word.charAt(i);
			if (!word2.contains("" + letter)) {
				word2 += letter;
			}
		}
		scan.close();
		System.out.println(word2);
	}
}
