package day28_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class Loop2DArrays {
	public static void main(String[] args) {
		String[][] pizzas = { { "pineapple", "pepperoni" }, { "anchovies", "mushroom" }, { "4 cheese" },
				{ "chicken", "tomatoes", "jalapenos", "onions" },
				{ "green peppers", "zuccini", "broccoli", "spinach", "shrimp" } };
		System.out.println(Arrays.toString(pizzas[0]));
		System.out.println("*****************************");
		for (String[] pizza : pizzas) {
			System.out.println(Arrays.toString(pizza));
		}

		System.out.println("*********FOR LOOP**********");
		for (int i = 0; i < pizzas.length; i++) {
			System.out.print(pizzas[i].length + " - ");
			System.out.println(Arrays.toString(pizzas[i]));
		}

		for (String topping : pizzas[0]) {
			System.out.println(topping);
		}

		int[][] students = { { 4, 5, 6 }, { 12, 54, 76 }, { 23, 55, 12, 55, 3 } };

		for (int[] group : students) {
			for (int studentId : group) {
				System.out.print(studentId + " ");
			}

		}
		System.out.println();
		System.out.println("******************");

		int[][] nums = { { 10, 20 }, // array #0
				{ 20, 30, 40, 50 }, // array #1
				{ 100, 200, 400 }, // array #2
				{ 555, 333, 111, 444, 666, 78 } // array #3
		};

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}
}
