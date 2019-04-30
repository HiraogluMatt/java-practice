package day13_ternary_strings_intro;
import java.util.*;

public class CarSelector {
		public static void main(String[] args) {
			
	Scanner scan = new Scanner(System.in);
	int carType;
	double averagePrice = 0;
	String carOptions = "", brand = "";
				
			System.out.println("Which type of car are you interested in? \n"
					+ "1- American \n"
					+ "2- Japanese \n"
					+ "3- German \n"
					+ "4- Italian \n"
					+ "5- Korean");
			
			carType = scan.nextInt();
			
			switch (carType) {
			case 1:
				brand = "American";
				averagePrice = 33000;
				carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
				break;
			case 2:
				brand = "Japanese";
				averagePrice = 32000;
				carOptions = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
				break;
			case 3:
				brand = "German";
				averagePrice = 55000;
				carOptions = "Bmw, VW, Audi, Mercedes, Porsche";
				break;
			case 4:
				brand = "Italian";
				averagePrice = 85000;
				carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
				break;
			case 5:
				brand = "Korean";
				averagePrice = 25000;
				carOptions = "Kia, Hyundai, Daewoo";
				break;
			default: 
				System.out.println("Car type not available");
				return;
			}
			
			System.out.println("You selected " + brand + " car and your options are " + carOptions);
			System.out.println("Average Price: " + averagePrice);
			
			
scan.close();
}
}
