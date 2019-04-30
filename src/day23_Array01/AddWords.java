package day23_Array01;

import java.util.Scanner;

public class AddWords {
	public static void main(String[] args) {
		String list = "";
		String word = "";

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.println("Enter a word:");
			word = scan.next();
			if (word.equalsIgnoreCase("java")) {
				continue;
			}
			list += ", " + word;
		}
		System.out.println("Summary: " + list.substring(2, list.length()));
	}
}
