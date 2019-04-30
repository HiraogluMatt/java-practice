package day07_scanner_operator;

public class EnoughPizza {
	public static void main(String [] args) {
		//Slices in pizza 8
		//Slices per student 2
		
		int pizzaCount = 37;
		int studentCount = 145;
		
		boolean isEnoughPizza = (pizzaCount * 8) >= (studentCount * 2);
		
		System.out.println("Is there enough Pizza? " + isEnoughPizza);
		
		
		
		
		
	}
}
