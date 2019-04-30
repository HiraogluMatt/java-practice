package day13_ternary_strings_intro;

public class TernaryConditionalStatement {
	public static void main(String[] args) {
		
		int max;
		int num1 = 100;
		int num2 = 50;
		
		if (num1 > num2) {
			max = num1;
		}else {
			max = num2;
		}
		
		System.out.println(max);
		
		// SAME AS BELOW
		
		max = num1 > num2 ? num1 : num2;
		
		System.out.println(max);
	}

	
	
	
}
