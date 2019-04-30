package day34_methods06;

import java.util.*;

public class VarAgs {
	public static void main(String[] args) {
		printWords("hi", "hello");
		System.out.println(sum(12, 4, 6, 8, 9));

		int budget = 200;
		if (sum(10 + 45 + 110 + 30) <= budget) {
			System.out.println("within budget");
		} else {
			System.out.println("Broke");
		}

		cook("lasagna", "stuff", "and more stuff");
		sample();

	}

	public static String samp() {
		var msg = "";
		return msg;
	}

	public static void sample(String... a) {
		printWords("cat", "dog", "sheep", "helicopter");
		String[] arr = { "cat", "dog", "sheep", "helicopter" };
		System.out.println();
		printWords(arr);
	}

	public static void printWords(String... words) {
		for (String w : words) {
			System.out.println(w);
		}
	}

	public static int sum(int... input) {
		int sum = 0;
		for (int a : input) {
			sum += a;
		}
		return sum;
	}

	public static void cook(String name, String... ings) {
		System.out.print("Food: " + name + " ");
		System.out.println(Arrays.toString(ings));
	}

}
