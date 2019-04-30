package day22_loopspractice2;

import java.util.*;

public class Substring {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();
		String temp = "";

		if (count > 1) {
			for (int i = 1; i <= count; i++) {
				temp += word + separator;
			}

			System.out.println(temp.substring(0, temp.length() - separator.length()));
		}
		if (count == 1) {
			System.out.println(word);
		}
	}
}
