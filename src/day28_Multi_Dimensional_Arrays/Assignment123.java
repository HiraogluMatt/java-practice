package day28_Multi_Dimensional_Arrays;

import java.util.*;

public class Assignment123 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int decimal = input.nextInt();
		int[] binary = new int[8];

		// TODO: Write your code below.
		int[] Value = { 128, 64, 32, 16, 8, 4, 2, 1 };
		for (int i = 0; i < Value.length; i++) {
			if (decimal >= Value[i]) {
				binary[i] = 1;
				decimal = decimal - Value[i];
			}

		}
		System.out.println(Arrays.toString(binary));
	}
}
