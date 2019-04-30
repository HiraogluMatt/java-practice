package day08_casting_conditionals;

public class IfElseWithVariables {
	public static void main(String[] args) {
		int temp = 65;

		if (temp >= 65) {
			System.out.println("It's a nice day, let's code java!");
			System.out.println();
		} else {
			System.out.println("Stay home and code java");
			System.out.println();
		}

		int teamAScore = 1;
		int teamBScore = 1;

		if (teamAScore > teamBScore) {
			System.out.println("Team A won");

		} else if (teamAScore < teamBScore) {
			System.out.println("Team B won");

		} else {
			System.out.println("Its a Draw!");
			System.out.println("Go Teams!");
		}

	}
}
