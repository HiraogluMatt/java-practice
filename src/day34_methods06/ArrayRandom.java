package day34_methods06;

import java.util.*;

public class ArrayRandom {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getRandomArray(20)));

	}

	public static int[] getRandomArray(int size) {
		int[] randomArray = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			randomArray[i] = random.nextInt(100);
		}
		return randomArray;
	}

}
