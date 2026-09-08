import java.util.*;
public class Fibbanacii 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        int c;
        System.out.println(a + "," +b );
         
        for(int i = 0; i<=num-2; i++)
        {
            
            c = a+b;
            System.out.println(c+" ");
            a = b;
            b = c;

        }
    }
    
}
