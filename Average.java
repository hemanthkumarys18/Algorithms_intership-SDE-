
package Day_22;

public class Average 
{

    static double Search1(int[] arr) 
    {
        int sum = 0;
        for (int x : arr) 
        {
            sum = sum + x;
        }
        double average = (double) sum / arr.length;

        return average;
    }

    public static void main(String[] args) 
    {

        int[] arr = {20, 30, 40, 50};

        System.out.println("Average = " + Search1(arr));
    }
}