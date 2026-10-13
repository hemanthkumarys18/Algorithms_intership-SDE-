package Day_22;

public class For_each 
{
    static  void traverse(int[] arr)
    {
        for(int x : arr)
        {
            System.out.print(x + ", ");

        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        traverse(arr);
        
        //traverse(new int[]{1,2,3,4,5,6}); //anonymous array
    }
    
}
