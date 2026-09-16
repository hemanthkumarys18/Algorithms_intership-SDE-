package Day_19;

public class MethodOverLoading 
{
    int max(byte x ,byte y)// we use int the output is 20
        {
            if(x>y)
            {
                return x;
            }else
            {
                return y;
            }
        }
        
    int max(int x ,int y)
        {
            if(x>y)
            {
                return x;
            }else
            {
                return y;
            }
        }

        float max(float x, float y)//then we use byte the run in float si the output is 20.0
        {
            
            if(x>y)
            {
                return x;
            }else
            {
                return y;
            }
        }


        int max(int x, int y, int z)
        {
            if(x >y && x >= z)
            {
                return x;
            }
            else if(y > z && y >= x)
            {
                return y;
            }
            else
            {
                return z;
            }
            }
    public static void main(String[] args)
    {
        MethodOverLoading obj = new MethodOverLoading();
        System.out.println(obj.max(10,20));
       // System.out.println(obj.max(40,50,60));
    }
    
}
