package day31_methods03;

import java.util.*;

public class Calculator {
	  public static String mergeStrings(String one, String two) {
		  
		    int a = one.length();
		    int b = two.length();
		    int loc = 0;
		    String merged = "";
		    
		    if(a > b){
		      for(int i = 0; i < b; i++){
		        merged += ""+one.charAt(i);
		        merged += ""+two.charAt(i);
		        loc = i;
		      }
		      merged += ""+one.substring(loc, one.length());
		      
		    }
		    return merged;
		    
		  }
		}