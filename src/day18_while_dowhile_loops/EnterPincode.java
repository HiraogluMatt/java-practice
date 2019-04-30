package day18_while_dowhile_loops;
import java.util.*;

public class EnterPincode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pin = 1234;
		int enterPin = 0;
		
		System.out.println("Welcome!");
		System.out.println("-------------------------------");
		
		
		while (pin != enterPin) {
			System.out.println("Enter pincode:");
			enterPin = scan.nextInt();
			
			
			
		}
		
		System.out.println("Access Granted! Welcome!");
		
		
	}

}
