package day06_operators2;

import java.util.Scanner;

public class EnterNumber {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value: ");
		String a = input.nextLine();
		System.out.println("You Entered: " + a);
		
		System.out.println("What is your name? ");
		String b = input.nextLine();
		
		System.out.println("You entered: " + b);
		input.close();
		
	}
}
