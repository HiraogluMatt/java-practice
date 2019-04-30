package day19_loops_continued;

import java.util.*;

public class GuessANumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int secretNumber = random.nextInt(101);
		int guessNumber = 5;
		int counter = 0;

		do {
			if (counter >= 5) {
				System.out.println("Out of chances!");
				System.out.println("Correct number was: " + secretNumber);
				return;
			}
			System.out.println("Guess a number:");
			guessNumber = scan.nextInt();
			if (guessNumber < secretNumber) {
				System.out.println("Your number is too small");
			} else if (guessNumber > secretNumber) {
				System.out.println("Your number is too large");
			}
			counter++;
			System.out.println("Chances remaining: " + (5- counter));
		} while (guessNumber != secretNumber);

		System.out.println("Bingo!");

	}	
}
