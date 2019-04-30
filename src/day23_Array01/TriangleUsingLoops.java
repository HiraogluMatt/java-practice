package day23_Array01;

public class TriangleUsingLoops {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				
			}System.out.println();
			
		}
		for (int k = 10; k >= 1; k--) {
			for (int l = k; l >= 1; l--) {
				System.out.print(l);
				
			}System.out.println();
			
		}
	}

}
