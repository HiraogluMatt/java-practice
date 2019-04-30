package day11_logical_nestedif;
import java.util.*;
public class TollCalculator {

	public static void main(String[] args) {
		
Scanner scan = new Scanner (System.in);
int i = 1;
while (i >0) {
System.out.println("Enter 1 for two axel car, enter 2 for more axels");
int carType= scan.nextInt();
		System.out.println("Is it rush hour? \n yes or no");
		String isRushHour = scan.next();
		boolean rushHour = true;
		if(isRushHour.equalsIgnoreCase("yes")) {
		rushHour = true;
		}else if (isRushHour.equalsIgnoreCase("no")) {
		rushHour = false;
		}

if (rushHour==true ) {
	if (carType ==1) {
		System.out.println("the price is $2.00");
	}else {
		System.out.println("the price is $4.00");
	}
}
	else if (rushHour==false ) {
		if (carType==1) {
		System.out.println("The price is $1.00");
	} else if (carType ==2) {
		System.out.println("The price is $1.50");
	}
}
	}}
}