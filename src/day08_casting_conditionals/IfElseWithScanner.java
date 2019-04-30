package day08_casting_conditionals;

import java.util.*;

public class IfElseWithScanner {
	public static void main(String[] args) {
		// passingPercentage = 65;
		// yourScorePercentage = take from scanner

		int passingPercentage = 65;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Test Score: ");
		int yourScorePercentage = scan.nextInt();

		if (yourScorePercentage >= passingPercentage) {
			System.out.println("You Passed!");

		} else {
			System.out.println("You Failed!");
		}
		scan.close();

	}

}
