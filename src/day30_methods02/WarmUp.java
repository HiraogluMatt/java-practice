package day30_methods02;

import java.util.*;

public class WarmUp {
	public static void main(String[] args) {
//		public mean accessible by every class in the project. access modifier(4).

//		static - its mean does not need an object to be used or called can be called by its name if it’s 
//		in the same class or i can be called using just classname.methodname

//		void does not return a value it only performs certain statement but no return.

//		opposite will be methods that return a value;
//		String str = “java;
//		int l = str.length(); // return a number
//		print5Starts() ⇒ name of the method, cannot start with number, can contain numbers, letters, _ , $.

//		() ⇒ this means we do not need to pass to call this method.
//		str.length() ⇒ this method from string class, does not require any input/data.
//		there are no parameters/no args/ no inputs

//		String str = “html�?;    
//		str.charAt() ⇒  mast pass an int value to be used as index. charAt method requires and input/parameter/args

		for (int i = 0; i < 100; i++) {
			stars();
		}
		introduce();
	}

	public static void stars() {
		System.out.println("**********");

	}

	/*
	 * it will ask for a name and say nice to meet you
	 * 
	 */

	public static void introduce() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Whats your name?");
		String name = scan.next();
		System.out.println("Nice to meet you " + name);

	}

}

