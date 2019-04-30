package day23_Array01;

public class Array2 {
	public static void main(String[] args) {
		String[] names = new String[3];
		String[] names2 = { "Shaun", "Roman", "Vlad" };

		System.out.println(names2[1]);
		System.out.println();

		for (int i = 0; i < names2.length; i++) {
			System.out.print(names2[i] + " ");
		}

		System.out.println();
		System.out.println();

		String[] fruits = new String[] { "apples", "oranges" };
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

	}

}
