package day20_forloop;

public class EvenOrOdd {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				a += i;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		for (int j = 1; j <= 100; j++) {
			if (j % 2 != 0) {
				b += j; 
				System.out.print(j + " ");
			}
		}
		System.out.println();
		System.out.println("Sum of evens: " + a);
		System.out.println("Sum of odds: " + b);

	}

}
