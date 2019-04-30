package day16_string_manipulation;

import java.util.*;

public class URLExample {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String url = scan.next();

		// make sure it starts with www.
		// make sure it contains the ending dot
		// make sure it has com, net, edu, org, or gov

		if (url.length() >= 9) {
			if (url.startsWith("www.") && url.charAt(url.length() - 4) == '.' && url.contains("com")
					|| url.contains("net") || url.contains("edu") || url.contains("org") || url.contains("gov")) {
				System.out.println("Valid website entry!");
			}scan.close();
			return; 
		} else {
			System.out.println("invalid website entry!");
		}scan.close();
	}
}
