package day23_Array01;

public class Array1 {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		
		numbers [0] = num1;
		numbers [1] = num2;
		numbers [2] = num3;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		
	}

}
