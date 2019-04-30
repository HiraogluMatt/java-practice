package day06_operators2;

import java.util.Scanner;
public class MinutesToHours {
	public static void main(String[] args) {
int d = 1;
		Scanner mins = new Scanner(System.in);
		System.out.println("-------Welcome!-------");
		while (d >0) {
		System.out.println("----Enter Minutes:----");
		System.out.print("--->");
		
		
		int minutes = mins.nextInt();
		int hours;
		int remainingMinutes;
		
		if (minutes < 60) {
			System.out.println();
			System.out.println("Result is:" + "\n" + minutes + " minutes \n");
	}	else {
		
		hours = minutes/60;
		remainingMinutes = minutes % 60;
		System.out.println();
		System.out.println("Result is: " + "\n" + hours + " hours, and " + remainingMinutes + " minutes \n");
		mins.close();
	}
	}

}
}