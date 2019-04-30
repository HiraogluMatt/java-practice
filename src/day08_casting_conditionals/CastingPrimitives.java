package day08_casting_conditionals;
public class CastingPrimitives {
    public static void main(String[] ags) {
        //Casting double value to int
        int i = (int)3.4;
        System.out.println("i: " + i);
        System.out.println();
        
        double price = 230.50;
        int dollars = (int) price;
        System.out.println("Price: " + price);
        System.out.println("Dollars: " + dollars);
        System.out.println();
        
        //Whole numbers, byte, short, int
        
        int count = 44;
        byte byteCount = (byte)count;
        System.out.println("byteCount: " + byteCount);
        System.out.println();
        
        long longValue = 2222222L;
        int intValue = (int)longValue;
        System.out.println("intValue: " + intValue);
        System.out.println();
        
        int large = 5678;
        short small = (short) large;
        System.out.println("small: " + small);
        System.out.println();
        
        int result = (int) (500.4 / 2.0);
        System.out.println("result: " + result);
        System.out.println();
        
        byte b = 123;
        int a = b;
        System.out.println("a: " + a);
        
        //Implicit casting is done automatically, done from smaller to larger
        //Explicit has to be defined and used when going from larger to smaller.
                
    }
}
