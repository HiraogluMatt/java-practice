package day33_methods05;

public class AgeCalculator {
	public static void main(String[] args) {

		System.out.println(calculateAge(1995));
	}

	public static int calculateAge(int year) {
		int age = 2019 - year;
		if (age < 0) {
			System.out.println("invalid age");
			return 0;
		} else if (age <= 14) {
			System.out.println("child");
		} else if (age <= 25) {
			System.out.println("young blood");
		} else if (age <= 64) {
			System.out.println("adult");
		} else if (age >= 65) {
			System.out.println("senior");
		}

		return age;
	}

}
