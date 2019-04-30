package day19_loops_continued;

public class Amazon {
	public static void main(String[] args) {

		/*
		 * 
		 * convert Amazon to azonAm without substring... use charAt and loop
		 * 
		 * 
		 * 
		 */

		String am = "Amazon";
		int i = 2;
		String am2 = "";

		while (i < am.length()) {
			am2 += am.charAt(i);
			i++;
		}
		i = 0;
		while (i < 2) {
			am2 += am.charAt(i);
			i++;
		}

		System.out.println(am2);
	}

}
