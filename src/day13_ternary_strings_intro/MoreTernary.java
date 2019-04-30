package day13_ternary_strings_intro;
import java.util.*;
public class MoreTernary {
	  public static void main(String[] args) {
			
		  String result;
			int score = 48;
//			if(score > 60) {
//				result = "pass";
//			}else {
//				result = "fail";
//			}
//			System.out.println("result is: " + result);
//			
			result = score > 60 ? "pass" : "fail"; // ternary
			System.out.println("your result is: " + result);
			
			String quality = "good";
			int x = (quality.equals("good")) ? 100 : 0 ; // it always should be same data type in if else part
			System.out.println("result is : " + x);
			
			int pmHour = 6;
			boolean rushHour;
			
			rushHour = (pmHour >= 4 && pmHour <= 7) ? true : false;
			System.out.println(pmHour + " oclock, is it rush hour: " + rushHour);
			
			String result1 = rushHour == true ? "yes" : "no";
			System.out.println(rushHour + " oclock, is it rush hour: " + result1);
			
			int amHour = 8; // 6-9
			String amRushHour = amHour >=6 && amHour <=9 ? "yes" : "no";
			System.out.println(amHour + " oclock in the morning, is it rush hour: " + amRushHour);
			

		}

	}