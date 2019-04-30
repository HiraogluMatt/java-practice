package day23_Array01;
import java.util.*;

public class BruteForce {
	public static void main(String[] args) {
		/*
		 * A brute force attack is a trial-and-error method used to obtain
		 * information such as a user password  or personal identification number
		 */
		Scanner scan = new Scanner(System.in);
		String expectedPassword = "AbaGalaMaga";
		String expectedUserName = "Harry_Potter";
		String username = "", password = "";
		int attempt = 5;
		
		do {
			
			if(attempt == 0) {
				System.out.println("You have exceeded number of attemps.");
				System.out.println("This user has been diactivated for 30 min");
				return;
			}
			attempt--;
			System.out.println("Please enter user name:");
			username = scan.next();
			if(!username.equals(expectedUserName)) {
				System.out.println("Wrong username:");
				System.out.println("Attempts left: " + attempt);
				continue;
			}
			System.out.println("Enter you password:");
			password = scan.next();
			if(!password.equals(expectedPassword)) {
				System.out.println("Wrong password");
				System.out.println("Attempts left: " + attempt);
				continue;
			}
		}while(!username.equals(expectedUserName) || !password.equals(expectedPassword));
		System.out.println("Login Successful!");
		
	}

}

