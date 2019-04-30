package day24_Array02;

import java.util.*;

public class LotteryTicket {
	public static void main(String[] args) {
		int[] lotteryNumbers = { 12, 45, 3, 62, 42, 90 };

		System.out.println(Arrays.toString(lotteryNumbers));
		Arrays.sort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));

		// binary search work only with sorted array
		int index = Arrays.binarySearch(lotteryNumbers, 90);
		System.out.println(index);
		// if we will provide invalid value to search(value doesn't exist)
		int index2 = Arrays.binarySearch(lotteryNumbers, 13);// it will return some negative number
		System.out.println(index2);

	}

}
