package day20_forloop;
import java.util.*;

public class For_Loop2 {
	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter break time in minutes:");
		int input = scan.nextInt();
		

		for (int i = input * 60; i >= 0; i--) {
			int minutes = i /60;
			int remainingSeconds = i % 60;
			System.out.println("Break over in: " + minutes + " Minutes and " + remainingSeconds + " Seconds");
			Thread.sleep(1000);

		}

	}

}
