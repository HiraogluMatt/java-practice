package day08_casting_conditionals;

import java.util.*;

public class GradeCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("### START PROGRAM ###");
		System.out.println("Enter Grade: ");
		char grade = scan.next().charAt(0);
		if (grade == 'A') {
			System.out.println("Excellent Job! Keep it up!");
			System.out.println();
		} else {
			System.out.println("How many points did you miss for the 'A'");
			int points = scan.nextInt();
			System.out.println("You could earn " + points + " more points if you studied harder!");
			System.out.println("### END OF PROGRAM ###");

		}
		scan.close();

	}

}
