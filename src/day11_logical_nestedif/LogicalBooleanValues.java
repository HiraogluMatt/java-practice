package day11_logical_nestedif;

public class LogicalBooleanValues {
	public static void main(String[] args) {
		boolean b1 = 50 > 10 && 10 > 100; //false because 10 is not greater than 100
		System.out.println(b1);
		
		boolean b2 = 'a' == 'a' && 123 > 120; //true because 123 is greater than 120
		System.out.println(b2);
		
		boolean b3 = true && 10 >= 10 && 1000 <= 900; //false because 1000 is greater than 900
		System.out.println(b3);
		
		boolean b4 = false && false && 10 == 10; // false is already false
		System.out.println(b4);
		
		boolean b5 = false || true && 10 == 10; // true because the right side is true and 
		//the || (OR) statement in the middle makes the whole thing true
		System.out.println(b5);
		
		boolean b6 = false && true || 10==10;
        System.out.println("B6: " + b6);//true
        
        boolean b7 = false && true || 10==10;
        System.out.println("B7: " + b7);//true
        
        boolean b8 = false && (true || 10==10);
        System.out.println("B8: " + b8);//false
		
		boolean topicDone = true;
		boolean isMoreThan3PM = true;
		boolean everythingIsClear = true||false;
		boolean letsGOForABreak = topicDone && isMoreThan3PM && everythingIsClear;
		System.out.println("letsGoForABreak: " + letsGOForABreak);
		
		
/*
 * 
 * THE && WILL ALWAYS GO BEFORE || UNLESS ITS IN PARENTHESIS
 * 
 * 
 * 
 * 
 * 		
 */

		
		
		
	}

}
