package day23_Array01;

import java.util.*;

public class WarmUp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a whole number to check if its a prime number: ");
		int n = scan.nextInt();
		int count = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Not a prime!");
		} else
			System.out.println("Prime!");
	}
}
