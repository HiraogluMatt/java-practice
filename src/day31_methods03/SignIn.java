package day31_methods03;

import java.util.*;

public class SignIn {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Okta!");
		System.out.println("Enter username:");
		String username = scan.next();
		System.out.println("Enter password:");
		String password = scan.next();

		login(username, password);
	}

	private static void login(String username, String password) {
		String validUserName = "mentoring@cybertekschool.com", validPassword = "mentor001";
		String output = username.equals(validUserName) ? password.equals(validPassword) ? "Login Successful! \nWelcome to Okta!":"Sign in failed!":"Sign in failed!";
		System.out.println(output);
	}
}
