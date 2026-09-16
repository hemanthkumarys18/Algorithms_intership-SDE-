package Day_18;
import java.util.*;
public class Nonvoid 
    
{
    boolean isEven(int n)
    {
        return n % 2 == 0;
    
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();


        Nonvoid obj = new Nonvoid();

        boolean result  = obj.isEven(n);
        System.out.println(result);

    }
    
}

