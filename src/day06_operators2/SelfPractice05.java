package day06_operators2;
import java.util.Scanner;
public class SelfPractice05 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int i = 0;
		while (i<1) {
			System.out.println("Enter num 1 - 7");
			int day = a.nextInt();
		switch(day) {
			case 1:
				System.out.println("MONDAY");
				break;
			case 2:
				System.out.println("TUESDAY");
				break;
			case 3:
				System.out.println("WEDNESDAY");
				break;
			case 4:
				System.out.println("THURSDAY");
				break;
			case 5:
				System.out.println("FRIDAY");
				break;
			case 6:
				System.out.println("SATURDAY");
				break;
			case 7: {
				System.out.println("SUNDAY");
				break;
			}
			default:
				System.out.println("Not a valid day");
				break;
		}
		
	}
		a.close();
	}

}


