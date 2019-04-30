package day31_methods03;

public class Google {
	public static void main(String[] args) {
		GoogleSearchResults("About 121,000,000 results (0.75 seconds)");

	}

	public static void GoogleSearchResults(String result) {
		result = result.replace(",", "");
		result = result.replace("(", "");
		String[] arr = result.split(" ");
		System.out.println(arr[1] + "\n" + arr[3]);
	}

}
