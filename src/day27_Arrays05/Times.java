package day27_Arrays05;

import java.util.*;

public class Times {
	public static void main(String[] args) {

		int[] timeOne = { 13, 39 };
		int[] timeTwo = { 13, 59 };

		if (timeOne[0] >= 0 && timeOne[0] <= 23 && timeOne[1] >= 0 && timeOne[1] <= 59 && timeTwo[0] >= 0
				&& timeTwo[0] <= 23 && timeTwo[1] >= 0 && timeTwo[1] <= 59) {

			String timeIs = (timeOne[0] * 100) + timeOne[1] > (timeTwo[0] * 100) + timeTwo[1] ? "time 2 is earlier"
					: (timeOne[0] * 100) + timeOne[1] == (timeTwo[0] * 100) + timeTwo[1] ? "identical time"
							: "time 1 is earlier";

			System.out.println(timeIs);

		} else
			System.out.println("Invalid time");
	}
}
