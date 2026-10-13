package Day_22;

public class SecondLargest 
{

    static int secondLargest(int[] arr) 
    {

        int largest =arr[0];
        int second = 0;

        for (int x : arr) {

            if (x > largest) 
            {
                second = largest;
                largest = x;
            }
            else if (x > second && x < largest) 
            {
                second = x;
            }
        }

        return second;
    }

    public static void main(String[] args) 
    {

        int[] arr = {10, 50, 30, 40, 20};

        System.out.println("Second largest = " + secondLargest(arr));
    }
}
    

