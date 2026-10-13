package Day_22;

public class Find_max 
{
    static int Find_max(int[] arr)
    {
        int max = arr[0];
        
        for(int x : arr)
        {
           if(x > max)
           {
            max = x;
           }
        }
        return max;

        
    }
    public static void main(String [] args)
    {
        int[] arr = {10, 30, 50, 70};
        System.out.println(Find_max(arr));
    }
    
}
