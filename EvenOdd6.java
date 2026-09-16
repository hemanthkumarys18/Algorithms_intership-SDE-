package Day_18;

import java.util.Scanner;

public class EvenOdd6 
{
    void checkEvenOdd(int n)
    {
        if(n%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }





    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();


        InstanceVoid obj = new InstanceVoid();

        obj.checkEvenOdd(n);

    }
    
}
