package day21_loopspractice;

import java.util.*;

public class REGISTER {
	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
System.out.println("Welocome!");
System.out.println("How many items are you buying today?");
int itemsCount = scan.nextInt();
float totalPrice = 0;
String items = "", item = "";
for (int i = 1; i <= itemsCount; i++) {
	System.out.println("Enter the item " + (i) +" name?");
	 item += scan.next();
	System.out.println("Enter the price for " + item);
	double price = scan.nextDouble();
	items += item + ", ";
	totalPrice += price;
}System.out.println("Items purchased: " + items);

System.out.println(" Your total Price : " + totalPrice );

	}

}