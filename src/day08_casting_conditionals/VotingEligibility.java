package day08_casting_conditionals;

import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while (i > 0) {
			System.out.println("Enter Age: ");
			int age = scan.nextInt();
			int votingAge = 18;
			if (age > votingAge) {
				System.out.println("You are eligible to vote!");
				System.out.println("You have been eligible to vote for " + (age - votingAge) + " years!");
				System.out.println();
			} else if (age == votingAge) {
				System.out.println("You are eligible to vote!");
				System.out.println("This is your first year to be able to vote!");
				System.out.println();
			} else {
				System.out.println("You are NOT eligible to vote!");
				System.out.println("You still have " + (votingAge - age) + " years to be eligible!");
				System.out.println();
			}
		}
		scan.close();
	}
}
