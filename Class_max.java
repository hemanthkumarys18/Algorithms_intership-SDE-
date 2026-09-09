package Day_17;

public class Class_max 
{
    static  int max(int x, int y) //x=10 y=20 --formal parameter(duplicate data)
    {
        if(x<y)
        {
            return x;
        }
        else
        {
            return y;
        }

        //scope checking
       // System.out.println(a);  -a is  not this method


    }
    public static void main(String[] args)
    {
        int a = 10; //parameter passing --send data
        int b = 20;
        int c = max(a,b); //call the method
        System.out.println(c);
    }
    
}
