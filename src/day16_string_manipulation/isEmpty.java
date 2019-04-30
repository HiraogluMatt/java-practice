package day16_string_manipulation;

public class isEmpty {
	public static void main(String[] args) {
		String userName = "";
		String passWord = "";
		System.out.println(userName.isEmpty());

		if (userName.isEmpty()) {
			System.out.println("Username field cannot be empty");
		} else {
			System.out.println("Username is not empty");
		}

		if (userName.length() > 0 || passWord.isEmpty()) {
			System.out.println("Username or password cannot be empty");
		} else {
			System.out.println("Username or password is not empty");
		}

	}

}
