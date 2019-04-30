package day08_casting_conditionals;

public class ImplicitCasting {
	public static void main(String[] args) {
		// automatic casting from smaller to larger type.

		short shortValue = 3455;
		// no need to put (int) in front of shortValue because it is implicit casting.
		// OPTIONAL: int intValue = (int)shortValue;
		int intValue = shortValue;
		System.out.println("intValue: " + intValue);
		System.out.println();

	}

}
