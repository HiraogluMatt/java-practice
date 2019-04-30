package day18_while_dowhile_loops;

public class Staircase {
	public static void main(String[] args) {
		int i = 1;
		String a = "*";
		
		while (i <=10) {
			System.out.println(a);
			a += "*";
			i++;
		}
	}

}
