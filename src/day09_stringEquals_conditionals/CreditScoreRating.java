package day09_stringEquals_conditionals;

import java.util.*;
public class CreditScoreRating {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while (i >0) {

		System.out.println("Enter your credit score:");
		int creditScore = scan.nextInt();
		
		if (creditScore >= 750 && creditScore <= 850) {
			System.out.println("Excellent \n");
		}else if (creditScore >= 700 && creditScore <750) {
			System.out.println("Good \n");
		}else if (creditScore >= 650 && creditScore < 700) {
			System.out.println("Fair \n");
		}else if (creditScore >=550 && creditScore < 650) {
			System.out.println("Bad \n");
		}else if (creditScore <= 549 && creditScore >= 0) {
			System.out.println("Poor \n");
		}else if (creditScore > 850) {
			System.out.println("Invalid score!");
		}
		
		

		}
		scan.close();
	}

}
