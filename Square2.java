package Day_17;

import java.util.*;

class Square2 
{

    int square(int n) 
    {
        return n * n;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        Square2 obj = new Square2();

        System.out.println("Square = " + obj.square(n));
    }
}