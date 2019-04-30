package day18_while_dowhile_loops;

public class Alphabet {
	public static void main(String[] args) throws InterruptedException {
		char letter = 'a';
		char letterUC = 'A';
		char letterUC1 = 'A';

		while (letter <= 'z') {
			System.out.print(letter + " ");
			letter++;
			Thread.sleep(10);
		}
		System.out.println();

		while (letterUC1 <= 'Z') {
			System.out.print(letterUC1 + " ");
			letterUC1++;
			Thread.sleep(10); 
		}
		System.out.println();
		
		letter = 'z';
		while (letter >= 'a') {
			System.out.print(letter + " ");
			letter--;
			Thread.sleep(10);
		}
		System.out.println();
		
		String a = "";
		while (letterUC <= 'Z') {
			a = a + letterUC;
			System.out.println(a);
			letterUC++;
			Thread.sleep(10);
			
		}

	}

}
