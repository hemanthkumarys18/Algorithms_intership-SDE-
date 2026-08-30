public class Type_Conversion 
{
    public static void main(String[] args)
    {
        byte a = 10;
        byte b = 20;

        //byte c =a+b;   ->>wrong, lossy conversion

        int c = a+b;
        System.out.println("byte and byte :"  +c);


        // byte to short
        byte d = 10;
        short e = 20;

        

        int f = d+e;
        System.out.println("byte and short :"  +f);

        //short and short
        short g = 10;
        short h = 20;


        int i = g+h;
        System.out.println("short and short :"  +i);


        //byte and char

        byte j = 10;
        char k = 20;


        int m = j+k;
        System.out.println("byte and char :"  +m);

        //char to char

        char n = 10;
        char o = 20;

        int p = n+o;
        System.out.println("char + char :"  +p);

        //int to int 

        int q = 10;
        int r = 20;

        

        int s = q+r;
        System.out.println(s);

        //int and long

        int t = 10;
        long v = 20;

        long u = t+v;
        System.out.println("int and long :"  +u);

        //long and float

        long x = 10;
        float y = 20;

        

        double z = x+y;
        System.out.println("long and float :"  +z);


        //float and double

        float A = 10;
        double B = 20;

        double C = A+B;
        System.out.println("float and double :"  +C);
    }    
}
