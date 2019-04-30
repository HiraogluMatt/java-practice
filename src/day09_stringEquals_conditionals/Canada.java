package day09_stringEquals_conditionals;

import java.util.*;
public class Canada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the capital of Canada?");
		String input = scan.next();
		
		if(input.equalsIgnoreCase("ottawa")) {
			System.out.println("Your answer is correct.");
			
		}
		else {
			System.out.println("Your answer is incorrect! " + input + " is not the capital of Canada");
		}scan.close();
	}
	
}
