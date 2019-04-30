package day28_Multi_Dimensional_Arrays;

import java.util.*;

public class Assignment126 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeInner = 2;
		int sizeOuter = 4;
		int[] inner = { 2, 8 };
		int[] outer = { 1, 2, 2, 4 };

		Arrays.sort(inner);
		Arrays.sort(outer);
		// WRITE YOUR CODE HERE
		int count = 0;
		for (int i = 0; i < outer.length; i++) {
			for (int j = 0; j < inner.length; j++) {
				if(inner[j] == outer[i]) {
					count++;
					continue;
					
				}
			}
			
		}
		if (count >= sizeInner) {
			System.out.println(true);
		} else
			System.out.println(false);
	}
}
