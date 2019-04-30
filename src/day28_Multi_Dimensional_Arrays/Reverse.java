package day28_Multi_Dimensional_Arrays;

public class Reverse {
	public static void main(String[] args) {
		String[] sentence = {"I", "love", "Java"};

		String reverse = "";
		for (int i = sentence.length-1; i >= 0; i--) {
			reverse += sentence[i]+ " ";
		}System.out.println(reverse);
	}

}
