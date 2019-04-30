package day32_methods04;

public class MethodWithReturn {
	public static void main(String[] args) {

		System.out.println(giveMe10$());
		System.out.println(giveMeYourName());
	}

	public static int giveMe10$() {
		System.out.println("Returning 10 from the method");
		return 10;
	}

	public static String giveMeYourName() {
		String name = "The name's Bond, James Bond!";
		return name;
	}
	
}
