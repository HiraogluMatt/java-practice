package day11_logical_nestedif;
import java.util.*;

public class Login {
	public static void main(String[] args) {
		String validUserName = "cybertek@gmail.com", validPassword = "WoodenSpoons123";
		String username, password;
		Scanner scan = new Scanner(System.in);
		int i=1;
		while(i>0) {
		
		System.out.println("Enter Username: ");
		username = scan.nextLine();
		System.out.println("Enter Password: ");
		password = scan.nextLine();
		
		if (username.equalsIgnoreCase(validUserName) && password.equals(validPassword)) {
			System.out.println("Login Successful! Welcome!");
		}else if(!username.equalsIgnoreCase(validUserName) && password.equals(validPassword)) {
			System.out.println("Invalid Username!");
		}else if(username.equalsIgnoreCase(validUserName) && !password.equals(validPassword)) {
			System.out.println("Invalid Password!");
		}else if(!username.equalsIgnoreCase(validUserName) && !password.equals(validPassword)) {
			System.out.println("Invalid Username and Password!");
		}}scan.close();
	}

}
