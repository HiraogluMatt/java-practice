package day14_string_methods;

public class CharAt {
	public static void main(String[] args) {
		
		String word = "Epson";
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		
		String word2 = "Java";
		if (word2.charAt(0) == 'J') {
			System.out.println("Yes J is first char!");
		}else {
			System.out.println("No J is not first char!");
		}
		
		String word3 = "Hello";
		if (word3.charAt(0) == word3.charAt(4)) {
			System.out.println("First and last are matching!");
		}else {
			System.out.println("First and last are not matching!");
		}
		
		String word4 = "Character";
		System.out.println(word4.charAt(word4.length() - 1));
		
		
		
		
	}

}
