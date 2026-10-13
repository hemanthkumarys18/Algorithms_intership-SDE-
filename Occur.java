
package Day_22;

public class Occur 
{

    static int countOccurrences(int[] arr, int key) 
    {
        int count = 0;

        for (int x : arr) 
        {
            if (x == key) 
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 20, 50};
        int key = 20;

        System.out.println("Number occurs " + countOccurrences(arr, key) + " times");
    }
}