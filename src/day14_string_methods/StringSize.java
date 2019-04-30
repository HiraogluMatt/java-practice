package day14_string_methods;

public class StringSize {
	public static void main(String[] args) {

		String str1 = "good morning";

		// check if it matches "Good Morning" and print match or not match
		// convert to all uppercase.

		if (str1.equals("Good Morning")) {
			System.out.println("Match");
		} else {
			System.out.println("Not Match");
		}

		if (str1.equalsIgnoreCase("Good Morning")) {
			System.out.println("Match - Ignore Case");
		} else {
			System.out.println("Not Match - Ignore Case");
		}

		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		str1 = str1.toUpperCase();
		System.out.println("After assignment: " + str1);

		if (str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		} else {
			System.out.println("Chained methods: do not match");
		}

		String myName = "Matt";
		System.out.println(myName.length());

		int length = myName.length();
		System.out.println("My name's length is: " + length);

		String username = "HiraogluMatt";
		if (username.length() != 8) {
			System.out.println("Username must be 8 characters");
		} else {
			System.out.println("Valid Username!");
		}

		String password = "ppassword";

		if (password.length() < 8) {
			System.out.println("password must be at least 8 characters!");
		} else {
			System.out.println("Valid Password!");
		}

	}

}
