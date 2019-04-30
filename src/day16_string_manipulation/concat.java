package day16_string_manipulation;

public class concat {
	public static void main(String[] args) {
		String word = "Java";
		System.out.println(word);
		
		word = word.concat(" is fun");
		System.out.println(word);
		
		System.out.println(word.concat(" - cucumber"));
		
		String chars = "<<>>";
		String newword = "va";
		
		System.out.println(chars.substring(0,2)+newword+chars.substring(2));
		
		
		
	}

}
