package Day_18;

import java.util.Scanner;

public class EvenOdd5 
{
  //static void
    static boolean checkEvenOdd(int n)
    {
        return(n%2==0);
       
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();


        boolean result = isEven(n);
        System.out.println(result);

        if(result)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }


    }
    
}
