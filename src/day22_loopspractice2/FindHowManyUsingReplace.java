package day22_loopspractice2;

public class FindHowManyUsingReplace {
	public static void main(String[] args) {
		String str = "Including webpages, images";

		int length1 = str.length();
		str = str.replace("e", "");
		int length2 = str.length();

		System.out.println("length 1: " + length1);
		System.out.println("Length 2: " + length2);
		System.out.println("Count of replaced chars: " + (length1 - length2));

	}

}
