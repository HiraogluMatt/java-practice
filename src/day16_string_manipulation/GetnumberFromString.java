package day16_string_manipulation;

public class GetnumberFromString {
	public static void main(String[] args) {
		String sentence = "i wrote [236] lines of code";

		System.out.println("lines of code taken as substring: "
				+ sentence.substring(sentence.indexOf('[') + 1, sentence.indexOf(']')));

		int start = sentence.indexOf('[') + 1;
		int end = sentence.indexOf(']');
		String codeCount = sentence.substring(start, end);

		// int number = Integer.parseInt(codeCount);

		int number = Integer.valueOf(codeCount);
		System.out.println(
				"Lines of code taken as substring then converted to int by using Integer.valueOf/Integer.parseInt: "
						+ number);
	}

}
