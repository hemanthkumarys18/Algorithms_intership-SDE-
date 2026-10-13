package Day_31;

public class LinearSearch 
{
    public static void linesrsearch(int[] array, int key)
    {
        boolean found = false; //key not found
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == key)
            {
                System.out.println("element found index:"+i);
                found = true;
                break;
            }
        }
        if(found == false)
        {
            System.out.println("element not found: ");

        }
    }
    public static void main(String[] args)
    {
        int[] array = {10, 20, 30, 40, 50};
        int key = 40;

        linesrsearch(array,key);
    }
    
}
