package day09_stringEquals_conditionals;

import java.util.*;
public class Languages {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1-4 for the following: \n 1-English \n 2- Spanish \n 3- French \n 4- Turkish");
		int option = scan.nextInt();
		if (option ==1) {
			System.out.println("Hello!");
		}if(option ==2) {
			System.out.println("Hola!");
		}if(option ==3) {
			System.out.println("Bonjour!");
		}if(option ==4) {
			System.out.println("Merhaba!");
		}
		scan.close();
	}

}


