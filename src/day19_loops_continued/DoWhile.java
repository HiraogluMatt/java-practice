package day19_loops_continued;

public class DoWhile {
	public static void main(String[] args) {
		int i = 1;

		do {
			System.out.println(i);
			i++;

		} while (i <= 10);
		
		System.out.println();

		int sum = 0;
		int a = 1;

		do {
			sum += a;
			a++;
		} while (a <= 5);
		System.out.println("Total for 1 through 5 is: " + sum);
	}

}
