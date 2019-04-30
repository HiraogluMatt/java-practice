package day28_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class FootballTeams {
	public static void main(String[] args) {
		String[][] teams = new String[2][6];
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";

		teams[1][0] = "Olimjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Roman";
		teams[1][5] = "Dmitriy";

		System.out.println("First Player of First Team: " + teams[0][0]);
		System.out.println("Third Player of First Team: " + teams[0][3]);
		System.out.println("Sixth Player of Second Team: " + teams[0][0]);
		
		System.out.println("Nummber of Teams: " + teams.length);
		System.out.println("Nummber of People in First Team: " + teams[0].length);
		System.out.println("Nummber of People in Second Team: " + teams[1].length);
		
		System.out.println(Arrays.deepToString(teams));
	}

}
