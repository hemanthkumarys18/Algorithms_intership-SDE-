
package Day_22;

public class CountElements 
{

    static void countElements(int[] arr) 
    {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int x : arr) 
        {
            if (x > 0) 
            {
                positive++;
            } 
            else if (x < 0) 
            {
                negative++;
            } else 
            {
                zero++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
        System.out.println("Total elements: " + arr.length);
    }

    public static void main(String[] args) 
    {
        int[] arr = {10, 20, -30, 0, -18};

        countElements(arr);
    }
}