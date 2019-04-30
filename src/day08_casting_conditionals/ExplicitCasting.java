package day08_casting_conditionals;

public class ExplicitCasting {
	public static void main(String[] args) {
		System.out.println(10 / 2.0);
		System.out.println(10.0 / 2);
		System.out.println();

		int result = (int) (10 / 2.0);
		System.out.println("result: " + result);
		System.out.println();

		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;

		double avarage = (double) ((rent1 + rent2 + rent3 + rent4) / 4.0);
		System.out.println("Avarage rent: " + avarage);
		System.out.println();

		double d = 10;
		System.out.println("d: " + d);

		int i = (byte) d;
		System.out.println("i: " + i);
		// in above statement both implicit and explicit are taking place.
		// explicit is double > byte
		// implicit is byte > int

	}

}
