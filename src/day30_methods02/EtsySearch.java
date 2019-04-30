package day30_methods02;

public class EtsySearch {
	public static void main(String[] args) {
		navigateToEtsy();
		searchForWoodenSpoon();
		printResults();
	}

	private static void navigateToEtsy() {
		System.out.println("Launch Chrome Browser");
		System.out.println("Navigate to www.etsy.com");
	}

	private static void searchForWoodenSpoon() {
		System.out.println("Type 'wooden spoon' into search field");
		System.out.println("Click on 'Search' button");

	}

	private static void printResults() {
		System.out.println("'wooden spoon' (14,720 Results)");
	}

}
