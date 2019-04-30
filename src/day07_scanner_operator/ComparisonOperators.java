package day07_scanner_operator;

public class ComparisonOperators {
	public static void main(String[] args) {
//
//		== equals
//		!= not equal
//      >  greater than
//		>= greater than or equals to
//		<  less than
//		<= less than or equals to
//		
//		
//		
//		
//		
//		
		
		int speedLimit = 55;
		int currentSpeed = 75;
		
		System.out.println(currentSpeed == speedLimit);
		
		boolean atLimit = currentSpeed == speedLimit;
		
		System.out.println("At Speed Limit: " + atLimit);
		
		boolean overLimit = currentSpeed > speedLimit;
		
		System.out.println("Over speed limit: " + overLimit);
		
		boolean underLimit = currentSpeed < speedLimit;
		
		System.out.println("Under speed limit: " + underLimit);
		
		
		
		
		System.out.println();
		
		double balance = 150.0;
		
		boolean broke = balance <= 0;
		
		System.out.println("Broke? - " + broke);
		
		double transaction = 155.5;
		
		broke = (balance - transaction) < 0;
		
		System.out.println("Will ake broke/negative? = " + broke);
		
		System.out.println("Balance: " + balance);
		
		System.out.println("Transaction: " + transaction);
		
		
		
		
}
}
