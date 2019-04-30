package day12_switch_ternary;

import java.util.*;

public class CalculatorV01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		while(i > 0) {
		
		System.out.println("Enter first number:");
		double firstNum = scan.nextDouble();
		System.out.println("Enter second number:");
		double secondNum = scan.nextDouble();	
		System.out.println("Choose operation! \n"
				+ "1- Addition        + \n"
				+ "2- Subtraction     - \n"
				+ "3- Multiplication  * \n"
				+ "4- Division        / \n"
				+ "5- Remainder       %");
		
		String operator = scan.next();
		

		
		
		
		if (operator.equals("+")) {
			System.out.println("Addition result is: " + (firstNum + secondNum) + "\n");
		}else if (operator.equals("-")) {
			System.out.println("Subtraction result is: " + (firstNum - secondNum) + "\n");
		}else if (operator.equals("/")) {
			System.out.println("Division result is: " + (firstNum / secondNum) + "\n");
		}else if (operator.equals("*")) {
			System.out.println("Multiplication result is: " + (firstNum * secondNum) + "\n");
		}else if (operator.equals("%")) {
			System.out.println("Division with remainder is: " + (firstNum / secondNum) + " with a remainder of " +
					(firstNum % secondNum));
		}else {
			System.out.println("Error: Incorrect Operator Input!");
		}
		
		
		
		
	}
scan.close();
}}
