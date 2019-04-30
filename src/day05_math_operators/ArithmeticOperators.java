package day05_math_operators;

public class ArithmeticOperators {
	public static void main(String[] args) {
		//+ - Addition operator
		System.out.println(55+5);
		
		int chairs = 140;
		System.out.println(chairs + 2);
		
		int moreChairs = chairs + 5;
		System.out.println(moreChairs);
		
		int tables = 130;
		int total = tables + chairs;
		System.out.println(total);
		
		// - Substraction, Minus
		System.out.println(500-123);
		int result = 44-23;
		System.out.println(result);
		
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance-transaction);
		balance = balance - transaction;
		System.out.println(balance);
		
		int linesOfCode = 50;
		System.out.println("lines of code " + linesOfCode);
		linesOfCode = linesOfCode -2;
		System.out.println("lines of code " + linesOfCode);
		
		// * Multiplication
		System.out.println(22*2);
		
		//Declare variables classes and assign 5
		int classes =5;
		System.out.println(linesOfCode * classes);
		
		int totalLinesOfCode = linesOfCode * classes;
		//totalLinesOfCode=240
		System.out.println("totalLinesOfCode=" + totalLinesOfCode);
		
		//Division operator /
		System.out.println(10/3);
		System.out.println(55/5);
		System.out.println(10.0/3);
		System.out.println(15/7);
		System.out.println(15.0/7);
		System.out.println(5.0/2);
		System.out.println(5/2);
		
		//System.out.println(11/0); // WILL THROW EXCEPTION WHILE RUNNNING THE CODE
		
	}

}
