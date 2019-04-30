package day30_methods02;

import java.util.*;

public class ShowMe5Numbers {
	/*
	 * method name: showMe5Numbers return type: void params: no prints 5 random
	 * numbers 0, 1000 in same line separated by comma Ex: showMe5Numbers(); 345,
	 * 234, 566, 2, 23
	 */

	public static void showMe5Numbers() {
		Random r = new Random();

		for (int i = 1; i < 6; i++) {

			System.out.print((r.nextInt(1001)) + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		showMe5Numbers();

		showMe5Numbers();

		showMe5Numbers();

		doPush10Ups();

		rangePrint();

	}

	public static void doPush10Ups() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Pushup - " + i);
		}
		System.out.println("Time to rest");
	}

	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer:");
		int first = scan.nextInt();
		System.out.println("Enter second integer:");
		int second = scan.nextInt();

		if (first > second) {
			for (int i = first; i >= second; i--) {
				System.out.print(i + " ");
			}

		} else {
			for (int i = first; i <= second; i++) {
				System.out.print(i + " ");
			}
		}

	}
}