package Day_22;

public class Search 
{
    static boolean Search1(int[]arr, int key,int key1)
    {
        for(int x : arr)
        {
            if(x == key && x <= key1)
            //if(x == key || x == key1)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr = { 20, 30, 40, 50};
        //Search obj=new Search();
        System.out.println(Search1(arr, 30,60));
        
    }
    
}
