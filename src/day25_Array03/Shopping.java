package day25_Array03;
import java.util.*;

public class Shopping {
    public static void main(String[] args) {
        
        String[] product = {"Timerland Shoes", "H&M Shirt", "Swatch watch", "Adidas track suit",  "Apple Watch"};
        double[] prices = {120.0, 5.99, 150.50, 100.0, 500.30};
        int[]itemsId = {1234,12345,12346,12347,12348};
        //loop through the products and print each one in a separate line
        //print the count of the product 
        //check is prod
        System.out.println("Products count: " + product.length);
        
        if(product.length == prices.length && prices.length == itemsId.length) {
            System.out.println("Items count and prices with ids are the same");
        }else {
            System.out.println("Invalid amount of info");
            return;
        }
        for (int i = 0; i < product.length; i++) {
            System.out.println((i+1) + ") Items name: " + product[i] + " its prices is: " + prices[i] +"$ and its ID: " + itemsId[i]+"." );
        }
        System.out.println();
        
        for(String prod: product) {
            System.out.println(prod);
        }
        //print ids in reverse order
        for (int i = itemsId.length-1; i > 0; i--) {
            System.out.println(itemsId[i]);
        }
        System.out.println();
        
        //print a report with a total price
        System.out.println("###### YOUR SHOPPING RECIEPT ######");
        double totalPrice = 0.0;
        for (int i = 0; i < itemsId.length; i++) {
            System.out.println("Item"+ (i+1) + " - " + product[i] + " - " + prices[i] + "$.");
            totalPrice += prices[i];
        }
        System.out.println("Total price: $"+ totalPrice);
        //find the most expensive item in your list it as a report
        double maxPrice = 0.0;
        int maxIdx =0;
    //  String maxItem = "";
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] > maxPrice) {
                maxPrice = prices[i];
                maxIdx = i;
            //  maxItem = product[i];
            }
        }
        //find the cheapest item in the list
        //-----
   
    }
}
