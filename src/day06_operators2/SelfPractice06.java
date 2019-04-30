package day06_operators2;

import java.util.Scanner;

public class SelfPractice06 {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		String colorCode = a.nextLine();
		switch (colorCode) {
			case "R":
			case "r": 
				System.out.println("Traffic light is RED.");
				break;
			case "O":
			case "o":
				System.out.println("Traffic light is ORANGE.");
				break;
			case "G":
			case "g":
				System.out.println("Traffic light is GREEN.");
				break;
			default:
				System.out.println("Invalid color code.");
				break;
		}
		a.close();
	}
}
