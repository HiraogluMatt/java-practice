package day06_operators2;

import java.util.*;

public class SelfPractice04 {
	public static void main(String[] args) {
		   //WRITE YOUR CODE HERE
		   
		   byte  numberOfPeople;
		   double checkAmount, totalTip = 0;
		   String split, serviceQuality, numberOfPeople1 = null;
		   
		   Scanner scan = new Scanner(System.in);
		   
		   System.out.println("Split:");
		   split = scan.next();
		   
		   if (split.equalsIgnoreCase("Yes")){
		     System.out.println("Number of people:");
		     numberOfPeople = scan.nextByte();
		     switch (numberOfPeople) {
		       case 1:
		         numberOfPeople1= "&";
		         break;
		         case 2:
		         numberOfPeople1="&&";
		         break;
		         case 3:
		         numberOfPeople1="&&&";
		         break;
		         case 4:
		         numberOfPeople1="&&&&";
		         break;
		         case 5:
		         numberOfPeople1="&&&&&";
		         break;
		         case 6:
		         numberOfPeople1="&&&&&&";
		         break;
		         case 7:
		         numberOfPeople1="&&&&&&&";
		         break;
		         case 8:
		         numberOfPeople1="&&&&&&&&";
		         break;
		         case 9:
		         numberOfPeople1="&&&&&&&&&";
		         break;
		         case 10:
		         numberOfPeople1="&&&&&&&&&&";
		         break;
		         default:
		         break;
		     }
		     System.out.println("Check amount:");
		     checkAmount = scan.nextDouble();
		     System.out.println("Service Quality:");
		     serviceQuality = scan.next();
		     if (serviceQuality.equalsIgnoreCase("Excellent")) {
		    	  totalTip = (checkAmount / 100) * 25;
		      }if (serviceQuality.equalsIgnoreCase("Great")) {
		    	  totalTip = (checkAmount / 100 ) *20;
		      }if (serviceQuality.equalsIgnoreCase("Good")) {
		    	  totalTip = (checkAmount / 100 ) *15;
		      }if (serviceQuality.equalsIgnoreCase("Fair")) {
		    	  totalTip = (checkAmount / 100 ) *10;
		      }if (serviceQuality.equalsIgnoreCase("Poor")) {
		    	  totalTip = (checkAmount / 100 ) *5;
		      }
		      
		      System.out.println("Number of people entered: "+numberOfPeople1);
		      System.out.println("Total to pay: " + (checkAmount + totalTip));
		      System.out.println("Total tip: " + totalTip);
		      System.out.println("Total per person: " + ((checkAmount + totalTip) / numberOfPeople));
		      System.out.println("Tip per person: " + (totalTip/numberOfPeople));
		      
		      
		   }
		   
		   
		   
		   
		   
		   
	}}