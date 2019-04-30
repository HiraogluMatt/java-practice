package day24_Array02;

public class Cities {
	public static void main(String[] args) {
		String[] cities = { "Washington, D.C.", "Kiev", "Annandale", "Moscow", "Istanbul", "Baku" };
		System.out.println(cities.length);
		
		for (int i = 0; i < cities.length; i++) {
			if(cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
		}
		System.out.println();
		
		for(String city: cities) {
			System.out.println(city);
		}
	}
}
