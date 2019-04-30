package day19_loops_continued;

public class reversePrint {
	public static void main(String[] args) {
		String am = "Amazon";

		int i = am.length() - 1;

		while (i >= 0) {
			System.out.print(am.charAt(i));
			i--;
		}
		System.out.println();

		for (i = am.length() - 1; i >= 0; i--) {
			System.out.print(am.charAt(i));

		}

	}

}
