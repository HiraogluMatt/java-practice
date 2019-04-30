package day24_Array02;

import java.util.Arrays;

public class SumOfTheNumbers {
	public static void main(String[] args) {
		int[] numbers = new int[3];

		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 20;

		System.out.println(Arrays.toString(numbers));

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];

		}
		System.out.println(sum);

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}

		}
		System.out.println("Largest value is: " + max);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("Lowest value is: " + min);
	}

}
