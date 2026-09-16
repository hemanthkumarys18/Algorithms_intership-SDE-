package Day_17;


import java.util.Scanner;

class EvenOdd2 
{

    void check(int n) 
    {
        if (n % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        EvenOdd obj = new EvenOdd();

        obj.check(n);
    }
}