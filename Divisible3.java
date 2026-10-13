
package Day_22;

public class Divisible3 
{

    static void Divisible(int[] arr) 
    {

        for (int x : arr) 
        {
            if (x % 3 == 0) 
            {
                System.out.println(x);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {20, 30, 40, 50};

        System.out.println("Numbers divisible by 3:");

        Divisible(arr);
    }
}