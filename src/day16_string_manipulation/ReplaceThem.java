package day16_string_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpaces = sentence.replace(" ", "");
		System.out.println(withNoSpaces);

		System.out.println(sentence);
		// replace , with !!!
		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);

		String mixed = "@#$%@#$j_a|v-a@#$%";
		mixed = mixed.replace(mixed, "java");
		System.out.println(mixed);

		String result = "About 115,000,000 results (0.59 seconds)";
		String newResult = result.replace("About ", "");
		newResult = newResult.substring(0, newResult.indexOf(" ")).replace(",","");
		System.out.println(newResult);
		long number = Long.parseLong(newResult);
		System.out.println(number);

	}

}
