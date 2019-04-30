package day15_string_manipulation;

public class Contains {
	public static void main(String[] args) {
		String word = "test@gmail.com";

		System.out.println(word.contains("@"));

		String list = "potatoes, apples, tomatoes, eggs, milk, bread, cereal, meat";

		if (list.contains("apples")) {
			System.out.println("Apples are there");
		} else {
			System.out.println("Let's add apples now!");
		}

		boolean hasEggs = list.contains("eggs");

		System.out.println("Contains eggs: " + hasEggs);

		boolean hasCucumber = list.toLowerCase().contains("cucumber");

		System.out.println("Contains cucumber: " + hasCucumber);

		String email = "email@yahoo.com";

		if (email.contains("@yahoo.com")) {
			System.out.println("Yahoo account");
		} else if (email.contains("@gmail.com")) {
			System.out.println("Google account");
		} else if (email.contains("@hotmail.com")) {
			System.out.println("Hotmail account");
		}

		String etsyTitle = "Wooden spoon | Etsy";

		if (etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		} else {
			System.out.println("Pipe is not detected");
		}
		
		String name = "abcde";
		
		System.out.println(name.contains("a") || name.contains("e"));
		
		
		
		

	}

}
