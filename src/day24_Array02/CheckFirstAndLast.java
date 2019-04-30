package day24_Array02;

public class CheckFirstAndLast {
	public static void main(String[] args) {
		int[] numbers = { 12, 41, 213, 21, 42, 12 };
		// .length is an instance variable and not a method.
		boolean equals = numbers[0] == numbers[numbers.length - 1];
		System.out.println(equals);
	}
}
