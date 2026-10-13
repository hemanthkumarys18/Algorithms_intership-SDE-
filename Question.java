package Day_23;

public class Question 
{
    static int evenCount(int...nums)
    {
        int count = 0;
        for(int n : nums)
        {
            if(n % 2 ==0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        System.out.println("Even number are:" +evenCount(10, 20, 30, 40));
    }
    
}
