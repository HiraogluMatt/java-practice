package day21_loopspractice;

import java.util.*;

public class ConvertCharToString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();
		String temp = str.substring(0, n);

		if (str.length() < 2) {
			System.out.println(false);
			return;
		}

		int count = 0;
		for (int i = 0; i <= str.length() - n; i++) {
			String temp1 = str.substring(i, i + n);
			if (temp1.contains(temp)) {
				count++;
			}
		}

		if (n <= count) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}