package day26_Array04;

import java.util.*;

public class WarmUp {
	public static void main(String[] args) {
		String[] names = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
				"Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles",
				"Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald",
				"Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth",
				"Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward",
				"Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen", "Ryan",
				"Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley", "Stephen",
				"Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon",
				"Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
				"Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
				"Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie", "Douglas",
				"Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly", "Walter",
				"Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith", "Gerald",
				"Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean",
				"Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn",
				"Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce",
				"Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy", "Beverly",
				"Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel", "Rose", "Louis",
				"Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip", "Jane", "Logan",
				"Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };

		String namesUpto4 = "";
		String names5to6 = "";
		String names7orMore = "";

		System.out.println("Total Names in Array = " + names.length);
		System.out.println(Arrays.toString(names));

		for (int i = 0; i < names.length; i += 2) {
			System.out.println(names[i] + ", " + names[i + 1]);
		}

		for (int i = 0; i < names.length; i += 2) {
			if (i < names.length - 1) {
				System.out.print("Males Names: " + names[i] + ", ");
			} else
				System.out.print("Males Names: " + names[i]);
		}
		System.out.println();
		for (int i = 1; i < names.length; i += 2) {
			if (i < names.length - 1) {
				System.out.print("Female Names: " + names[i] + ", ");
			} else
				System.out.print("Female Names: " + names[i]);
		}
		System.out.println();
		Random random = new Random();
		int r = random.nextInt(names.length);
		System.out.println("Random Name: " + names[r]);

		for (int i = 0; i < names.length; i++) {
			if (names[i].length() <= 4) {
				System.out.print(names[i].toUpperCase() + ", ");
				namesUpto4 += names[i] + ", ";
			} else if (names[i].length() >= 5 && names[i].length() <= 6) {
				names5to6 += names[i] + ", ";
			} else{
				names7orMore += names[i] + ", ";
			}
		}
		System.out.println();
		System.out.println(names5to6);
		
		System.out.println(Arrays.toString(names));
		
		String temp = "";
		for (int i = 0; i < names.length; i+=2) {
			temp = names[i];
			names[i] = names[i+1];
			names[i+1] = temp;
		}
		System.out.println(Arrays.toString(names));
		
		String diceResult = "1 - 20 of 1,461 positions";
		String[] words = diceResult.split(" ");
		System.out.println(words[4]);
		
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		String[] Allwords = sentence.split(" ");
		String[] happySplit = sentence.split("happy");
		String[] iSplit = sentence.split("I");
		
		System.out.println(Arrays.toString(Allwords));
		System.out.println(Arrays.toString(happySplit));
		System.out.println(Arrays.toString(iSplit));
		
	}

}
