package Day_18;

import java.util.Scanner;

public class EvenOdd3 
{
  //static void
    static void checkEvenOdd(int n)
    {
        if(n%2==0)
        {
            System.out.println("this number is even:");
        }
        else
        {
            System.out.println("this number is odd ");

        }
    }






    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();


        checkEvenOdd(n);


    }
    
}
