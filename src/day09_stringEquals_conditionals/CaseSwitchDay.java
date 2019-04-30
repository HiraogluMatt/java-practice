package day09_stringEquals_conditionals;
import java.util.*;
public class CaseSwitchDay {
public static void main(String[] args) {
	int i =1;
	Scanner scan = new Scanner(System.in);
	
	
	while (i > 0) {
	System.out.println("Enter 1-4 for the following: \n 1- English \n 2- Spanish \n 3- French \n 4- Turkish");
	int option = scan.nextInt();
	
	switch(option) {
	case 1:{
		System.out.println("Hello! \n");
		break;
	}
	case 2:{
		System.out.println("Hola! \n");
		break;
	}
	case 3:{
		System.out.println("Bonjour! \n");
		break;
	}
	case 4:{
		System.out.println("Merhaba! \n");
		break;
	}
	}
}scan.close();
}
}
