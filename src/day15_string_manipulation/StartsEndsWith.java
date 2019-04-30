package day15_string_manipulation;

public class StartsEndsWith {
	public static void main(String[] args) {
		String word1 = "eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("E") + "\n");
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("lipse"));
	
		String word2 = "Mr. Jackson;";
		
		if(word2.startsWith("Mr.")) {
			System.out.println("Man");
		}else if(word2.startsWith("Mrs.")) {
			System.out.println("Married woman");
		}else if(word2.startsWith("Ms.")) {
			System.out.println("Some woman");
		}else if(word2.startsWith("Dr.")) {
			System.out.println("Doctor man or woman");
		}else {
			System.out.println("Unknown status");
		}
		
		
		
		
		
		
	}

}
