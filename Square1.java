package Day_17;

import java.util.*;

class Square1 
{

    static int square(int n) 
    {
        return n * n;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Square = " + square(n));
    }
}