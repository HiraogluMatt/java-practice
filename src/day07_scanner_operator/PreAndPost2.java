package day07_scanner_operator;

public class PreAndPost2 {
	public static void main(String[] args) {

		int messages = 10;
		messages++; //11
		++messages; //12
		System.out.println("Messages: " + messages);
		
		int readMessages = --messages; //11
		System.out.println("Read Messages: " + readMessages); //11
		System.out.println("Messages: " + messages); //11
		System.out.println();
		
		int unreadMessages = readMessages--; //11 passed and then changed to 10
		System.out.println("unreadMessages: " + unreadMessages); //11
		System.out.println("readMessages: " + readMessages); //10 because it was changed in line 15
		System.out.println();
		
		int total = unreadMessages ++ - readMessages--;
		System.out.println("unreadMessages: " + unreadMessages);
		System.out.println("readMessages: " + readMessages);
		System.out.println("total: " + total);
		System.out.println();
		
		int count = 20;
		int count2 = 10;
		int totalCount = ++count + --count2;
		System.out.println("count: " + count);
		System.out.println("coun2t: " + count2);
		System.out.println("totalCount: " + totalCount);
		System.out.println();
		
		int myCount = count++ + ++count;
		System.out.println("count: " + count);
		System.out.println("myCount: " + myCount);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
