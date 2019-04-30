package day20_forloop;

public class PrintEachChar {
	public static void main(String[] args) {
		String word = "Wooden Spoon";

		for (int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i));
		}
		System.out.println();
		for (int j = 0; j < word.length(); j++) {
			char letter = word.toLowerCase().charAt(j);
			if (letter != 'a' && letter != 'e' && letter != 'i' &&
					letter != 'o' && letter != 'u' && letter != ' ') {
				System.out.print(letter);
			}
		}
		System.out.println();
		for (int k = 0; k < word.length(); k++) {
			char letter = word.toLowerCase().charAt(k);
			if (letter == 'a' || letter == 'e' || letter == 'i' ||
					letter == 'o' || letter == 'u') {
				System.out.print(letter);
			}

		}
	}

}
