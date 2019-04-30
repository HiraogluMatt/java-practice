package day28_Multi_Dimensional_Arrays;

import java.util.*;

public class Assignment122 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}

		// TODO. Write you code below this line.

		int count = 0;
		int index = 0;
		for (int i = 0; i < inhabitants.length; i++) {
			if (inhabitants[i] > count) {
				count = inhabitants[i];
				index = i;
			}

		}
		int day = 0;
		while (inhabitants[index] > 0) {
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
			for (int i = 0; i < inhabitants.length; i++) {
				inhabitants[i] = inhabitants[i] / 2;
			}
			day++;
		}
		if (day > 0) {
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
		}
		System.out.println("---- EXTINCT ----");

	}
}
