package day32_methods04;

public class Cooking {
	public static void main(String[] args) {
		cook("Omelette" , "Eggs, Salt, Tomatoes, Green Peppers, Onions");
	}
	
	public static void cook(String dish, String ingredients) {
		System.out.println("~~" + dish.toUpperCase() + " RECIPE~~");
		add(ingredients);
		System.out.println("Cook it until it's cooked");
		System.out.println("~~" + dish.toUpperCase() + " IS READY!~~");
	}

	public static void makePasta() {
		System.out.println("~~ITALIAN PASTA RECIPE~~");
		add("Water, Salt, Olive Oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		add("Parmesan cheese, Marinara");
		System.out.println("~~ENJOY YOUR DELICIOUS PASTA~~");
	}

	public static void makePancake() {
		System.out.println("~~PANCAKES RECIPE~~");
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("~~ENJOY YOUR DELICIOUS PANCAKES~~");
	}

	public static void add(String a) {
		System.out.println("Add " + a);
	}

	public static void mix(int i) {
		System.out.println("Mix for " + i + " seconds");
	}

	public static void fry(int i) {
		System.out.println("Fry for " + i + " minutes");
	}

	public static void boil(int i) {
		System.out.println("Boil for " + i + " minutes");
	}

}
