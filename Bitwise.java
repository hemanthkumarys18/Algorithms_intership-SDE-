public class Bitwise 
{
    public static void main(String[] args)
    {
        int x = 12;
        int y = 10;
        int z;

        System.out.println("AND :" +(x & y));
        System.out.println("OR :" +(x | y));
        System.out.println("XOR :" +(x ^ y));
        System.out.println("NOT Y :" +(~y));
        System.out.println("AND :" +(x & y));

        System.out.println("Left shift");
        int a = 10;
        System.out.println("shift by 1 :" +(a << 1));
        System.out.println("shift by 2 places :" +(a << 2));
        System.out.println("shift by 3 places :" +(a << 3));

        System.out.println("right shift");
        int b = 60;
        System.out.println("right by 1 :" +(b >> 1));
        System.out.println("right by 2 places :" +(b >> 2));
        System.out.println("right by 3 places :" +(b >> 3));

        System.out.println(" Unsigned right shift");
        int c = -20;
        System.out.println("unsigned right by 1 :" +(c >>> 1));
        System.out.println("unsigned right by 2 places :" +(c >>> 2));
        System.out.println(" unsigned right by 3 places :" +(c >>> 3));



    }
    
}
