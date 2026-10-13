
package Day_23;

public class Key
{
    static void count(int... keys)
    {
        int count = 0;
        for(int key : keys)
        {
            if(key == 20)
            {
                count++;
            }
        }
        System.out.println("Count of key 20: " + count);
    }
    public static void main(String[] args) 
    {
        count(20, 10, 30, 20, 40,20);
    }
}