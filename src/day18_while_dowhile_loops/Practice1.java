package day18_while_dowhile_loops;

public class Practice1 {
	public static void main(String[] args) throws InterruptedException {
		int num = 11;
		while (num > 0) {
			System.out.print(num + " ");
			num--;
			Thread.sleep(1000);
		}
	}

}