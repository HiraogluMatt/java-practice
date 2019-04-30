package day32_methods04;

import java.util.Arrays;

public class ArrayParameters {
	public static void main(String[] args) {
		int[] myArray = { 44, 22, 66, 11 };
		printArray(myArray);
		
		int[] firstArray = {1,2,3,4,5,6,7,8,9,0};
		int[] secondArray = {1,2,3,4,5};
		
		print2Arrays(firstArray, secondArray);
	}

	public static void printArray(int[] nums) {
		System.out.println(Arrays.toString(nums));
	}
	
	public static void print2Arrays(int[] nums , int[] nums2) {
		if(nums.length > nums2.length) {
			printArray(nums);
			printArray(nums2);
		}else if (nums2.length > nums.length) {
			printArray(nums2);
			printArray(nums);
		}
	}

}
