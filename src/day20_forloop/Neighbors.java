package day20_forloop;

import java.util.*;

public class Neighbors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to beep neighboring letters");
		String word = scan.next();

		for (int i = 0; i < word.length(); i++) {
			if (i == word.length() - 1)
				break;
			if (word.charAt(i) == (word.charAt(i + 1))) {
				System.out.println("Beep " + word.charAt(i));
			}

		}

	}

}
