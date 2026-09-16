package Day_17;

    
}
import java.util.*;

class Add2 
{

    int add(int a, int b) 
    {
        return a + b;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Add2 obj = new Add2();

        int result = obj.add(a, b);

        System.out.println("Sum = " + result);
    }
}