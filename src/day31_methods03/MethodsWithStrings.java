package day31_methods03;

public class MethodsWithStrings {
	public static void main(String[] args) {
		countWords("Hi there, how are you?");
		
	}
	
	public static void countWords(String sentence) {
		String[] arr = sentence.split(" ");
		System.out.println(arr.length + " words");
	}

}