package day18_while_dowhile_loops;

public class Students {
	public static void main(String[] args) throws InterruptedException {
		int numberOfStudents = 1;
		
		while (numberOfStudents <=10) {
			System.out.println("Student " +numberOfStudents);
			numberOfStudents++;
			Thread.sleep(1000); //PAUSE THE CODE EXECUTION FOR A SECOND
		}
		if (numberOfStudents >10) {
			System.out.println("No more space");
		}
	}

}
