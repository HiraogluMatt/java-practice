package day31_methods03;

public class WarmUp {
	public static void main(String[] args) {

		countDown(-5);
		countUp(8);

	}

	public static void countUp(int num) {
		if (num < 1) {
			System.out.print("invalid input");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}

	public static void countDown(int num) {
		if (num < 1) {
			System.out.print("invalid input");
		} else {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}

}
