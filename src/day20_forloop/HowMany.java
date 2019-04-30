package day20_forloop;

import java.util.*;

public class HowMany {
	  public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			String sentence = input.nextLine();

			// TODO: Type your code below

			String[] words = sentence.split(" ");
			

				for (int j = words.length-1; j >= 1; j--) {

					System.out.println(words[j]);
				}
		}
		}
		    
