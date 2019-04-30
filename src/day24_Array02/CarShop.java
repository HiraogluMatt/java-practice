package day24_Array02;

import java.util.Arrays;

public class CarShop {
	public static void main(String[] args) {
		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };
		String o = "";

		for (String s : cars) {
			o = s.toLowerCase().contains("r") ? s + " " : "";
			System.out.print(o);
		}
		System.out.println();
		System.out.println("**********************");

		for (String s : cars) {
			o = s.length() >= 6 ? s + " " : "";
			System.out.print(o);
		}
		System.out.println();
		System.out.println("**********************");
		String temp = cars[0];
		cars[0] = cars[cars.length - 1];
		cars[cars.length - 1] = temp;

		System.out.println(cars[0]);
		System.out.println(cars[cars.length - 1]);

		System.out.println();
		System.out.println("**Before alphabetical sorting");
		System.out.println(Arrays.toString(cars));
		Arrays.sort(cars);
		System.out.println("**After alphabetical sorting");
		System.out.println(Arrays.toString(cars));

		System.out.println("Ford is in index: " + Arrays.binarySearch(cars, "Ford"));

	}
}
