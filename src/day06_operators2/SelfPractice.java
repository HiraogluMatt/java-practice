package day06_operators2;

import java.util.Scanner;
public class SelfPractice { 
	public static void main(String[] args) {
	
		Scanner a = new Scanner(System.in);
		System.out.println("Welcome!");
		System.out.println("Enter price to calculate tax!:");
		
		double price = a.nextDouble();
		Scanner b = new Scanner(System.in);
		System.out.println("Choose Current City: \n 1- New York \n 2- Virginia");
		double a1 = 5.5;
		double a2 = 7.5;
		double tax = b.nextDouble();
		if (tax == 1) {
			
			double result1 = price / a1;
			result1 = result1 + price;
			System.out.println("Your tax amount is: " + price/a1);
			System.out.println("Your price with tax for New York is: "+result1);
		}
		
		else if (tax == 2) {
			double result2 = price / a2;
			result2 = result2 + price;
			System.out.println("Your tax amount is: " + price/a2);
			 System.out.println("Price with tax for Virginia is: "+result2);
		 }
		
		a.close();
		b.close();
		
		
		

		
	}

}
