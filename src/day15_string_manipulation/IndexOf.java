package day15_string_manipulation;

public class IndexOf {
	public static void main(String[] args) {
		
		String word1 = "giiithub";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		
		System.out.println(word1.indexOf("java"));
		
		System.out.println();
		
				if (word1.indexOf("hub") < 0) {
			System.out.println("Not in string!");
		}else {
			System.out.println("Found! located at index: " + word1.indexOf("hub"));
		}
				
		System.out.println();
				
		int letter = 0;
for (int i = 0; i < word1.length(); i++) {
	if (word1.charAt(i) == 'i') {
		letter = letter + 1;
		
	}
}
System.out.print("There are " + letter + " i's in " + word1 + ".");
	
	

		
		
		
	}
}
		
		
		
		

