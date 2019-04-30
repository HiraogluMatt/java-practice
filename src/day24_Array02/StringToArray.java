package day24_Array02;

public class StringToArray {
	public static void main(String[] args) {
		int counter = 0;
		String sentence = "A general-purpose language is a computer language "
				+ "that is broadly applicable across application domains, "
				+ "and lacks specialized features for a particular domain. ";
		
		String[] words = sentence.split(" ");
		
		for (String str: words) {
			if(str.toLowerCase().equals("language")) {
				break;
			}//this one says the position of the word if you put a print line with the counter
			counter++;
			System.out.println(str);
		}System.out.println("First value in the Array of Strings is: " + words[0]);
	}

}
