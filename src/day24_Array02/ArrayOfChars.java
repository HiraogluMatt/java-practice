package day24_Array02;

public class ArrayOfChars {
	public static void main(String[] args) {
		char[] values = { 'a', 'b', 'c' };
		for (char value : values) {
			System.out.print(value + " ");
		}
		System.out.println();

		String str = "Wooden spoon";
		// This method converts String to Array of Characters
		char[] chars = str.toCharArray();
		for (char c : chars) {
			System.out.print(c);
		}

		System.out.println();
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);

		}
		System.out.println();
		for (char c : chars) {
			if (c == 'o') {
				System.out.print("*");
			} else
				System.out.print(c);
		}

	}

}
