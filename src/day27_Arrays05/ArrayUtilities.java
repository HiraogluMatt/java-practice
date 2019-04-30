package day27_Arrays05;

import java.util.*;

public class ArrayUtilities {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(nums));
		String[] languages = { "Zulu", "Spanish", "Italian", "English", "Polish", "Arabic", "Uzbek" };
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		int l = Arrays.binarySearch(languages, "Zulu");
		System.out.println(l);

		int[] nums2 = { 345, 665, 3333, 11, 3, 66 };
		Arrays.sort(nums2);
		int lowest = nums2[0];
		int highest = nums2[nums2.length - 1];
		System.out.println("Lowest: " + lowest + "\nHighest: " + highest);

		// Arrays.equals() is case, length, and index sensitive!!!!
		// both arrays must be the exact same in order to return a true value.

		int[] arr1 = { 3, 5, 6 };
		int[] arr2 = { 3, 5, 6 };

		System.out.println(Arrays.equals(arr1, arr2));

		int[] array1 = { 33, 5, 6, 20 };
		int[] array2 = { 3, 4, 6 };

		System.out.println(Arrays.equals(array1, array2));

		// toString
		// equals
		// binarySearch
		// sort
		// copyOf

		double[] d1 = { 2.3, 4.5, 12.4 };
		double[] d2 = d1;

		d1[0] = 1000.3;

		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));

	}
}
