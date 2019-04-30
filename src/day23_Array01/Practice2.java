package day23_Array01;

public class Practice2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i % 5 == 0 && i % 20 != 0) {
				continue;
			} else if (i % 20 == 0) {
				break;
			}
			System.out.print(i + " ");
		}System.out.println();
		System.out.println();

		
		for (int l = 1; l <=3; l++) {
			
		
		for (int j = 1; j <= 2; j++) {
			for (int k = 1; k <= 10; k++) {
				System.out.print(k + " ");

			}
			System.out.println();
		}
		System.out.println("********************");
		}
	}
}
