package day12_switch_ternary;
import java.util.*;

public class ThreeNums {
	  public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);
		    
		    System.out.println("Enter 3 numbers and i will tell you which is largest!");
		    
		    
		    int n1 = s.nextInt();
		    int n2 = s.nextInt();
		    int n3 = s.nextInt();
		    
		    //your code here
		  
		  if (n1 == n2) {
			  System.out.println(n1 + " and " + n2 + " are equal");
		  }else if (n1 == n3) {
			  System.out.println(n1 +" and "+ n3 + " are equal");
		  }else if (n2 == n3) {
			  System.out.println(n2 +" and "+ n3 + " are equal");
		  }else if (n1 == n2 && n1 == n3) {
			  System.out.println("All numbers are equal");
		  }
		    
		    
		  if (n1 > n2 && n1 > n3){
		    System.out.println(n1+" is bigger");
		  }else if (n2 > n3 && n2 > n1){
		    System.out.println(n2+" is bigger");
		  }else if (n3 > n2 && n3 > n1){
		    System.out.println(n3+" is bigger");
		  }


		  

		    s.close();
		  }
		}


