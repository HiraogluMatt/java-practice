package day15_string_manipulation;

import java.util.*;

public class Smileys {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = 1;
		while (i > 0) {

			System.out.println("Enter smiley face");
			String input = scan.next();

			char first = input.charAt(0);
			char second = input.charAt(1);

			String emoji = "";
			if (input.length() != 2) {
				System.out.println("invalid");
				return;
			}

			if (first == ':') {
				if (second == ')') {
					emoji = "smile";
				} else if (second == '(') {
					emoji = "sad";
				} else if (second == '/') {
					emoji = "upset";
				} else if (second == 'p') {
					emoji = "playful";
				} else if (second == '0') {
					emoji = "surprised";
				} else {
					emoji = "invalid";
				}
			} else if (first == '(') {
				if (second == ':') {
					emoji = "smile";
				} else if (second == ';') {
					emoji = "wink";
				} else {
					emoji = "invalid";
				}
			} else {
				emoji = "invalid";
			}
			System.out.println(emoji);
		}
		scan.close();

	}
}
