package day34_methods06;

import java.util.Arrays;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(countArray(new int[] { 2, 3, 4, 5, 2 }, 2));
		System.out.println(Arrays.toString(getArray()));

	}

	public static int countArray(int[] a, int b) {
		int occurances = 0;
		for (int indexes : a) {
			if (b == indexes) {
				occurances++;
			}
		}
		return occurances;
	}
	
	public static int[] getArray() {
		int[] arrayOfInts = {2,7,2,8,5};
		return arrayOfInts;
	}

}
