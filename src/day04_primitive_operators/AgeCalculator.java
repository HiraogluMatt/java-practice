package day04_primitive_operators;

public class AgeCalculator {
	public static void main(String[] args) 
	{
		int yearOfBirth      = 1995;
		int currentYear      = 2019;
		int age              = currentYear - yearOfBirth;
		
		System.out.println("If you are born in " + yearOfBirth + ",");
		System.out.println("Then, you are " + age + " years old.");
	
}
}
