package day31_methods03;

import java.util.*;

public class Car {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter car: ");
		String car = scan.nextLine();
		System.out.println("Enter speed: ");
		int speed = scan.nextInt();

		drive(car, speed);
	}

	public static void drive(String car, int speed) {
		if (speed == 0) {
			System.out.println(car + " is parked");
		} else if (speed < 1) {
			System.out.println(car + " cannot drive in negative speed");
		} else
			System.out.println(car + " is driving " + speed + " mph");
	}
}
