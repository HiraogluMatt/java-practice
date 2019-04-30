package day23_Array01;

public class PrintWord {
	public static void main(String [] args) {
		String word = "java";
		for (int i = 0; i < word.length(); i++) {
			if(word.subSequence(i, i+1).equals("a")) {
				continue;
				
			}
			System.out.println(word.substring(i, i+1));
			
		}
	}

}
