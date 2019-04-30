package day07_scanner_operator;

public class PreAndPost {

	public static void main(String[] args) {
		
		int num=0;
		int num2= num++;
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);

		int n=0;
		int n2= ++n;
		System.out.println(n);
		System.out.println(n2);
		
		int i=10;
		i++;
		++i;
		System.out.println(i);
		
		int apples = 6;
		int bananas = apples++;
		int pears = ++apples;
		
		System.out.println(apples);
		System.out.println(bananas);
		System.out.println(pears);
		
		int batteries = 8;
		int oldBatteries = 5;
		int totalBatteries = batteries++ + ++oldBatteries;
		System.out.println("batteries: " + batteries);
		System.out.println("oldBatteries: " + oldBatteries);
		System.out.println("totalBatteries: " + totalBatteries);
	}

}