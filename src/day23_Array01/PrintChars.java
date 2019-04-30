package day23_Array01;

public class PrintChars {
	public static void main(String[] args) {

		for (int j = 1; j <= 5; j++) {
			if (j % 2 == 0) {
				for (int letter = 'z'; letter >= 'a'; letter--) {
					System.out.print((char) letter + " ");
				}
				System.out.println();
				System.out.println("***************************************************");
			} else {
				for (int letter1 = 'a'; letter1 <= 'z'; letter1++) {
					System.out.print((char) letter1 + " ");

				}
				System.out.println();
				System.out.println("***************************************************");
			}
		}
	}
}
