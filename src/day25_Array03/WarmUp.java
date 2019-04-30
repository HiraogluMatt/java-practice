package day25_Array03;

import java.util.Arrays;

public class WarmUp {
	public static void main(String[] args) {
		int[] nums = new int[5];

		nums[0] = 123;
		nums[1] = 432;
		nums[2] = 234;
		nums[3] = 987;
		nums[4] = 345;
		nums[0] = 100;

		String out = Arrays.toString(nums);
		System.out.println(out);
	}

}
