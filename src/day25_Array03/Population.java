package day25_Array03;

import java.util.Arrays;

public class Population {
	public static void main(String[] args) {
		int[] population = { 132334, 23234, 8989344, 783234, 34234 };

		System.out.println(Arrays.toString(population));

		int idx = 0;
		System.out.println("City " + idx + " Population: " + population[idx]);

		idx++;
		System.out.println("City " + idx + " Population: " + population[idx]);

		String str = "abc";
		System.out.println("City STR.LENGTH() " + " Population: " + population[str.length()]);

		String[] cities = { "Miami", "London", "Tokyo", "Rome", "New York" };
		System.out.println();

		for (int i = 0; i < cities.length; i++) {
			System.out.println("Population of " + cities[i] + " is " + population[i]);
		}

	}

}
