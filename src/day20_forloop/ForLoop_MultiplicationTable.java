package day20_forloop;

import java.util.*;

public class ForLoop_MultiplicationTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1-10");
		int num = scan.nextInt();
		if (num < 1 || num > 10) {
			System.out.println("Error: Invalid Number");
			System.exit(0);
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (i * num));

		}
		scan.close();

	}

}
