package day06_operators2;

import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("Even or Odd?");
		System.out.println("Enter Number:");
		int num = a.nextInt();
		int result = num % 2;

		if (result > 0) {
			System.out.println("Number is: Odd");
		} else {
			System.out.println("Number is: Even");
			
		a.close();
		}
	
	}
}