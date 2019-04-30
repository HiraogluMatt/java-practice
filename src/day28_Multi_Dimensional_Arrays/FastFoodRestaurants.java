package day28_Multi_Dimensional_Arrays;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFoodRestaurants {
	public static void main(String[] args) throws IOException {
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);

		System.out.println("Data Size: " + data.length);

		// Print each restaurant information in separate line
		int counter = 0;
		for (String lineValue : data) {
			System.out.println(counter + " " + lineValue);
			counter++;
		}
		System.out.println("***************************************");
		int inVA = 0;
		for (String containsVA : data) {
			if (containsVA.contains(",VA")) {
				inVA++;
				String[] resArr = containsVA.split(",");
				System.out.println(resArr[2] + " - " + resArr[1]);
			}
		}
		System.out.println(inVA + " Fast food restaurants in Virginia");
	}

}
