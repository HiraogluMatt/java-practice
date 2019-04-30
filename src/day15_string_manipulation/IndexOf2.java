package day15_string_manipulation;

public class IndexOf2 {
	public static void main(String[] args) {
		// index of with 2 inputs

		String list = "html-selenium-angular-jenkins-grid";
		int firstDash = list.indexOf("-");
		System.out.println("First dash: " + firstDash);

		int secondDash = list.indexOf("-", firstDash + 1);
		System.out.println("Second dash: " + secondDash);

		int thirdDash = list.indexOf("-", secondDash + 1);
		System.out.println("Third dash: " + thirdDash);

		int lastDash = list.lastIndexOf("-");
		System.out.println("Last dash: " + lastDash);

		//substring returns part of the string.
		
		String sentence = "Java string manipulation is fun!";
		
		System.out.println(sentence.substring(0, 4));
		System.out.println(sentence.substring(5, 11));
		
		
		
		
		
		
		
		
	}

}
