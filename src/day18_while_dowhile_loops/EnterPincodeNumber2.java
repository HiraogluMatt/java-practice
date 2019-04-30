package day18_while_dowhile_loops;

import java.util.Scanner;

public class EnterPincodeNumber2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pin = 1234;
		int enterPin = 0;
		int counter = 0;

		System.out.println("Welcome!");
		System.out.println("-------------------------------");

		while (pin != enterPin) {
			System.out.println("Enter pincode:");
			enterPin = scan.nextInt();
			counter++;
			if (counter == 3 && pin != enterPin) {
				System.out.println("Card Blocked");
				return;
			}

		}

		System.out.println("Access Granted! Welcome!");

	}

}
