package day06_operators2;

public class SelfPractice02 {
	public static void main(String [] args) {

		
		int counter = 0;
		int counter2 = 0;
		for (int a  = 1; a <= 10; ++a) {
			counter++;
			
			for (int i = 1; i <= 10 ; i++) {
				counter2++;
		System.out.print(a*i + " ");
		}
System.out.println();
		}
		System.out.println("variable a has been executed: "+ counter + " times.");
		System.out.println("Variable i has been executed: "+ counter2+ " times.");
		
	}

}
