package day19_loops_continued;

import java.util.*;

public class Transaction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int counter = 0;
		double balance = 7982.52;
		System.out.println("Current balance: $" + balance);
		while (balance > 0) {

			System.out.println("What is the transaction amount?");
			double i = scan.nextDouble();
	
			while (i <= 0) {
				System.out.println("Invalid amount!");
				System.out.println("Enter new transaction amount:");
				i = scan.nextDouble();

			}

			while (i > balance) {
				System.out.println("Insufficient Funds!");
				System.out.println("Enter new transaction amount:");
				i = scan.nextDouble();
				
				while (i <= 0) {
					System.out.println("Invalid amount!");
					System.out.println("Enter new transaction amount:");
					i = scan.nextDouble();

				}

			}

			balance -= i;
			counter++;
			System.out.println("Transaction successful");
			System.out.println("Transaction count: " + counter);
			System.out.println("Remaining balance: $" + balance);
		}
		System.out.println("You're broke!");
		scan.close();
		return;

	}

}
