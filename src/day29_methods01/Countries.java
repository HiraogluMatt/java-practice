package day29_methods01;

import java.util.Arrays;

public class Countries {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[][] countries = { 
				{ "USA", "Washington DC" }, 
				{ "Canada", "Ottawa" }, 
				{ "Mexico", "Mexico city" },
				{ "Brazil", "Brasilia" }, 
				{ "Peru", "Lima" }, 
				{ "Argentina", "Buenos Aires" }, 
				{ "Bolivia", "La Paz" },
				{ "Macedonia", "Scopia" }, 
				{ "Kazakhstan", "Nursultan" } 
				};

		// String[][] c = new String [9][2];
		// c[0][0] = "USA"; c[0][1] = "Washington, DC";
		// Print USA with Capital city

		System.out.println(countries[0][0] + ", " + countries[0][1]);
		for (int i = 0; i < countries.length; i++) {
			if (i == countries.length - 1) {
				System.out.print(countries[i][0]);
			} else
				System.out.print(countries[i][0] + "|");
		}
		System.out.println();
		System.out.println("***");

		for (String[] n : countries) {
			System.out.print(n[0] + "|");
		}

		String[] cities = new String[countries.length];

		for (int i = 0; i < countries.length; i++) {
			cities[i] = countries[i][1];
		}
		System.out.println();
		System.out.println(Arrays.toString(cities));
 
		String checkForCap = "Buenos Aires";
		for (String[] checkCap : countries) {
			if (checkCap[1].equalsIgnoreCase(checkForCap)) {
				System.out.println(checkForCap + " is the capital of: " + checkCap[0]);
			}
		}

	}
}