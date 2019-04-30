package day03_helloworld_variables;

import java.util.Scanner;
public class HelloWorld {
	public static void main(String [] args) {
		System.out.println("Hello World!");

		Scanner input = new Scanner(System.in);
        System.out.print("Enter something > ");
        String inputString = input.nextLine();
        System.out.print("You entered : ");
        System.out.println(inputString);
        System.out.print("Enter something again > ");
        String inputString2 = input.nextLine();
        System.out.print("You entered : ");
        System.out.println(inputString + " " + inputString2);
        input.close();
	}
}

